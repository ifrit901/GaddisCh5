package ch5java6thedition;

/**
 * Code listing 5.5. Passing parameters to methods.
 * 
 * @author craig
 */
public class CodeListing5_5 {
	public static void main (String [] args) {
		int x = 10;

		System.out.println("I am passing values to displayValue.");

		displayValue(5);                           // Pass 5
		displayValue(x);                           // Pass 10
		displayValue(x * 4);                       // Pass 40
		displayValue(Integer.parseInt("700"));     // Pass 700

		System.out.println("Now back in main.");
	}	

	public static void displayValue(int num) {
		System.out.println("The value is " + num);
	}
}
