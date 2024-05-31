import java.util.HashSet;

public class Lab2_a1 {
    public static void main(String[] args) {
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(5);
        numbersSet.add(10);
        numbersSet.add(15);
        numbersSet.add(20);
        numbersSet.add(25);

        
        System.out.println("Elements of the set: " + numbersSet);

        
        if (numbersSet.contains(10)) {
            System.out.println("The set contains the number 10.");
        } else {
            System.out.println("The set does not contain the number 10.");
        }

        numbersSet.remove(15);

        
        System.out.println("Size of the set after removing 15: " + numbersSet.size());
    }
}
