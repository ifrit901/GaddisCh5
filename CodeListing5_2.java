package ch5java6thedition;

/**
 * Code listing 5.2, a method is called inside a loop.
 * 
 * @author craig
 */
public class CodeListing5_2 {
	public static void main (String [] args) {
		System.out.println("Hello from the main method!");

		// Loop to call the displayMessage five times.
		for (int i = 0; i < 5; i++) {
			displayMessage();	
		}

	}

	public static void displayMessage() {
		System.out.println("Waddup from inside the displayMessage method.");
	}
}
