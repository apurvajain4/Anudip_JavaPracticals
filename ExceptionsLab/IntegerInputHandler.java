/*Q1.Write a program that prompts the user to enter an integer. Handle the InputMismatchException that might occur if the user enters a non-integer value. */
import java.util.InputMismatchException;
import java.util.Scanner;
public class IntegerInputHandler {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
} catch (InputMismatchException e) {
System.out.println("Error: Input must be an integer.");
// Clearing the invalid input
scanner.next();
} finally {
scanner.close();
}
}
}