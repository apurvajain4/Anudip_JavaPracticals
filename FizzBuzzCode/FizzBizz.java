/*Write a Java program that prints the numbers from 1 to 50. But for multiples of four print "Fizz" instead of the number and for the multiples of five print "Buzz". 
For numbers which are multiples of both four and five print "FizzBuzz".*/

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Check for multiples of both 4 and 5 first
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 4 == 0) {  // Check for multiples of 4
                System.out.println("Fizz");
            } else if (i % 5 == 0) {  // Check for multiples of 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);  // Print the number itself
            }
        }
    }
}
