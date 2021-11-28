package ch5java6thedition;

/**
 * Code Listing 5.7 demonstrates that String objects are immutable.
 * 
 * @author craig
 */
public class CodeListing5_7 {
	public static void main (String [] args) {
		// Create a String object containing "Shakespeare".
		String name = "Shakespeare";

		// Display the String referenced by the 'name' variable
		System.out.println("In main, the name is " + name);

		// Call the changeName method, passing the contents of the 
		// name variable as an argument.
		changeName(name);

		// Display the String name again, showing that its contents
		// haven't changed
		System.out.println("Back in main, 'name' is still " + name);
	}	

	public static void changeName(String str) {
		// Create a String object containing "Dickens" and assign
		// its address to the str parameter variable
		str = "Dickens";

		// Display the string referenced by str
		System.out.println("In changeName, the name is now " + str);
	}
}
