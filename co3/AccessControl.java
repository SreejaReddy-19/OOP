import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    String role();
}

public class UserService {
    @RoleAllowed(role = "ADMIN")
    public void deleteUser() {
        System.out.println("User deleted.");
    }

    @RoleAllowed(role = "USER")
    public void viewProfile() {
        System.out.println("Profile viewed.");
    }
}

import java.lang.reflect.Method;

public class AccessControl {
    public static void main(String[] args) throws Exception {
        String currentRole = "USER"; 
        UserService service = new UserService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.role().equals(currentRole)) {
                    System.out.println("Access granted to: " + method.getName());
                    method.invoke(service);
                } else {
                    System.out.println("Access denied to: " + method.getName());
                }
            }
        }
    }
}
