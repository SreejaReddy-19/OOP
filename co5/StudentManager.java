import java.util.*;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        students.add(1, "David");

        students.remove("Charlie");

        boolean hasBob = students.contains("Bob");

        System.out.println("Total students: " + students.size());

        System.out.println("Student List: " + students);
        System.out.println("Is Bob in the list? " + hasBob);
    }
}
