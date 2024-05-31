// Write a Java program that uses lambda expressions to manipulate strings. 
// Create lambda expressions to perform the following operations on a given string:
// ● Convert the string to uppercase
//● Convert the string to lowercase
//● Reverse the string.

package excp_ajwp;

import java.util.function.Function;

public class lab4_a1_string_manipulation {

	public static void main(String[] args) {
		String inputString = "Anudip creates digital livelihoods for underserved communities through technology and skills";

		// Lambda expressions for string manipulation
		Function<String, String> toUpperCase = str -> str.toUpperCase();
		Function<String, String> toLowerCase = str -> str.toLowerCase();
		Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();

		// Apply the lambda expressions and print the results
		System.out.println("Original String: " + inputString);
		System.out.println("\nUppercase String: " + toUpperCase.apply(inputString));
		System.out.println("\nLowercase String: " + toLowerCase.apply(inputString));
		System.out.println("\nReversed String: " + reverseString.apply(inputString));
	}

}