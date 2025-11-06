import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Loggable {
    String message();
}

// AccountService.java
public class AccountService {
    @Loggable(message = "Checking account balance")
    public void checkBalance() {
        System.out.println("Balance: ₹10,000");
    }

    @Loggable(message = "Transferring funds")
    public void transferFunds() {
        System.out.println("Funds transferred.");
    }
}

// AuditLogger.java
import java.lang.reflect.Method;

public class AuditLogger {
    public static void main(String[] args) throws Exception {
        AccountService service = new AccountService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Loggable.class)) {
                Loggable log = method.getAnnotation(Loggable.class);
                System.out.println("LOG: " + log.message());
                method.invoke(service);
            }
        }
    }
}
