package assignment7_15;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 0};
        int[] receivedArray = NoDuplicates.eliminateDuplicates(testArray);

        for (int num : receivedArray) {
            System.out.println(num);
        }
    }

}

// This method follows the standard Java approach for deduplicating an array using a LinkedHashSet, based on principles from the Java Collections Framework (java.util.Set and LinkedHashSet) and clean coding conventions.