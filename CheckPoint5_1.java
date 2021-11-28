package ch5java6thedition;

/**
 * Checkpoint 5.1 - 5.5. 
 * 
 * @author craig
 */
public class CheckPoint5_1 {
	public static void main (String [] args) {
		/*
		5.1
		What is the difference between a void method and a value-returning
		method?

		A void method executes a statement(s), a value-returning method
		returns a value of some data type.

		5.2
		Is the following line of code a method header or a method call?

		calcTotal();

		This is a method call.

		5.3
		Is the following line of code a method header or a method call?

		public static void calcTotal()

		This is a method header.

		5.4
		What message will the will the following program display if the 
		user enters '5'? What if the user enters 10? 100?

		import javax.swing.JOptionPane;
		public class Checkpoint {
			public static void main (String [] args) {
				String input; 
				int number;

				input = JOptionPane.showInputDialog(null, "Enter a number:");
				number = Integer.parseInt(input);

				if (number < 10)
					method1();
				
		   		else 
					method2();
		
				System.exit(0);
			}
			
			public static void method1() {
				JOptionPane.showMessageDialog(null, "Able am I.");
			}

			public static void method2() {
				JOptionPane.showMessageDialog(null, "I saw Elba.");
			}

		If the user enters 5, it will display "Able am I." If they enter
		10 or 100 it will display "I saw Elba.");
		
		5.5
		Write a method that displays you're full name. It should be called myName().

		public static void myName() {
			System.out.println("Craig Watson Parker");
		}

		*/
	}	
}
