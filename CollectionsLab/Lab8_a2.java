import java.util.Arrays;

public class Lab8_a2 {

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                   
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grapes", "pineapple"};
        
      
        System.out.println("Original array: " + Arrays.toString(arr));
        
        
        bubbleSort(arr);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr));
        
       
        String[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrCopy));
    }
}
