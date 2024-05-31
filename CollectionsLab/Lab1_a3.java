import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab1_a3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");

        Collections.reverse(strings);

        System.out.println("Reversed List:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
