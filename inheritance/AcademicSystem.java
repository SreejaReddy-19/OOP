package inheritance;

class Person {
    public void displayInfo() {
        System.out.println("Displaying person information.");
    }
}

class Student extends Person {
    private String studentID;

    public Student(String id) {
        this.studentID = id;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String id) {
        super(id);
    }

    public void submitThesis() {
        System.out.println("Graduate student submitting thesis.");
    }
}

// Testing
public class AcademicSystem {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("GS123");
        gradStudent.displayInfo();  // Displays info including student ID
        gradStudent.submitThesis(); // Graduate-specific action
    }
}

