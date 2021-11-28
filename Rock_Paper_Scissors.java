package ch5java6thedition;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * This is program challenge #17.
 * Write a program that lets the user play rock, paper, scissors with the
 * computer. The program should work as follows: 
 * 
 * 1. When the program begins, a random number in the range of 1 - 3 is 
 *    generated. If the number is 1, then the computer has chosen rock. 
 *    If the number is 2, then the computer has chosen paper. If the 
 *    number is 3, the computer has chosen scissors. (Don't display the 
 *    computer's choice yet.)
 * 2. The user enters his/her choice of "rock", "paper", or "scissors" at
 *    the keyboard. (You can use a menu if you prefer.)
 * 3. The computer's choice is displayed. 
 * 4. A winner is selected according to the following rules:
 *    - If one player chooses rock and the other player chooses scissors, 
 *      then rock wins. (Rock smashes scissors.)
 *    - If one player chooses scissors and the other player chooses paper, 
 *      then scissors wins. (Scissors cut paper.)
 *    - If one player chooses paper and the other player chooses rock,
 *      then paper wins. (Paper covers rock.)
 *    - If both players make the same choice, then it is a tie and they 
 *      must play again to determine the winner. 
 * 
 * Be sure to divide the program into methods that perform each major task. 
 * 
 * @author craig
 */
public class Rock_Paper_Scissors {
	public static void main(String [] args) {
		// Engage the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, Scissors!\n"
			+ "Make a choice in the following menu to play the computer!");

		// Variables
		String  input,
			answer = "yes";
		int     userChoice,
		        compChoice;

		while(answer.equals("yes") || answer.equals("Yes"))
		{
			// Call the comp_choice method, set compChoice = to result
		        compChoice = comp_choice();
	
			// Now the computer already has a choice, prompt user 
			// for a choice using the menu method
			userChoice = menu();		

			if (userChoice == compChoice) {
				JOptionPane.showMessageDialog(null, "It's a tie!\n"
					+ "You have to play again to break it.");
			}		
			else if (userChoice == 1 && compChoice == 2) {
				JOptionPane.showMessageDialog(null, "You = \"Rock\"\n"
						 	     + "Computer = \"Paper\"\n"
					                     + "Paper covers Rock, Computer wins!");
				}
			else if (userChoice == 1 && compChoice == 3) {
				JOptionPane.showMessageDialog(null, "You = \"Rock\"\n"
						             + "Computer = \"Scissors\"\n"
							     + "Rock smashes Scissors, You win!");
				}
			else if (userChoice == 2 && compChoice == 1) {
				JOptionPane.showMessageDialog(null, "You = \"Paper\"\n"
							     + "Computer = \"Rock\"\n"
							     + "Paper covers Rock, You win!");
				}
			else if (userChoice == 2 && compChoice == 3) {
				JOptionPane.showMessageDialog(null, "You = \"Paper\"\n"
							     + "Computer = \"Scissors\"\n"
							     + "Scissors cut Paper, Computer wins!");
				}
			else if (userChoice == 3 && compChoice == 1) {
				JOptionPane.showMessageDialog(null, "You = \"Scissors\"\n"
							     + "Computer = \"Rock\"\n"
							     + "Rock smashes Scissors, Computer wins!");
				}
			else if (userChoice == 3 && compChoice == 2) {
				JOptionPane.showMessageDialog(null, "You = \"Scissors\"\n"
							     + "Computer = \"Paper\"\n"
							     + "Scissors cut Paper, You win!");
				}
			else 
				JOptionPane.showMessageDialog(null, "You gotta make a valid choice!!");
			
			answer = JOptionPane.showInputDialog(null, "Do you want to "
				+ "play again, \"Yes\" or \"No\"?");
		}
		JOptionPane.showMessageDialog(null, "Thanks for playing!!");
	}	
	/**
	 * The comp_choice method returns a random number as the computer's
	 * choice for rock, paper, or scissors. 
	 * @return The random number. 
	 */
	public static int comp_choice () {
		Random randy = new Random();
		int number = randy.nextInt(3) + 1;
		return number;
	}
	public static int menu() {
		String input;
		int number;
		input = JOptionPane.showInputDialog(null, "Choose 1 for rock,\n"
			                           + "Choose 2 for paper,\n"
			 	      	           + "Choose 3 for scissors.");
		number = Integer.parseInt(input);
		return number;
	} 
}
