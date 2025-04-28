package assignment7_15;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class AppTest {

    @Test
    void TestNoDuplicates() {        
        int[] testArray = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 0};
        String result = "[1, 2, 3, 4, 5, 6, 0]";
        int[] receivedArray = NoDuplicates.eliminateDuplicates(testArray);
        String answer = java.util.Arrays.toString(receivedArray);
        assertEquals(result, answer);
    }
}
