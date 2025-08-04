package basic_concepts;
import java.util.Scanner;
public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter roll number: ");
	        String rollNumber = scanner.nextLine();
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        System.out.print("Enter gender (M/F): ");
	        char gender = scanner.next().charAt(0);
	        System.out.print("Enter percentage: ");
	        double percentage = scanner.nextDouble();
	        System.out.println("\n--- Student Details ---");
	        System.out.printf("Name       : %s%n", name);
	        System.out.printf("Roll Number: %s%n", rollNumber);
	        System.out.printf("Age        : %d%n", age);
	        System.out.printf("Gender     : %c%n", gender);
	        System.out.printf("Percentage : %.2f%%%n", percentage);
	        scanner.close();
	}

}
