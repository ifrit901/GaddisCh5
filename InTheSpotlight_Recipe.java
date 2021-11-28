package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * In the Spotlight recipe program that converts cups to fluid ounces.
 * It is also Code Listing 5.10.
 * 
 * @author craig
 */
public class InTheSpotlight_Recipe {
	public static void main (String [] args) {
		// Variables
		double cups;   // To hold the number of cups
		double ounces; // To hold the number of ounces

		// Prompt the user for the number of cups
		cups = getCups();

		// Convert the cups to fluid ounces
		ounces = cupsToOunces(cups);

		// display the results
		displayResults(cups, ounces);
		System.exit(0);
	}	

	/**
	 * The getCups method prompts the user to enter the number of cups
	 * @return The number of cups returned by the user.
	 */
	public static double getCups() {
		String input;    // To hold input
		double numCups;  // To hold the number of cups

		// Get the number of cups from the user
		input = JOptionPane.showInputDialog(null, "This program converts measurements\n"
			+ " in cups to fluid ounces. For your\n"
			+ " reference the formula is: \n"
			+ "	1 cup = 8 fluid ounces\n\n"
			+ " Enter the number of cups:");

		// Convert the input to a double
		numCups = Double.parseDouble(input);

		// Return the number of cups
		return numCups;
	}

	/**
	 * The cupsToOunces method converts the number of cups to fluid ounces
	 * using the formula:
	 * 1 cup = 8 fluid ounces
	 * @param numCups The number of cups to convert.
	 * @return The number of ounces.
	 */

	public static double cupsToOunces (double numCups) {
		return numCups * 8.0;
	}

	/**
	 * The displayResults method displays a message showing 
	 * the results of the conversion.
	 * @param cups A number of cups.
	 * @param ounces A number of ounces.
	 */
	public static void displayResults(double cups, double ounces) {
		// Display the number of ounces
		JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces +
			" fluid ounces.");
	}
}
