package ch5java6thedition;
import java.io.*;
/**
 * This is number 14 in the programming challenges.
 * Use the isPrime method from programming challenge 13 in a program
 * that stores the prime numbers between 1 - 100 in a file.
 * 
 * @author craig
 */
public class Prime_Number_List {
	// Don't forget the throws exception statement
	public static void main(String [] args) throws IOException {

		File file = new File("prime_numbers.txt");
		PrintWriter pw = new PrintWriter(file);

		for (int i = 1; i <= 100; i++) {
			if (isPrime(i) == true)
				pw.println(i);
		}
		pw.close();

	}
	/**
	 * The isPrime method accepts an integer variable and returns true if
	 * the number is prime, otherwise false.
	 * @param number The number to be tested for primeness. 
	 * @return Boolean value.
	 */
	public static boolean isPrime (int number) {
		boolean prime = false;
		int     remainder,
		        total = 0;

		// Loop through all the odd numbers 1 - number to check for 
		// remainders
		for (int i = 1; i <= number; i++) {
			remainder = number % i;

			if (remainder == 0) // This is to keep from going through
				total++;    // extra numbers unecessarily
			if (total > 2)
				break;
				
		}
		if (total > 2) {
			prime = false;
		}
		/*
		One is not a prime number in the strict (only) definition of 
		what a prime number is. So the total number of even divisions
		of a number has to be 2 ... between the number in question and 1.
		*/
		else if (total == 2)   
			prime = true;

		return prime;	
	}
}	



