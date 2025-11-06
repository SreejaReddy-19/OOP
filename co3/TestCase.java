import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestCase {}

// CalculatorTest.java
public class CalculatorTest {
    @TestCase
    public void testAddition() {
        System.out.println("Addition passed.");
    }

    @TestCase
    public void testSubtraction() {
        System.out.println("Subtraction passed.");
    }

    public void helperMethod() {
        System.out.println("Helper method, not a test.");
    }
}

// TestRunner.java
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        CalculatorTest test = new CalculatorTest();
        Class<?> clazz = test.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TestCase.class)) {
                System.out.println("Running test: " + method.getName());
                method.invoke(test);
            }
        }
    }
}
