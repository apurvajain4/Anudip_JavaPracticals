import java.util.Random;

public class Lab9_a2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); 
        }

      
        long startTime, selectionSortTime, bubbleSortTime, insertionSortTime;

        // Selection Sort
        startTime = System.nanoTime();
        selectionSort(array.clone());
        selectionSortTime = System.nanoTime() - startTime;

        // Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(array.clone());
        bubbleSortTime = System.nanoTime() - startTime;

        // Insertion Sort
        startTime = System.nanoTime();
        insertionSort(array.clone());
        insertionSortTime = System.nanoTime() - startTime;

        
        System.out.println("Selection Sort Time: " + selectionSortTime + " nanoseconds");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Insertion Sort Time: " + insertionSortTime + " nanoseconds");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

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

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
