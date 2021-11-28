package ch5java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge number 16.
 * Suppose you want to deposit a certain amount of money into a savings 
 * account, and then leave it alone to gain interest for 10 years. At the 
 * end of the 10 years, you would like to have $10,000 in the account. 
 * How much do you need to deposit today to make that happen? You can use the 
 * following formula, which is known as the present value formula, to find out:
 * 
 * P = F / (1 + r)^n
 * 
 * The terms of the formula are as follows:
 * - 'P' is the present value, or the amount you need to deposit today.
 * - 'F' is the future value that you want in the account. (In this case $10,000)
 * - 'r' is the annual interest rate.
 * - 'n' is the number of years you plan to let the money stay in the account.
 * 
 * Write a method named presentValue that performs this calculation. The method
 * should accept the future value, annual interest rate, and number of years
 * as arguments. It should return the present value, which is the amount you 
 * need to deposit today. Demonstrate the method in a program that lets the 
 * user experiment with different values for the formula's terms.
 * 
 * @author craig
 */
public class Present_value {
	public static void main(String [] args) {
		// Variables
		double 	annual_interest_rate,
			present_value,
			future_value = 10000,
			number_of_years;
		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for input 
		System.out.println("This program calculates the present-value "
			+ "amount needed to grow to $10,000 over a \n"
			+ "period of years. I'll need some input from you "
			+ "in order to calculate what it is.");

		System.out.println("\n\nEnter the annual interest rate for the account:");
		annual_interest_rate = input.nextDouble();

		System.out.println("Ok, great, now tell me how many years you want "
			+ "the money to stay in the account:");
		number_of_years = input.nextDouble();

		// With this input you can now call the presentValue method
		System.out.println("The ammount you need to deposit today is $"
			+ String.format("%,.2f", presentValue(future_value, number_of_years, annual_interest_rate)));
	}	
	/**
	 * The presentValue method calculates the money needed to be deposited 
	 * into an account today that will grow to a specified amount over a 
	 * desired period of time. 
	 * @param wanted The future value. 
	 * @param years The number of years desired for account maturity.
	 * @param rate The annual interest rate.
	 * @return The present value.
	 */
	public static double presentValue(double wanted, double years, double rate) {
		double pv = wanted / Math.pow((1 + rate), years);
		return pv;
	}
}
