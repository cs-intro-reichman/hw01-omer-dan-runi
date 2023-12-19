/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Receiving the input from the user
		int firstIntake = Integer.parseInt(args[0]);
        int secondIntake = Integer.parseInt(args[1]);
        
        System.out.println(firstIntake + " + " + secondIntake + " = " + (firstIntake + secondIntake));
	}
}
