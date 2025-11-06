interface Plan {
    void getRate();
    void calculateBill(int units);
}

// Step 2: Concrete classes
class ResidentialPlan implements Plan {
    private double rate;
    public void getRate() {
        rate = 3.5;
    }
    public void calculateBill(int units) {
        System.out.println("Residential Bill: " + (units * rate));
    }
}

class CommercialPlan implements Plan {
    private double rate;
    public void getRate() {
        rate = 7.5;
    }
    public void calculateBill(int units) {
        System.out.println("Commercial Bill: " + (units * rate));
    }
}

class IndustrialPlan implements Plan {
    private double rate;
    public void getRate() {
        rate = 10.0;
    }
    public void calculateBill(int units) {
        System.out.println("Industrial Bill: " + (units * rate));
    }
}

// Step 3: Factory class
class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) return null;
        switch (planType.toLowerCase()) {
            case "residential": return new ResidentialPlan();
            case "commercial": return new CommercialPlan();
            case "industrial": return new IndustrialPlan();
            default: return null;
        }
    }
}

// Step 4: Client code
public class ElectricityBill {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();
        Plan plan = factory.getPlan("Commercial");
        plan.getRate();
        plan.calculateBill(150); // Example: 150 units
    }
}
