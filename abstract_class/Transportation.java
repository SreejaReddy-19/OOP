package abstract_class;

abstract class TransportBooking {
    String passengerName;

    public abstract double calculateFare(double distance);

    public void bookTicket() {
        System.out.println("Ticket booked for: " + passengerName);
    }
}

class BusBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return distance * 5; // ₹5 per km
    }
}

class TrainBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return distance * 3; // ₹3 per km
    }
}

class FlightBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return distance * 10 + 500; // ₹10 per km + ₹500 airport fee
    }
}
public class Transportation{
	public static void main(String args[]) {
		TransportBooking booking = new FlightBooking();
        booking.passengerName = "Bob";
        booking.bookTicket();
        System.out.println("Fare: ₹" + booking.calculateFare(200));
	}
}