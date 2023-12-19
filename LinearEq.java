/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args) {
        double a = 0;
		a = Double.parseDouble(args[0]);//changing a to double
        double b = 0;
		b = Double.parseDouble(args[1]);//changing b to double
        double c = 0;
		c = Double.parseDouble(args[2]);//changing c to double
		double x = (c-b)/a;
		System.out.println(a + " * x + "+b+" = "+c);
		System.out.println("x = "+x);
    }
}