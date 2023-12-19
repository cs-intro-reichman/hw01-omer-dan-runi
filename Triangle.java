/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		// Note: could be done easier and more readable with an if statement, didnt do it because we didnt learn it yet.
		boolean isTriangle = ((a + b - c) > 0) && ((a + c - b) > 0) && ((b + c - a) > 0);

		System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);
	}
}
