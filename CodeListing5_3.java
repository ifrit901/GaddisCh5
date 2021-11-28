package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * Code Listing 5.3. This program uses two void methods and uses JOption panes.
 * 
 * @author craig
 */
public class CodeListing5_3 {
	public static void main (String [] args){
		// Variables
		double salary;      // Annual salary
		int creditRating;   // Credit rating
		String input;       // To hold the user input

		// Get user's annual salary
		input = JOptionPane.showInputDialog(null, "What is your annual salary?");
		salary = Double.parseDouble(input);

		// Get the  user's credit rating
		input = JOptionPane.showInputDialog(null, "What is your credit rating?\n"
			+ "1 - 10, 1 being bad and 10 being best:");
		creditRating = Integer.parseInt(input);

		// Determine if the user can get a loan based on their input.
		if (salary >= 20000 && creditRating >= 7)
			qualify();
		else
			noQualify();

		System.exit(0);
	}	

	/*
	The qualify method delivers a message that informs the user that they 
	qualify for the loan.
	*/
	public static void qualify () {
		JOptionPane.showMessageDialog(null, "Congratulations! You qualify for "
			+ " the loan!");
	}

	public static void noQualify () {
		JOptionPane.showMessageDialog(null, "I'm sorry, you don't qualify for"
			+ " the loan.");
	}
}
