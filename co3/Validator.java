import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotEmpty {}

// Customer.java
public class Customer {
    @NotEmpty
    public String name = ""; // Simulate empty field

    public String email = "user@example.com";
}

// Validator.java
import java.lang.reflect.Field;

public class Validator {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        Class<?> clazz = customer.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true);
                Object value = field.get(customer);
                if (value == null || value.toString().trim().isEmpty()) {
                    System.out.println("Warning: Field '" + field.getName() + "' must not be empty.");
                }
            }
        }
    }
}
