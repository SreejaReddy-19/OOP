package basic_concepts;
import java.util.Scanner;
public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a double value: ");
	        double doubleValue = scanner.nextDouble();
	        int intValue = (int) doubleValue;
	        System.out.println("\nConversion Result");
	        System.out.println("Original double value: " + doubleValue);
	        System.out.println("Converted int value  : " + intValue);

	        scanner.close();
	}

}
