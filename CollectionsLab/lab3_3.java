import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> dictionary = new TreeMap<>();


        System.out.println("Add word-definition pairs to the dictionary (type 'exit' to stop):");
        while (true) {
            System.out.print("Word: ");
            String word = scanner.nextLine();
            if (word.equals("exit")) break;
            System.out.print("Definition: ");
            String definition = scanner.nextLine();
            dictionary.put(word, definition);
        }

      
        System.out.print("Enter a word to get its definition: ");
        String searchWord = scanner.nextLine();
        if (dictionary.containsKey(searchWord)) {
            System.out.println("Definition: " + dictionary.get(searchWord));
        } else {
            System.out.println("Word not found in the dictionary.");
        }

        System.out.println("Dictionary (in alphabetical order):");
        for (Map.Entry entry : lab3_3.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
