package ch5java6thedition;

/**
 * Code Listing 5.9
 * This demonstrates a value-returning method.
 * 
 * @author craig
 */
public class CodeListing5_9 {
	public static void main (String [] args) {
		int     total,
			value1 = 20,  
			value2 = 40;

		// Call the sum method, passing the values in value1 and 
		// value2 as arguments. Assign the return value to the 'total'
		// variable. 
		total = sum(value1, value2);
		
		System.out.println("The value of " + value1 + " plus " + value2 + " is " + total);
	}	
	
	/**
	 * The sum method returns the sum of its two parameters. 
	 * @param num1 The first number to be added.
	 * @param num2 The second number to be added.
	 * @return  The sum of num1 and num2.
	 */
	public static int sum(int num1, int num2) {

	int result;   // result is a local variable
		result = num1 + num2;

		// Return the value in the result variable
		return result;
	}
}
