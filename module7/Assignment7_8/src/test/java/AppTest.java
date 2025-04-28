package assignment7_8;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "1.0, 2.0, 3.0",
        "3.0, 2.0, 1.0",
        "2.0, 1.0, 3.0",
    })

    void testIntAverage() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int[] inputArray = {num1, num2, num3};
        int matchMe = 6;
        assertEquals(matchMe, Average.intAverage(inputArray));
    }

    
    void testDoubleAverage() {
        double num1 = 1.0;
        double num2 = 2.0;
        double num3 = 3.0;
        double[] inputArray = {num1, num2, num3};
        double matchMe = 6.0;
        assertEquals(matchMe, Average.doubleAverage(inputArray));
    }
}
        