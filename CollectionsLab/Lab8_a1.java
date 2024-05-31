import java.util.Arrays;

public class Lab8_a1 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
      
        System.out.println("Original array: " + Arrays.toString(arr));
        
        
        bubbleSort(arr);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr));
        
        
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrCopy));
    }
}
