package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is #1 in the programming challenges. 
 * Write a method named showCar. The method should accept two arguments: 
 * a reference to a String object and an integer. The integer argument is 
 * a character within the String, with the first character position being 
 * at position 0. When the method executes, it should display the character
 * at that position. Here is an example of a call to the method: 
 * 
 * showChar("New York", 2);
 * 
 * In this call, the method will display the character 'w' because it is in 
 * position 2. Demonstrate the method in a complete program. 
 * 
 * @author craig
 */
public class showCar_Method {
	public static void main (String [] args) {
		// Variables
		String     input,     // To hold string input
		          phrase;
		int charPosition,     // To hold the character position
		       strLength;

		// Prompt user for a String 
		phrase = JOptionPane.showInputDialog(null, "Enter a short phrase:");

		// Get the length of the string
		strLength = phrase.length();

		// Ask the user to enter a number that will identify the character
		// at that point in the string
		input = JOptionPane.showInputDialog(null, "Pick a number that will\n"
			+ " represent a character in the string and I'll tell you which\n"
			+ " character it is. Enter a number 0 - " + (strLength -1));

		// Convert user input to an int
		charPosition = Integer.parseInt(input);
		
		// Validate the input to prevent an out of bounds exception
		while(charPosition > (strLength - 1))
		{
			input = JOptionPane.showInputDialog(null, "Please enter "
				+ " a number between 0 and " + (strLength - 1));  
			charPosition = Integer.parseInt(input);
		}

		// Call the method showChar
		showChar(phrase, charPosition);	
	}	

	/**
	 * The method showChar takes a String and an int as arguments and displays
	 * the character at the specified position in the String. 
	 * @param str The reference to the String passed.
	 * @param integer The integer representing the char position in the String
	 */
	public static void showChar(String str, int integer) {
		JOptionPane.showMessageDialog(null, "The character at position " + integer 
			+ " is " + str.charAt(integer) );
	}
}
