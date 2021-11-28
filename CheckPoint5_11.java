package ch5java6thedition;

/**
 * Check Point 5.11 - 5.14
 * 
 * @author craig
 */
public class CheckPoint5_11 {
	public static void main (String [] args) {
		/*
		5.11
		Look at the following method header. What type of value does 
		the method return?
		
		public static double getValue(int a, float b, String c)

		It returns a double value. 

		5.12
		Write the header for a method named days. The method should 
		return an int and have three int parameter variables: years, months, 
		and weeks.

		public static int days(int years, int months, int weeks) 

		5.13
		Write the header for a method named distance. The method should 
		return a double and have two double parameter variables: rate and time.

		public static double distance (double rate, double time)

		5.14
		Write the header for a method named lightYears. The method should 
		return a long and have one long parameter variable 'miles'.

		public static long lightYears (long miles)

		*/
		long distance = 8;
		lightYears(distance);
	}	

	/**
	 * This is just a test method, seeing what syntax is acceptable for long
	 * data type. For some reason I thought you had to say 'long int' instead 
	 * of just long.
	 * @param miles Test variable.
	 * @return Test return.
	 */
	public static long lightYears(long miles){
		long  lightYears = miles * 8;
		return lightYears;
	}
}
