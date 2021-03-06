package ch5java6thedition;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Write a program that tests your ESP (extrasensory perception). The program
 * should randomly select the name of a color from the following list of words:
 * 
 * Red, Green, Blue, Orange, Yellow. 
 * 
 * To select a word, the program can select a random number. For example, if
 * the number is 0, the selected word is red; if the number is 1, the selected
 * word is green, and so forth. 
 * 
 * 
 * Next, the program should ask the user to enter the color the computer has
 * selected. After the user has entered his/her guess, the program should 
 * display the name of the randomly selected color. 
 * 
 * @author craig
 */
public class ESP_Game {
	public static void main(String [] args) {
		// Variables
		String  user_color, 
			comp_color;

		int     comp_choice,
			total = 0;

		// Engage the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "This program will test you "
			+ "for powers of extrasensory perception!\n"
			+ "You'll get 10 chances to guess which of five colors\n"
			+ "the computer has currently chosen. The options are:\n"
			+ "\"Red\", \"Green\", \"Blue\", \"Orange\", and \"Yellow\"");

		// Loop for 10 tries
		for(int i = 1; i <= 10; i++)
		{
			// Call the random_number method and assign it's result to 
			// an integer variable
			comp_choice = random_number();
			
			// Call the switch_color method and pass it the result from
			// random_number(). Assign the result to 'color'.
			comp_color = switch_color(comp_choice);
	
			// Prompt user for input, call user_choice method
			user_color = user_choice();
	
			// Display the results
			if(comp_color.equalsIgnoreCase(user_color))
			{
				JOptionPane.showMessageDialog(null, "You chose correctly!!"
					+ "\nKinda creepy isn't it haha. Try again..");
				total++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry, your powers didn't"
					+ "show up this time, try again!");
			}
		}
		// Display the total results
		JOptionPane.showMessageDialog(null, "So, the results are in:\n"
			+ "You got " + total + " out of 10 correct, \nCongratulations?!? "
			+ "~~~ 0_o ~~~");
		System.exit(0);
	}	
	/**
	 * The random_number method generates a random number and returns it 
	 * as an integer.
	 * @return The randomly generated integer.
	 */
	public static int random_number() {
		// Create an object of the random class
		Random randy = new Random();
		int number = randy.nextInt(4);
		return number;
	}
	/**
	 * The switch_color method accepts an integer argument and associates
	 * it with a String through a switch statement. The String is then 
	 * returned.
	 * @param number The random number generated by comp_choice().
	 * @return The color as a String variable.
	 */
	public static String switch_color(int number) {
		// Variable
		String color = "";     // String is initialized to the null set

		// Switch statement to assign String varaible
		switch(number)
		{
			case 0:
			{
				color = "Red";
				break;
			}
			case 1:
			{
				color = "Green";
				break;
			}
			case 2:
			{
				color = "Blue";
				break;
			}
			case 3:
			{
				color = "Orange";
				break;
			}
			case 4:
			{
				color = "Yellow";
				break;
			}
		}
		return color;
	}
	/**
	 * The user_choice method allows the user to choose a color and returns
	 * it as a String. 
	 * @return The color the user chooses.
	 */
	public static String user_choice () {
		// Variables 
		int	proper = 1;

		String  color = "";

		// Loop for input validation
		while (proper == 1) 
		{
			// Prompt user for color choice
			color = JOptionPane.showInputDialog(null, "The computer has "
				+ "made it's choice... \ncan you percieve what it was?"
				+ "\nThink hard and enter the color "
				+ "you think is the answer...\n"
				+ "The choices are: \"Red\", \"Green\", \"Blue\", "
				+ "\"Orange\", and \"Yellow\"");

			if 	(!color.equalsIgnoreCase("Red") && 
				!color.equalsIgnoreCase("Green") && 
				!color.equalsIgnoreCase("Blue") && 
				!color.equalsIgnoreCase("Orange") && 
				!color.equalsIgnoreCase("Yellow"))  
			{
				JOptionPane.showMessageDialog(null, "Are you sure you "
					+ "spelled that right? \nTry again!");
			}
			else
				proper = 0;
		}
		return color;
	}
}
