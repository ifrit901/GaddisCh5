package ch5java6thedition;

/**
 * This example demonstrates hierarchical method calling
 * 
 * @author craig
 */
public class CodeListing5_4 {
	public static void main(String [] args) {
		System.out.println("Starting in main()...");

		// Now deep() is called
		deep();

		// Main is returned to 
		System.out.println("Now back in main().");
	}

	// The deep() method displays a message and then calls deeper().
	public static void deep() {
		System.out.println("\tNow we are in deep().");
		deeper();
		System.out.println("\tNow back in deep().");
	}

	// Deeper() just displays a message
	public static void deeper() {
		System.out.println("\t\tMade it to deeper()!");
	}
}
