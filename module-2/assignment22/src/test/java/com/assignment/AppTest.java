package com.assignment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "50.0, 10.0, 5.0, 55.0",
        "100.0, 20.0, 20.0, 120.0",
        "25.0, 15.0, 3.75, 28.75",
        "80.0, 12.5, 10.0, 90.0"
    })
    void testSubtotal(double subtotal, double gratuityRate, double expectedGratuity, double expectedTotal) {
        assertEquals(expectedTotal, App.subtotal(subtotal, gratuityRate), 0.01);
    }
}
