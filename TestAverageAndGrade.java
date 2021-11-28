package ch5java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge #7.
 * Write a program that asks the user to enter five test scores. The program should
 * display a letter grade for each score and the average test score. Write the 
 * following methods in the program:
 * 
 * - calcAverage - This method should accept five test scores as methods and 
 *                 return the average of the scores. 
 * - determineGrade - This method should accept a test score as an argument 
 * 		      and return a letter grade for the score, based on the 
 * 		      following grading scale:
 * 
 * Score 		Letter Grade
 * ---------------------------------
 * 90 - 100 		     A
 * 80 - 89		     B
 * 70 - 79		     C
 * 60 - 69		     D
 * Below 60   		     F
 * 
 * 
 * @author craig
 */
public class TestAverageAndGrade {
	public static void main (String [] args) {
		// Variables
		char   letter = 'A';
		int    grade,
		       total = 0;   // Always initialize an accumulator to zero
		String output = "Score\t\tLetter Grade\n"
			+ "-----------------------------\n";

		// Prompt user to enter five grades
		for (int i = 1; i <= 5; i++) {
			// Variable for String output

			// Create a Scanner object
			Scanner input = new Scanner(System.in);

			System.out.println("Enter the score for test #" + i);
			grade = input.nextInt();
			if (grade <= 100 && grade >= 90)
				letter = 'A';
			else if (grade <= 89 && grade >= 80)
				letter = 'B';
			else if (grade <= 79 && grade >= 70)
				letter = 'C';
			else if (grade <= 69 && grade >= 60)
				letter = 'D';
			else if (grade < 60)
				letter = 'F';
			else 
				System.out.println("Invalid input");

			output += grade + "\t\t\t" + letter + "\n";
			total += grade;
		}

		System.out.println("The average of all the grades is " + calcAverage(total));

		determineGrade(output);
	}	
	/**
	 * The calcAverage method accepts the total of five test scores and 
	 * returns the average of all five.
	 * @param total The total of all five scores.
	 * @return The average of all the scores.
	 */
	public static double calcAverage(int total) {
		double average = total/5;
		return average;
	}
	/**
	 * The determineGrade method accepts an accumulated String and outputs 
	 * it in an organized form.
	 * @param output The String with all the concatenated grades.
	 * @return The complete String. 78
	 * 
	 */
	public static void determineGrade(String output) {
		System.out.println(output);
	}
}
