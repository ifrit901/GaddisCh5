package ch5java6thedition;
import java.util.Scanner;        // For the Scanner class
import java.io.*;                // For the I/O classes
import javax.swing.JOptionPane;  // For the JOptionPane class
/**
 * Code Listing 5.12
 * This example demonstrates the use of methods to functionally
 * decompose a program into component parts. It opens a file 
 * containing the sales for a store for 30 days. It calculates and 
 * displays the total sales and the average daily sales.
 * 
 * @author craig
 */
public class CodeListing5_12 {
	// Java IO is imported, so don't forget to add a throws clause
	public static void main (String [] args) throws IOException {
		// Variables
		final int NUM_DAYS = 30;   // Number of days of sales
		String fileName;           // To hold the file name
		double totalSales;         // Total sales for the period
		double averageSales;       // Average daily sales

		// Prompt user for file name
		fileName = getFileName();

		// Prompt user for total sales
		totalSales = getTotalSales(fileName);

		// Calculate the average
		averageSales = totalSales / NUM_DAYS;

		// Display the total and average
		displayResults(totalSales, averageSales);

		System.exit(0);
	}	

	/**
	 * The getFileName method prompts the user for the name of the file
	 * that has the sales totals in it.
	 * @return A reference to a String object containing the name of the file.
	 */
	public static String getFileName(){
		String file;    // To hold the file name
		
		// Prompt user to enter the file namej
		file = JOptionPane.showInputDialog(null, "Please enter the name of the file\n"
			+ " that has the sales for 30 days in it.");

		// Return the name
		return file;
	}

	/**
	 * The getTotalSales method opens a file and reads the daily total sales
	 * amounts, accumulating the total. The total is returned. 
	 * @param filename The name of the file to be opened.
	 * @return The total of the sales amounts.
	 */
	public static double getTotalSales(String filename) throws IOException{
		double total = 0.0;   // An accumulator double variable set to zero
		double sales;         // A daily sales amount

		// Open the file by creating a File class object
		// with the file name passed to the method as an 
		// argument
		File file = new File(filename);

		// Read the File object with a Scanner object
		Scanner inputFile = new Scanner(file);
		
		
		// Use a loop to read the values from the file and add them 
		// to the accumulator.
		while (inputFile.hasNext()){
			// Read a double from the file
			sales = inputFile.nextDouble();

			// Add the sales to the accumulator
			total += sales;
		}

		// Close the file
		inputFile.close();

		// Return the total
		return total;
	}
	
	/**
	 * The displayResults method takes the results from getTotalSales
	 * and the average daily sales calculated in the main method and 
	 * displays them in a formatted JOptionPane box.
	 * @param total The total sales from all the days.
	 * @param avg The average daily sales.
	 */
	public static void displayResults(double total, double avg) {
		// Display the total and average sales for the period
		JOptionPane.showMessageDialog(null, "The total sales for the period was \n"
			+ "$" + String.format("%,.2f", total) + ", the average daily sale was \n"
			+ "$" + String.format("%,.2f", avg)); 
	}
}
