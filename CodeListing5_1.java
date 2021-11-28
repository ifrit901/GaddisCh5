package ch5java6thedition;

/**
 * Code Listing 5.1 defines and calls a simple method.
 * 
 * @author craig
 */
public class CodeListing5_1 {
	public static void main (String [] args) {
		System.out.println("Hello, from the main method!");

		displayMessage();	

		System.out.println("Now back in the main method.");
	}	

	// Method definition is after the  main method but inside the 
	// class.
	public static void displayMessage() {
		System.out.println("Waddup from the displayMessage method.");
	}
}
