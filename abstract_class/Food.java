package abstract_class;

abstract class FoodOrder {
    String orderId;
    String customerName;

    // Abstract method
    public abstract double calculateTotal();

    // Concrete method
    public void generateBill() {
        System.out.println("Generating bill for Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

class RestaurantOrder extends FoodOrder {
    double itemTotal = 500;
    double tax = 0.18;

    @Override
    public double calculateTotal() {
        return itemTotal + (itemTotal * tax); // 18% tax
    }
}

class CloudKitchenOrder extends FoodOrder {
    double itemTotal = 500;
    double packagingFee = 30;
    double discount = 50;

    @Override
    public double calculateTotal() {
        return itemTotal + packagingFee - discount;
    }
}
public class Food{
	public static void main(String args[]) {
		FoodOrder order = new RestaurantOrder();
        order.orderId = "FO123";
        order.customerName = "Alice";
        order.generateBill();
	}
}