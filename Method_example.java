package ch5java6thedition;

/**
 * This is not part of the chapter, just a test to see what happens when you 
 * change the modifier from public to private in a method header.
 * From what I remember, there won't be any problem changing void method
 * sayHello(); from public to private, because the method is part of the class
 * Method_example. However, I believe changing it to private will make the 
 * method unaccessible to classes outside Method_example.
 * 
 * @author craig
 */
public class Method_example {
	public static void main (String [] args) {
		sayHello();
	}	
	// Method is public, I'm switching it back and forth to private to 
	// see what, if any, errors are thrown
	public static void sayHello () {
		System.out.println("Hi there, I'm Craig!");
	}
}

