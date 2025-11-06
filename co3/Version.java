import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Version {
    String number();
}

// ReportGenerator.java
@Version(number = "1.2")
public class ReportGenerator {
    public void generate() {
        System.out.println("Report generated.");
    }
}

// VersionReader.java
public class VersionReader {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReportGenerator");

        if (clazz.isAnnotationPresent(Version.class)) {
            Version version = clazz.getAnnotation(Version.class);
            System.out.println("Class Version: " + version.number());
        }
    }
}
