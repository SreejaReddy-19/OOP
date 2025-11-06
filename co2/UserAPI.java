import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface APIInfo {
    String endpoint();
    String method();
}

// UserAPI.java
public class UserAPI {

    @APIInfo(endpoint = "/users", method = "GET")
    public void getUsers() {}

    @APIInfo(endpoint = "/users", method = "POST")
    public void createUser() {}

    @APIInfo(endpoint = "/users/{id}", method = "DELETE")
    public void deleteUser() {}
}

// APIDocumentationGenerator.java
import java.lang.reflect.Method;

public class APIDocumentationGenerator {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("UserAPI");

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(APIInfo.class)) {
                    APIInfo info = method.getAnnotation(APIInfo.class);
                    System.out.println("Endpoint: " + info.endpoint() + ", Method: " + info.method());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
