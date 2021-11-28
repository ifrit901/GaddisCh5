package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is programming challenge #4.
 * A painting company has determined that for every 115 square feet of wall
 * space, one gallon of paint and 8 hours of labor will be required. The 
 * company charges $18.00 an hour for labor. Write a program that allows the 
 * user to enter the number of rooms to be painted and the price of the paint
 * per gallon. It should also ask for the square feet of wall space in each 
 * room. The program should have methods that return the following data:
 * 
 * - The number of gallons of paint required.
 * - The hours of labor required.
 * - The cost of the paint.
 * - The total cost of the paint job.
 * 
 * Then it should display the data on the screen. 
 * 
 * @author craig
 */
public class PaintJobEstimator {
	public static void main (String [] args) {
		// Variables
		int     rooms,
			gallons,
			laborHours,
			squareFeet;

		String input;  // To hold JOptionPane input

		final double LABOR = 18.00;	
		      double pricePerGallon,
			     paintCost;
		      
		// Prompt user for the number of rooms to be painted
		input = JOptionPane.showInputDialog(null, "How many rooms will be painted?");

		// Convert input to int
		rooms = Integer.parseInt(input);

		// Prompt user for price per gallon
		input = JOptionPane.showInputDialog(null, "What is the price per gallon of paint?");

		// Convert to double
		pricePerGallon = Double.parseDouble(input);

		// Prompt user for square feet of walls
		input = JOptionPane.showInputDialog(null, "What is the general square footage of "
			+ " the walls in each room?");

		// Convert to int 
		squareFeet = Integer.parseInt(input);
		squareFeet *= rooms;

		// Start calling methods
		gallons = numberOfGallons(squareFeet);

		// Assign numberOfHours result to laborHours
		laborHours = numberOfHours(squareFeet);

		// Assign the cost of the paint to paintCost
		paintCost = costOfPaint(gallons, pricePerGallon);

		addItAllUp(paintCost, gallons, laborHours, LABOR);
	}	

	/**
	 * The numberOfGallons method calculates and returns the number of gallons
	 * needed to paint all the rooms.
	 * @param area The number of square feet of wall.
	 * @return The number of gallons to paint everything.
	 */
	public static int numberOfGallons (int area) {
		int gallons = (area / 115) + 1;
		return gallons;
	}
		
	/**
	 * The numberOfHours method calculates and returns the number of hours
	 * needed to paint all the rooms.
	 * @param area The number of square feet of wall.
	 * @return The number of hours of labor needed. 
	 */
	public static int numberOfHours(int area) {
		int hours = (area / 115) * 8;
		return hours;
	}

	/**
	 * The costOfPaint method calculates and returns the price of the paint 
	 * used based on the price per gallon and the number of gallons needed.
	 * @param gallons The number of gallons needed.
	 * @param cost The price per gallon. 
	 * @return The price of all the paint.
	 */
	public static double costOfPaint (int gallons, double cost) {
		double paintPrice = gallons * cost;
		return paintPrice;
	}

	/**
	 * The addItAllUp method calculates and displays the result of the 
	 * total cost of the paint job.
	 * @param gallons The number of gallons
	 * @param laborHours The number of labor hours
	 * @param paintCost The price of the paint
	 * @param LABOR The hourly labor rate
	 */
	public static void addItAllUp (double paintCost, int gallons, int laborHours, double LABOR) {
		String output = "";
		double laborCost,
			totalCost;

		// Append the paint cost to output
		output += "\nThe price of the paint will be $" + paintCost;

		// Append the number of gallons to output
		output += "\nThe number of gallons needed is " + gallons;

		// Append the number of hours to output
		output += "\nThe number of hours of labor needed is " + laborHours;

		// Calculate the labor cost and append it to output
		laborCost = laborHours * LABOR;
		output += "\nThe labor cost is $" + laborCost;

		// Calculate the total cost
		totalCost = laborCost + paintCost;  

		// Append the total cost to output
		output += "\nThe total cost of the paint job is $" + totalCost;

		// Display results
		JOptionPane.showMessageDialog(null, output);
	}

}

