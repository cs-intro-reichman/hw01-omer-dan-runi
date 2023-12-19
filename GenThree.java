/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Receiving the range [a,b)	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int diff = b - a;

		double rand1 = Math.random();
		int gen1 = (int) (diff * rand1) + a;

		double rand2 = Math.random();
		int gen2 = (int) (diff * rand2) + a;

		double rand3 = Math.random();
		int gen3 = (int) (diff * rand3) + a;

		int min = Math.min(gen1, gen2);
		min = Math.min(min, gen3);

		System.out.println(gen1 + "\n" + gen2 + "\n" + gen3 + "\n" + "The minimal generated number was " + min);
	}
}
