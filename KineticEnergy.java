package ch5java6thedition;
import javax.swing.JOptionPane;
/**
 * This is programming challenge #12.
 * In physics, an object that is in motion is said to have kinetic energy. 
 * The following formula can be used to determine a moving object's kinetic 
 * energy:
 * 
 * KE = 1/2 mv^2
 * 
 * The variables in the formula are as follows: KE is the kinetic energy, 'm' is
 * the object's mass in kilograms, and 'v' is the object's velocity, in meters
 * per second. Write a method named kineticEnergy that accepts an object's j
 * mass (in kilograms) and velocity (in meters per second) as arguments. The 
 * method should return the amount of kinetic energy that the object has. 
 * Demonstrate the method by calling it in a program that asks the user to 
 * enter values for mass and velocity.
 * 
 * @author craig
 */
public class KineticEnergy {
	public static void main(String [] args) {
		// Variables
		double mass,
		       velocity,
		       KE;

		String input;

		// Prompt user for mass and velocity
		input = JOptionPane.showInputDialog(null, "What is the mass, in kilograms,"
			+ " of the object?");
		mass = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the velocity, in "
			+ " meters per second, of the object?");
		velocity = Double.parseDouble(input);

		// Call the kinetic energy method
		KE = kineticEnergy(mass, velocity);

		// Display the results
		JOptionPane.showMessageDialog(null, "The kinetic energy of the object is "
			+ KE + " Joules.");
	}	
	/**
	 * The kineticEnergy method accepts the mass and velocity of an object
	 * and returns the kinetic energy (in Joules?) of the object. 
	 * @param mass The mass of the object.
	 * @param velocity The velocity of the object.
	 * @return The kinetic energy of the object.
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double KE = (mass * (Math.pow(velocity, 2.0))) / 2;
		return KE;
	}
}
