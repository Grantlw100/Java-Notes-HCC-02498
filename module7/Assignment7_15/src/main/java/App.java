package assignment7_15;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 0};
        int[] receivedArray = eliminateDuplicates(testArray);

        for (int num : receivedArray) {
            System.out.println(num);
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : list) {
            uniqueSet.add(num);
        }

        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }
        return result;
    }
}

// This method follows the standard Java approach for deduplicating an array using a LinkedHashSet, based on principles from the Java Collections Framework (java.util.Set and LinkedHashSet) and clean coding conventions.