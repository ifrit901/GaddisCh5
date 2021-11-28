package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is programming challenge #3. 
 * Complete this program so that it has a method that calculates and displays
 * the area of a rectangle with user specified dimensions. 
 * 
 * @author craig
 */
public class RectangleArea {
	public static void main(String [] args) {
		double length,
			width;
		
		String input;

		// Prompt user for dimensions of rectangle
		input = JOptionPane.showInputDialog(null, "What is the rectangle's width?");

		// Convert user input String to double
		width = Double.parseDouble(input);

		// Prompt user for length
		input = JOptionPane.showInputDialog(null, "What is the rectangle's length?");

		// Convert length to double
		length = Double.parseDouble(input);

		// Call method displayArea()
		displayArea(width, length);

		System.exit(0);
	}	

	/**
	 * The method displayArea calculates and displays the area of a rectangle
	 * given its length and width.
	 * @param l The length of the rectangle.
	 * @param w The width of the rectangle.
	 */
	public static void displayArea(double l, double w) {
		double area = l * w;
		JOptionPane.showMessageDialog(null, "The area of the rectangle is "  + area) ;
	}
}
