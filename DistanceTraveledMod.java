package ch5java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge number nine. 
 * The distance a vehicle travels can be calculated as follows:
 * 
 * Distance = Speed * Time
 * 
 * Write a method named distance that accepts a vehicles speed and time as 
 * arguments, and returns the distance the vehicle has traveled. Modify the
 * "Distance Traveled" program you wrote in chapter 4, (#2), to use the method.
 * 
 * @author craig
 */
public class DistanceTraveledMod {
	public static void main(String [] args) {
		// Variables
		int      time,
		        speed;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for velocity
		System.out.println("How fast (in MPH) was the vehicle traveling?");
      		speed = input.nextInt();

		// Validate the velocity
		while(speed < 0)
		{
			System.out.println("You cannot have a negative velocity, "
				+ "please enter a positive value:");
			speed = input.nextInt();
		}
		
			// Prompt user for time traveled
			System.out.println("How many hours did it travel for?");
			time = input.nextInt();

			// Validate the time
			while(time < 1)
			{
				System.out.println("The time in hours has to be "
					+ "one or greater, please enter a number\n"
					+ "greater than zero:");
				time = input.nextInt();
			}
				// Display calculations
				System.out.println("Hours\t\tDistance");
				System.out.println("---------------------------");
				distance(time, speed);	
	}	
	/**
	 * The distance method uses a loop to display the distances the 
	 * vehicle has traveled after each hour based on the user input 
	 * for speed and time traveled.
	 * @param speed The velocity of the vehicle.
	 * @param time The number of hours the vehicle traveled.
	 */
	public static void distance(int time, int speed) {
		// Loop for calculations display
		for (int i = 1; i <= time; i++)
		{
			System.out.println(i + "\t\t" + speed * i);
		}
	}
}
