package ch5java6thedition;
import java.util.Scanner;
/**
 * Chapter 5 Multiple choice and true and false.
 * 
 * @author craig
 */
public class Ch5MultipleChoice_TrueNFalse {
	public static void main (String [] args) {
		/*
		1. This type of method does not return a value.

		answer b. void method

		2. This appears at the beggining of a method header.

		answer d. the header

		3. The body of a method is enclosed in:

		answer a. curly braces

		4. A method header can contain:

		answer e. all of these (method modifiers, the return type, method
		name and list of parameters. 

		5. A value that is passed into a method when it is called is a :

		answer b. argument

		6. A variable that receives a value passed into a method is known
		as a(n) :

		answer a. parameter

		7. This javadoc tag is used to document a parameter variable.

		answer b. @param

		8. This statement causes a method to end and causes a value to 
		be returned to the statement that called the method. 

		answer d. return

		9. This javadoc tag is used to document a method's return value.

		answer c. @return

		T or F?
		10. You terminate a method header with a semicolon.  F

		11. When passing an argument to a method, Java will automatically
		perform a widening conversion (convert the value to a higher ranking
		data type), if necessary.                            T

		12. When passing an argument to a method, Java will automatically
		perform a narrowing conversion (convert the argument to a lower
		ranking data type), if necessary.                    F

		13. A parameter variable's scope is the entire program that 
		contains the method in which the variable was declared.   F

		14. When code in a method changes the value of a parameter, 
		it also changes the value of the argument that was passed into 
		into the parameter.                                  F

		15. When an object such as a String, is passed as an argument, 
		it is actually a reference to the object that is passed.   T

		16. The contents of a String cannot be changed.         T

		17. When passing multiple arguments to a method, the order in 
		which the arguments are passed is not important.        F

		18. No two methods in the same program can have a local variable
		with the same name.                                     F

		19. It is possible for one method to access a local variable 
		that is declared in another method.                     F

		20. You must have a return statement in a value-returning method. T

		Find the error

		1. Find the error in the following method definition: 

		// This method has an error!!
		public static void sayHello();
		{
			System.out.println("Hello!");
		}

		There is a semicolon at the end of the method header that shouldn't
		be there. 

		2. Look at the following method header:
		
		public static void showValue(int x)

		The following code has a call to the showValue method. Find the error.

		int x = 8; 
		showValue(int x);   // Error!

		You don't include the data type of the argument being passed in 
		the method call, only in the method definition.

		3. Find the error in the following method definition:

		// This method has an error!!
		public static double timesTwo(double num) 
		{
			double result = num * 2;
		}

		This method doesn't have a return statement.

		4. Find the error in the following method definition:

		// This method has an error!!
		public static int half(double num)
		{
			double result = num / 2.0;
			return result;
		}
		
		The method's return type and the data type being returned 
		are incompatable.

		Algorithm Workbench

		1. Examine the following method header, and then write an example
		call to the method:

		public static void doSomething(int x)

		doSomething(y);

		2. Here is the code for the displayValue method, shown earlier 
		in the chapter: 

		public static void displayValue(int num)
		{
			System.out.println("The value is " + num);
		}

		For each of the following code segments, indicate whether it will
		successfully compile or cause an error:

		a. displayValue(100);
		No error

		b. displayValue(6.0);
		Compilation error, no implicit type casting from higher to lower
		data type (double to int)

		c. short s = 5;
		   displayValue(s);
		No error

		d. long num = 1; 
		   displayValue(num);
		Compilation error, method is passed a value with higher data type 
		ranking than in method definition. (long to int)

		e. displayValue(6.2f);
		Compilation error, can't give an int a float.

		f. displayValue((int)7.5);
		No error, explicit typecasting performed.

		3. Look at the following method header:

		public static void myMethod(int a, int b, int c)

		Now look at the following call to myMethod:

		myMethod(3, 2, 1);

		When this executes, what value will be stored in 'a'? In 'b'? In 'c'?

		a = 3, b = 2, c = 1

		4. What will the following program display?

		public class changeParam{
			public static void main (String [] args) {
				int x = 1;
				double y = 3.4;
				System.out.println(x + " " + y);
				changeUs(x, y);
				System.out.println(x + " " + y);
		 	}

			public static void changeUs(int a, double b) {
				a = 0;
				b = 0.0;
				System.out.println(a + " " + b);
			}
		}

		This program will print:

		1 3.4
		0 0.0
		1 3.4

		5. A program contains the following definition:

		public static int cube(int num) 
		{
			return num * num * num;
		}

		Write a statement that passes the value 4 to this method and assigns
		its return value to a variable named result. 

		int result = cube(4);

		6. A program contains the following method:

		public static void display(int arg1, double arg2, char arg3) 
		{
			System.out.println("The values are " + arg1 + ", " + arg2 + ", and " + arg3);
		}

		Write a statement that calls this method and passes it the following
		arguments:

		char initial = 'T';
		int age = 25;
		double income = 50000.00;

		display(age, income, initial);

		7. Write a method named timesTen. The method should accept a double argument, 
		and return a double value that is ten times the value of the argument. definition
		
		public static double timesTen(double num) {
			return num * 10;
		}

		8. Write a method named square that accepts an integer argument and
		returns the square of that argument.

		public static int square(int num) {
			return num * num;
		}

		9. Write a method named getName that prompts the user to enter his 
		or her first name, and then returns the user's input. 

		public static String getName(String name) {
			Scanner input = new Scanner(System.in);

			String firstName;
			System.out.println("Enter your first name:");
			firstName = input.nextLine();
			return firstName;
		}	

		10. Write a method named quartersToDollars. The method should accept
		and int argument that is a number of quarters, and return the equivalent
		number of dollars as a double. For example, if you pass 4 as an 
		argument, the method should return 1.0; and if you pass 7 as an 
		argument, the method should return 1.75. 

		public static double quartersToDollars(int num) {
			double dollars = num/4.0;
			return dollars;	

		Short Answer

		1. What is the "divide and conquer" approach to problem solving?

		Divide and conquer refers to breaking a problem down into its 
		component parts to be solved individually. 

		2. What is the difference between a void returning method and a 
		value returning method? 

		A void method doesn't return a value of a specific data type, a 
		value returning method does.

		3. What is the difference between an argument and a parameter
		variable?

		An argument is a value that is passed to a parameter variable. 
		A parameter variable accepts arguments that are passed to its 
		method. 

		4. Where do you declare a parameter variable?

		A parameter variable is declared in the parenthesis of a method header.

		5. Explain what is meant by the phrase "pass by value"? 

		"Pass by value" means that only a copy of the value of the variable 
		is passed to the parameter variable. The original value of the 
		variable is not changed. 

		6. Why do local variables lose their values between calls to the 
		methods in which they are declared?

		Local variables are created when their methods are called and destroyed
		when the method's activity has ended. Their lifetime is only within
		the method in which they are created.
		*/
	}
		
}
