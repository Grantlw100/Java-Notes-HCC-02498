package assignment2_1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest {

    @ParameterizedTest
    @CsvSource({
        "0, 32",
        "100, 212",
        "-40, -40",
        "37, 98.6"
    })
    void testCelsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        assertEquals(expectedFahrenheit, App.celsiusToFahrenheit(celsius), 0.01);
    }
}
