package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is #2 in the programming challenges.
 * Write a program that asks the user to enter an item's wholesale cost and 
 * its markup percentage. It should then display the item's retail price. For example:
 * 
 * - If an item's wholesale cost is 5.00 and its markup percentage is 100 percent, 
 *   then the item's retail is 10.00. 
 * - If an item's wholesale cost is 5.00 and its markup percentage is 50 percent, 
 *   then the item's retail is 7.50. 
 * 
 * The program should have a method called calculateRetail that receives the 
 * wholesale cost and the markup percentage as arguments, and returns the retail
 * price of the item.
 * 
 * @author craig
 */
public class RetailPriceCalculator {
	public static void main (String [] args) {
		// Variables
		double         wholeSale,
				  retail,
			markupPercentage;
		String 		   input;      // To hold JOptionPane entries

		// Prompt user for wholesale cost
		input = JOptionPane.showInputDialog(null, "What is the item's "
			+ " wholesale cost?");

		// Convert String input to double
		wholeSale = Double.parseDouble(input);

		// Prompt user for the item's markup percentage
		input = JOptionPane.showInputDialog(null, "What is the item's "
			+ " markup percentage?");

		// Convert String input to double
		markupPercentage = (Double.parseDouble(input)) / 100;

		// Call the calculateRetail method
		retail = calculateRetail(wholeSale, markupPercentage);

		JOptionPane.showMessageDialog(null, "The final retail price of the "
			+ " item is $" + String.format("%,.2f", retail));
	}	

	/**
	 * The calculateRetail method accepts an item's wholesale price and 
	 * markup percentage and displays the item's retail price. 
	 * @param wSale The wholesale price.
	 * @param mPercent The markup percentage.
	 * @return The retail price.
	 */
	
	public static double calculateRetail(double wSale, double mPercent) {
		double cost = wSale + (wSale * mPercent);
		return cost;
	}
}
