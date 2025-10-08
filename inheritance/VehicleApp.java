package inheritance;

class Vehicle {
 public void move() {
     System.out.println("Vehicle is moving.");
 }
}

class Car extends Vehicle {
 public void fuelType() {
     System.out.println("Car uses petrol/diesel/electric.");
 }
}


public class VehicleApp {
 public static void main(String[] args) {
     Car car = new Car();
     
     car.move();      
     car.fuelType();  
 }
}
