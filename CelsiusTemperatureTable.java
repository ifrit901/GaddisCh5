package ch5java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge #6.
 * The formula for converting a temperature from Fahrenheit to Celsius is:
 * 
 * C = 5/9(F-32)
 * 
 * where F is the Fahrenheit temperature and C is the Celsius temperature.
 * Write a method named celsius that accepts a Fahrenheit temperature as
 * an argument. The method should return the temperature, converted to 
 * Celsius. Demonstrate the method by calling it in a loop that displays
 * a table of Fahrenheit temperatures 0 - 20 and their Celsius equivalents.
 * 
 * @author craig
 */
public class CelsiusTemperatureTable {
	public static void main (String [] args) {

		System.out.println("Fahrenheit\t\tCelsius");
		System.out.println("-------------------------------");

		for ( int i = 0; i <= 20; i++){
			double c = celsius(i);
			System.out.println(i + "\t\t\t" + String.format("%.1f", c));
		}
	}

	/**
	 * The celsius method converts a Fahrenheit temperature to Celsius
	 * and returns the Celsius.
	 * @param fahrenHeit The temperature in Fahrenheit.
	 * @return The temperature in Celsius.
	 */
	public static double celsius (int fahrenHeit) {
		double celsius = (5.0 * (fahrenHeit - 32)) / 9.0;
		return celsius;
	}
}
