package ch5java6thedition;

/**
 * Code Listing 5.11 involves returning a non-primitive value from a 
 * method (a String)
 * 
 * @author craig
 */
public class CodeListing5_11 {
	public static void main (String [] args) {
		String customerName;

		customerName = fullName("John", "Martin"); 
		System.out.println(customerName);
	} 	
	
	/**
	 * The fullName method accepts two string arguments containing a 
	 * first and last name. It concatenates them into a single string 
	 * object. 
	 * @param first The first name.
	 * @param last  The last name.
	 * @return A reference to a string containing the first and last names.
	 */
	public static String fullName (String first, String last) {
		String name;

		name = first + " " + last;
		return name;
	}
}
