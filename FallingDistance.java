package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is programming challenge #5.
 * When an object is falling because of gravity, the following formula can be used
 * to determine the distance an object falls in a specific time period:
 * 
 * d = 1/2gt^2
 * 
 * The variables in the formulas are as follows: 'd' is the distance in meters,
 * 'g' is 9.8, and 't' is the amount of time, in seconds, that the object has
 * been falling. 
 * 
 * Write a method named fallingDistance that accepts an object's falling time
 * (in seconds) as an argument. The method should return the distance, in meters,
 * that the object has fallen in that time interval. Demonstrate the method by 
 * calling it in a loop that passes the values 1 - 10 as arguments, and 
 * displays the return value. 
 * 
 * @author craig
 */
public class FallingDistance {
	public static void main (String [] args) {
		// Variables
		int    seconds;
		double distance;
		String input,
		       output = "";

		// Greet the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "This program calculates the distance\n"
			+ "an object has fallen in a given amount of time.");
		// Prompt the user to enter a period of time in seconds
		input = JOptionPane.showInputDialog(null, "Enter the number of seconds the "
			+ " object has fallen:");
		// Convert String to integer
		seconds = Integer.parseInt(input);
		
		// Call the fallingDistance method and pass it the user input as an argument
		distance = (fallingDistance(seconds));

		// Display results of user input
		JOptionPane.showMessageDialog(null, "The object fell "
			+ String.format("%.1f", distance) + " meters.");

		// Now call the method in a loop to make a chart
		for (int i = 1; i <= 10; i++){
		distance = (fallingDistance(i));

		// Append to the String 'output' each new line of data
		output += "At " + i + " second(s) the object has fallen " 
			+ String.format("%,.1f", distance) + " meter(s).\n";
		}

		JOptionPane.showMessageDialog(null, output);

	}	

	/**
	 * The fallingDistance method calculates and returns the distance an object
	 * has fallen in a given amount of time.
	 * @param time The number of seconds the object has fallen.
	 * @return The distance the object has traveled down.
	 */
	public static double fallingDistance(int time) {
		final double GRAVITY = 9.8;
		double distance = (Math.pow(time, 2.0) * GRAVITY / 2);
		return distance;
	}
}
