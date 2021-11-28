package ch5java6thedition;

/**
 * Code Listing 5.8.
 * This program demonstrates how variables inside two different methods can
 * have the same name because they are outside each other's scope.
 * 
 * @author craig
 */
public class CodeListing5_8 {
	public static void main (String [] args) {
		// Two method calls
		texas();
		california();
	}	

	// The texas() method has a variable named 'birds'
	public static void texas() {
		int birds = 3500;
		System.out.println("In Texas, there are " + birds + " birds.");
	}

	// The california method also has a variable named 'birds'
	public static void california() {
		int birds = 3500;
		System.out.println("In California, there are " + birds + " birds.");
	}
}
