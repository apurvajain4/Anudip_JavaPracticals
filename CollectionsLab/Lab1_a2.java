import java.util.ArrayList;

public class Lab1_a2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(13);
        numbers.add(16);

       
        int sum = calculateEvenSum(numbers);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int calculateEvenSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { 
                sum += num; 
            }
        }
        return sum;
    }
}
