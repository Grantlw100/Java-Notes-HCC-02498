package assignment7_15;
import java.util.LinkedHashSet;
import java.util.Set;

public class NoDuplicates {
    
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
