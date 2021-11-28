package ch5java6thedition;
import java.util.Random;
/**
 * This is programming challenge number 15.
 * You can use the following logic to determine if a number is even or odd. 
 * 
 * if ((number % 2) == 0)
 * {
 * 	// The number is even.
 * }
 * else
 * {
 * 	// The number is odd.
 * }
 * 
 * Write a program with a method named isEven that accepts an 'int' argument.
 * The method should return true if the argument is even, or false if otherwise.
 * The program's main method should use a loop to generate 100 random integers.
 * It should use the isEven method to determine whether each random number is 
 * even or odd. When the loop is finished, the program should display the 
 * number of even numbers that were generated, and the number of odd numbers.
 * 
 * @author craig
 */
public class Even_Odd_Counter {
	public static void main (String [] args) {
		// Variables
		int	evens = 0,
			odds = 0;

		// Create an object of the random class

		// Call the isEven method in a loop 100 times
		for (int i = 1; i <= 100; i++){
			isEven(i);
			if (isEven(i))
				evens++;
			else
				odds++;
		}

		// Display the results
		System.out.println("The total number of even numbers is " + evens);
		System.out.println("The total number of odd numbers is " + odds);
	}	
	public static boolean isEven(int number) {
		// Create a boolean variable to return
		boolean is_even;		

		// Create a random number for each iteration
		Random randy = new Random();
		int num = randy.nextInt();

		if (num % 2 == 0)
		{
			is_even = true;
		}
		else
			is_even = false;

		return is_even;
	}
}
