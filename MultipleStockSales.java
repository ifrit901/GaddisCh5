package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is programming challenge #11.
 * Use the method that you wrote in programming challenge 10 (Stock Profit) in
 * a program that calculates the total profit or loss from the sale of multiple 
 * stocks. The program should ask the user for the number of stock sales, 
 * and the necessary data for each stock sale. It should accumulate the profit
 * or loss for each stock sale and then display the total. 
 * 
 * @author craig
 */
public class MultipleStockSales {
	public static void main (String [] args) {
		// Variables
		double numberOfShares,
		       purchasePrice,
		       purchaseCommission,
		       salePrice,
		       saleCommission,
		       grandTotal = 0.0,
		       total;

		String input,
		       answer = "yes";

		// Greet the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "This program will "
			+ "calculate the"
			+ " profit or loss of a stock's price. \nYou will need "
			+ "to "
			+ "enter the number of shares, the purchase price per "
			+ "share,\n"
			+ "the purchase commission paid, the sale price per "
			+ "share,\n"
			+ "and the sale commission paid. A negative result "
			+ "represents a loss.");

		while(answer.equals("yes") || answer.equals("Yes")) {
			// Start prompting for user input
			input = 
			JOptionPane.showInputDialog
			(null, "How many shares are there?");
			numberOfShares = Double.parseDouble(input);
	
			input = JOptionPane.showInputDialog
			(null, "What is the purchase price per share?");
			purchasePrice = Double.parseDouble(input);
	
			input = JOptionPane.showInputDialog
			(null, "How much commission was paid?");
			purchaseCommission = Double.parseDouble(input);
	
			input = JOptionPane.showInputDialog
			(null, "How much was the sale price per share?");
			salePrice = Double.parseDouble(input);
	
			input = JOptionPane.showInputDialog
			(null, "How much was the sale commission paid?");
			saleCommission = Double.parseDouble(input);
	
			// Call the profit method
			total = profit(numberOfShares, purchasePrice, 
				purchaseCommission, salePrice, saleCommission);
	
			// Display the results
			JOptionPane.showMessageDialog
			(null, "The profit/loss for this stock sale is $" 
				+ total);
	
			grandTotal += total;
	
			answer = JOptionPane.showInputDialog
			(null, "Do you want to calculate the results for "
				+ " another stock sale?");
		}

		//Display the total results
		JOptionPane.showMessageDialog
		(null, "The total profit/loss for all the stock sales is "
			+ grandTotal);

	}	
	/**
	 * The profit method takes in all the variables input by the user and 
	 * calculates the total profit or loss of the stock value. A negative
	 * value indicates a loss. 
	 * @param numberOfShares The number of shares purchased.
	 * @param purchasePrice The cost of each share.
	 * @param purchaseCommission The commission paid for buying the stock.
	 * @param salePrice The price for each share sold.
	 * @param saleCommission The commission paid for selling the stock.
	 * @return The total profit or loss of the sale.
	 */
	public static double profit (double numberOfShares, 
					double purchasePrice, 
					double purchaseCommission, 
					double salePrice, double saleCommission) 
	{
		double profit = 
			((numberOfShares * salePrice) - saleCommission) - 
			((numberOfShares * purchasePrice) + purchaseCommission);
		return profit;
		
	}
}
