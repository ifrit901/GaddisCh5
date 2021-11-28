package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is program challenge #10.
 * The profit from the sale of stock can be calculated as follows:
 * 
 * Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
 * 
 * where NS is the number of shares, PP is the purchase price per share, 
 * PC is the purchase commission paid, SP is the sale price per share, 
 * and SC is the sale commission paid. If the calculation yields a positive
 * value, then the sale of the stock resulted in a profit. If the calculation
 * yields a negative number, then the sale resulted in a loss. 
 * 
 * Write a method that accepts as arguments the number of shares, the 
 * purchase price per share, the purchase commission paid, the sale price
 * per share, and the sale commission paid. The method should return the 
 * profit (or loss) from the sale of stock. Demonstrate the method in a 
 * program that asks the user to enter the necessary data and displays 
 * the amount of profit or loss. 
 * 
 * @author craig
 */
public class StockProfit {
	public static void main(String [] args) {
		double numberOfShares,
		       purchasePrice,
		       purchaseCommission,
		       salePrice,
		       saleCommission,
		       total;

		String input,
		       output = "The stock price is: ";

		// Greet the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "This program will calculate the"
			+ " profit or loss of a stock's price. \nYou will need to "
			+ "enter the number of shares, the purchase price per share,\n"
			+ "the purchase commission paid, the sale price per share,\n"
			+ "and the sale commission paid. A negative result represents a loss.");

		// Start prompting for user input
		input = JOptionPane.showInputDialog(null, "How many shares are there?");
		numberOfShares = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the purchase price per share?");
		purchasePrice = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "How much commission was paid?");
		purchaseCommission = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "How much was the sale price per share?");
		salePrice = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "How much was the sale commission paid?");
		saleCommission = Double.parseDouble(input);

		// Call the profit method
		total = profit(numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission);

		// Display the results
		JOptionPane.showMessageDialog(null, "The total profit/loss of the stock is $" + total);

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
	 */
	public static double profit (double numberOfShares, double purchasePrice, double purchaseCommission, 
					double salePrice, double saleCommission) {
		double profit = ((numberOfShares * salePrice) - saleCommission) - ((numberOfShares * purchasePrice) + purchaseCommission);
		return profit;
		
	}
}
