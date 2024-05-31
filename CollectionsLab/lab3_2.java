import java.util.HashMap;
import java.util.Map;

public class lab3_2 {
    public static void main(String[] args) {
        Map<String, Integer> cs = new HashMap<>();

    
        cs.put("Dhoni", 150);
        cs.put("Rohit", 99);
        cs.put("Tendulkar", 87);
        cs.put("Gagunly", 34);
        cs.put("Raina", 12);


        String batsman = "Dhoni";
        if (cs.containsKey(batsman)) {
            System.out.println(batsman + "'s score: " + cs.get(batsman));
        } else {
            System.out.println("Batsman not found in the records.");
        }
    }
}
