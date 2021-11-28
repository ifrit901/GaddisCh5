package ch5java6thedition;
import java.util.Scanner;
/**
 * Write a program that asks the user to enter a distance in meters. The 
 * program will then present the following menu of selections:
 * 
 * 1. Convert to kilometers
 * 2. Convert to inches
 * 3. Convert to feet
 * 4. Quit the program
 * 
 * The program will convert the distance to kilometers, inches, or feet, 
 * depending on the user's selection. Here are the specific requirements:
 * 
 * - Write a void method called showKilometers, which accepts the number of
 *   meters as an argument. The method should display the argument converted
 *   to kilometers. Convert the meters to kilometers using the following 
 *   formula:
 * 
 *   kilometers = meters * 0.001
 * 
 * - Write a void method named showInches, which accepts the number of meters
 *   as an argument. The method should display the argument converted to inches. 
 *   Convert the meters to inches using the following formula:
 * 
 *   inches = meters * 39.37
 * 
 * - Write a void method named showFeet, which accepts the number of meters as
 *   an argument. The method should display the argument converted to feet. 
 *   Convert the meters to feet using the following formula:
 * 
 *   feet = meters * 3.281
 * 
 * - Write a void method named menu that displays the menu of options. This 
 *   method should not accept any arguments. 
 * - The program should continue to display the menu until the user enters 4
 *   to quit the program. 
 * - The program should not accept negative numbers for the distance in meters. 
 * - If the user selects an invalid choice from the menu, the program should 
 *   display an error message. 
 * 
 * Here is an example session with the program, using console input. The user's 
 * input is shown in bold. 
 * 
 * 	Enter a distance in meters: 500 [Enter]
 * 	1. Convert to kilometers
 * 	2. Convert to inches
 * 	3. Convert to feet
 * 	4. Quit the program
 * 
 * 	Enter your choice: 1 [Enter]
 * 	500 meters is 0.5 kilometers
 * 
 * 	1. Convert to kilometers
 * 	2. Convert to inches
 * 	3. Convert to feet
 * 	4. Quit the program
 *
 * 	Enter your choice: 3 [Enter]
 * 	500 meters is 1640.5 feet
 * 
 * 	1. Convert to kilometers
 * 	2. Convert to inches
 * 	3. Convert to feet
 * 	4. Quit the program
 *
 * 	Enter your choice: 4 [Enter]
 * 	Bye!
 * 
 * @author craig
 */
public class ConversionProgram {
	public static void main (String [] args) {
		// Variables
		int    meters,
		       choice = 0;
		String again = "Yes";

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Greet the user and explain what's going on
		System.out.println("This program will convert a distance given in\n"
			           + "meters to kilometers, inches, or feet."); 

		// Loop for distance choice
		while(again.equals("Yes") || again.equals("yes"))
		{
			// Prompt user for distance in meters
			System.out.println("Enter a value of distance in meters:");

			// Assign user input to variable
			meters = input.nextInt();

			// Loop for conversion choice
			while(choice != 4)
			{
				System.out.println("1. Convert to kilometers\n" 
 						 + "2. Convert to inches\n"
 					         + "3. Convert to feet\n"
 				 	         + "4. Quit the program\n");

				// Prompt user for a decision
				System.out.println("Enter a choice:");
				// Assign user input to 'choice'
				choice = input.nextInt();

				switch (choice)
				{
					case 1:
					{
						double kM = showKilometers(meters);		
						System.out.println("The distance in KM is " 
							+ String.format("%.4f", kM) + "\n\n");
						break;
					}
					case 2:
					{	
						double inches = showInches(meters);
						System.out.println("The distance in inches is " 
							+ String.format("%,.2f", inches) + "\n\n");
						break;
					}
					case 3:
					{
						double feet = showFeet(meters);
						System.out.println("The distance in feet is " 
							+ String.format("%,.2f", feet) + "\n\n");
						break;
					}
					case 4:
					{
						break;
					}
					default:
					{
						System.out.println("Invalid response, try again...\n");
						break;
					}
				}
			}
			choice = 0;
			input.nextLine();
			System.out.println("\n\nDo you want to convert another value?");
			again = input.nextLine();
		}
		System.out.println("\n\nThanks for participating!");
	}	
	/**
	 * The showKilometers method converts meters to kilometers and returns
	 * the value in kilometers.
	 * @param distance The distance in meters.
	 * @return The distance in kilometers.
	 */
	public static double showKilometers(int distance) {
		double kilometers = distance * .001;
		return kilometers;
	}
	/**
	 * The showInches method converts meters to inches and returns the 
	 * value in inches.
	 * @param distance The distance in meters.
	 * @return the distance in inches.
	 */
	public static double showInches (int distance) {
		double inches = distance * 39.37;
		return inches;
	}
	/**
	 * The showFeet method converts meters to feet and returns the value
	 * in feet. 
	 * @param distance The distance in meters.
	 * @return The distance in feet.
	 */
	public static double showFeet(int distance) {
		double feet = distance * 3.281;
		return feet;
	}

}
