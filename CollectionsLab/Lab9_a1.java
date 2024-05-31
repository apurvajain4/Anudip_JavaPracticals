import java.util.Scanner;

public class Lab9_a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] strings = new String[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

      
        insertionSort(strings);

        
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
