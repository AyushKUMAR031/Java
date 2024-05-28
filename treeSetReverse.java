import java.util.TreeSet;

public class ReverseSortedSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(5);
        set.add(3);
        set.add(7);

        // Print sorted set in reverse order
        System.out.println("Sorted set in reverse order:");
        TreeSet<Integer> reverseSet = (TreeSet<Integer>) set.descendingSet();
        for (int num : reverseSet) {
            System.out.println(num);
        }
    }
}
