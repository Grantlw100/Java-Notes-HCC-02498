package assignment6_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "12345, 15",
        "54321, 15",
        "555, 15",
    })
    void testSumDigits(long inValue, int expectedSum) {

        assertEquals(expectedSum, SumDigits.SumUpDigits(inValue), 0.01);
    }
}
