import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();

        quantities.add(10);
        quantities.add(20);
        quantities.add(15);

        quantities.set(1, 25); 

        int total = 0;
        for (int qty : quantities) {
            total += qty;
        }

        System.out.println("Product Quantities: " + quantities);
        System.out.println("Total Quantity: " + total);

        quantities.clear();
        System.out.println("Inventory cleared: " + quantities);
    }
}
