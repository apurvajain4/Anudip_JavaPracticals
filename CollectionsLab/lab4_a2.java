import java.util.Scanner;
import java.util.Stack;

public class lab4_a2 {
    public static String reverseString(String input) {
        int length = input.length();
        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append((char) stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
