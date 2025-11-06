import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface APIDescription {
    String description();
}

// SampleAPI.java
@APIDescription(description = "Handles user operations")
public class SampleAPI {

    @APIDescription(description = "Fetches user by ID")
    public void getUser() {
        System.out.println("User fetched");
    }
}

// AnnotationReader.java
import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("SampleAPI");

            // Class-level annotation
            if (clazz.isAnnotationPresent(APIDescription.class)) {
                APIDescription desc = clazz.getAnnotation(APIDescription.class);
                System.out.println("Class Description: " + desc.description());
            }

            // Method-level annotations
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(APIDescription.class)) {
                    APIDescription desc = method.getAnnotation(APIDescription.class);
                    System.out.println("Method: " + method.getName() + ", Description: " + desc.description());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
