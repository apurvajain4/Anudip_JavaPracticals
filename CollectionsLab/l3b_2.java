import java.util.Arrays;

public class l3b_2 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {8, 9, 7, 1, 4};
        Double[] doubleArray = {2.11, 0.11, 2.7, 411.1};
        String[] stringArray = {"Akanksha", "Apurva", "Sakshi"};
        System.out.println("Max integer: " + findMax(intArray));
        System.out.println("Max double: " + findMax(doubleArray));
        System.out.println("Max string: " + findMax(stringArray));
    }
}
