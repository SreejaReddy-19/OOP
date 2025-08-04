package basic_concepts;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intValue = 123456789;      
	        long longValue = intValue;     
	        float floatValue = longValue;  
	        System.out.println("Original int value   : " + intValue);
	        System.out.println("Converted to long    : " + longValue);
	        System.out.println("Converted to float   : " + floatValue);
	        if (intValue == (int) floatValue) {
	            System.out.println("\nNo data lost during conversion.");
	        } else {
	            System.out.println("\nData may be lost during conversion.");
	        }

	}

}
