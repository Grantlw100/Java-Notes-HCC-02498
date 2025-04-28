package assignment5_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @ParameterizedTest
    @CsvSource({
        "1.0, mi, 2, 1.61",    // 1 mile ≈ 1.61 km
        "5.0, mi, 2, 8.05",    // 5 miles ≈ 8.05 km
        "10.0, km, 2, 6.21",   // 10 kilometers ≈ 6.21 mi
        "2.5, mi, 3, 4.023",   // 2.5 miles ≈ 4.023 km
        "7.2, km, 1, 4.5"      // 7.2 kilometers ≈ 4.5 mi
    })
    void testDistanceConversion(double inValue, String inUnit, int roundAt, double expectedOutValue) {
        Distance distance = new Distance(inValue, inUnit, roundAt);

        assertEquals(expectedOutValue, distance.outValue, 0.01, 
            "Expected converted value does not match for input: " + inValue + " " + inUnit);
    }

    @ParameterizedTest
    @CsvSource({
        "2.5, mi, 3, 4.023, km",
        "7.2, km, 1, 4.5, mi"
    })
    void testUnitsAndLabels(double inValue, String inUnit, int roundAt, double expectedOutValue, String expectedOutUnit) {
        Distance distance = new Distance(inValue, inUnit, roundAt);

        assertEquals(expectedOutUnit, distance.outUnit,
            "Expected output unit to match for input unit: " + inUnit);
        assertEquals(expectedOutValue, distance.outValue, 0.01,
            "Expected converted value does not match for input value: " + inValue);
    }
}
