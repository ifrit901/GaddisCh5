package ch5java6thedition;

/**
 * Code listing 5.6, arguments are passed to methods by value.
 * 
 * @author craig
 */
public class CodeListing5_6 {
	public static void main (String [] args) {
		int number = 99;   // number starts at 99

		// Display the value in 'number'
		System.out.println("The value in number is " + number);

		// Call changeMe, passing the value in number as an argument
		changeMe(number);

		// Display the value in number again
		System.out.println("The value in number is " + number);

	}	

	// The changeMe method accepts an argument and then changes the value
	// of the parameter.
	public static void changeMe(int myValue) {
		System.out.println("I am now changing the value in number:");

		myValue = 0;

		// Display the changed value
		System.out.println("The value in number is now " + myValue);
		
	}
}
