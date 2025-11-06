interface Courier {
    void deliver();
}

// Step 2: Concrete courier classes
class BlueDart implements Courier {
    public void deliver() {
        System.out.println("Delivered by BlueDart");
    }
}

class FedEx implements Courier {
    public void deliver() {
        System.out.println("Delivered by FedEx");
    }
}

class DHL implements Courier {
    public void deliver() {
        System.out.println("Delivered by DHL");
    }
}

// Step 3: Factory class
class CourierFactory {
    public Courier getCourier(String location, String urgency) {
        if (location.equalsIgnoreCase("Metro") && urgency.equalsIgnoreCase("Fast")) {
            return new BlueDart();
        } else if (location.equalsIgnoreCase("Remote")) {
            return new DHL();
        } else {
            return new FedEx();
        }
    }
}

// Step 4: Client code
public class ShippingService {
    public static void main(String[] args) {
        CourierFactory factory = new CourierFactory();
        Courier courier = factory.getCourier("Metro", "Fast");
        courier.deliver();
    }
}
