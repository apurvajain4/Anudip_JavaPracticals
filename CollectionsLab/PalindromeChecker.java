
//lab4_b1
//1. Write a Java program to check if a given string is a palindrome. Use a stack to help you compare characters from the beginning and end of the string. Do not use any String functionalities to reverse the String. Use Stack data structure. You can use (A string is called Palindrome if the reverse of the string is the same as the original string. Example: “racecar”. ) 

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        int length = input.length();
        Stack stack = new Stack(length);

    
        for (int i = 0; i < length / 2; i++) {
            stack.push(input.charAt(i));
        }

        int startIndex = (length % 2 == 0) ? length / 2 : length / 2 + 1;

    
        for (int i = startIndex; i < length; i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}
