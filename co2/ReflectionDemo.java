public class Product {
    public void showDetails() {
        System.out.println("Product: Laptop, Price: ₹75,000");
    }
}

// ReflectionDemo.java
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Load class dynamically
            Class<?> clazz = Class.forName("Product");

            // Create instance
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Get method
            java.lang.reflect.Method method = clazz.getMethod("showDetails");

            // Invoke method
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
