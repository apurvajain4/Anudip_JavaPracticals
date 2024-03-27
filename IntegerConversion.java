import java.util.Scanner;
public class IntegerConversion {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter an integer: ");
String input = scanner.nextLine();
if (input.isEmpty()) {
throw new NullPointerException("Input is empty");
}
int num = Integer.parseInt(input);
System.out.println("Integer value: " + num);
} catch (NumberFormatException e) {
System.out.println("Error: Input must be a valid integer.");
} catch (NullPointerException e) {
System.out.println("Error: Input is null or empty.");
} finally {
scanner.close();
}
}
}