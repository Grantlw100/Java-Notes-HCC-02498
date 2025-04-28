package assignment6_5;

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

    void testOrderDigits(double num1, double num2, double num3) {
        double[] inputArray = {num1, num2, num3};
        String matchMe = "\n1st number: 3.00000 \n2nd number: 2.00000 \n3rd number: 1.00000 \n";
        assertEquals(matchMe, OrderDigits.OrderMyDigits(inputArray));
    }
}
        