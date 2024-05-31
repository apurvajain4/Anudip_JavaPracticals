// write a Java program that demonstrates the use of method references for static methods.
// Create a functional interface and use a method reference to call a static method that calculates the square of a number.

package excp_ajwp;

// functional interface
@FunctionalInterface
interface SquareCalculator {
	int calculateSquare(int num);
}

public class lab4_a3_method_reference {
	public static int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		// Method reference to call the static method square
		SquareCalculator squareCalculator = lab4_a3_method_reference::square;

		System.out.println("Square of 5: " + squareCalculator.calculateSquare(5));
	}
}