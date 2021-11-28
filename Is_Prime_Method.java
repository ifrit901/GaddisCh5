package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * Programming challenge #13
 * A prime number is a number that is evenly divisible only by itself and one. 
 * For example, the number 5 is prime because it can only be evenly divided
 * by 1 and 5. The number 6, however, is not prime because it can be evenly 
 * divided by 1, 2, 3, and 6. 
 * Write a method named isPrime, which takes an integer as an argument and 
 * returns true if the argument is a prime number, or false otherwise. Demonstrate 
 * the method in a complete program. 
 * 
 * @author craig
 * 
 * Tip: Recall that the % operator divides one number by another number and 
 * returns the remainder of the division. In an expression such as num1 % num2, 
 * the % operator will return 0 if num1 is evenly divisible by num2.
 * 
 */
public class Is_Prime_Method {
	public static void main(String [] args){
		// Variables
		int     num1,
			num2 = 2;
		
		boolean	result;

		String input;

		// Prompt the user for a number to test for primeness
		input = JOptionPane.showInputDialog(null, "This program will test a "
			+ " number to see if it is a prime number or not. \n\nEnter a "
			+ " number and I'll tell you if it's prime or not:");
		num1 = Integer.parseInt(input);
		
		result = isPrime(num1);

		// Display the results
		if (result == true) {
			JOptionPane.showMessageDialog(null, "The number " + num1 + " is"
				+ " a prime number.");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number " + num1 + " is"
				+ " not a prime number.");
		}
	}	
	/**
	 * The isPrime method accepts an integer variable and returns true if
	 * the number is prime, otherwise false.
	 * @param number The number to be tested for primeness. 
	 * @return Boolean value.
	 */
	public static boolean isPrime (int number) {
		boolean prime = true;
		int     remainder,
		        total = 0;

		// Loop through all the odd numbers 1 - number to check for 
		// remainders
		for (int i = 1; i <= number; i++) {
			remainder = number % i;

			if (remainder == 0) // This is to keep from going through
				total++;    // extra numbers unecessarily
			break;
				
		}
		if (total > 2) {
			prime = false;
		}
		return prime;	
	}
}
