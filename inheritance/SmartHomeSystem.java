package inheritance;

//Base class
class Appliance {
 public void turnOn() {
     System.out.println("Appliance turned on.");
 }
}

//Fan inherits Appliance
class Fan extends Appliance {
 public void rotate() {
     System.out.println("Fan is rotating.");
 }
}

//CeilingFan inherits Fan
class CeilingFan extends Fan {
 public void setSpeed(int speed) {
     System.out.println("Ceiling fan speed set to " + speed);
 }
}

//Testing
public class SmartHomeSystem {
 public static void main(String[] args) {
     CeilingFan ceilingFan = new CeilingFan();

     ceilingFan.turnOn();      // From Appliance
     ceilingFan.rotate();      // From Fan
     ceilingFan.setSpeed(3);  // From CeilingFan
 }
}
