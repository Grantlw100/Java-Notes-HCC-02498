package assignment3_6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for App.
 */
public class AppTest {

    @Test
    void testBMICalculationMetric() {
        // Given
        double weightKg = 70.0; // 70 kilograms
        double heightM = 1.75;  // 1.75 meters
        char metric = 'Y';

        // When
        double calculatedBMI = BMI.calculateBMI(weightKg, heightM, metric);

        // Then
        assertEquals(22.86, calculatedBMI, 0.01); // Expected BMI = 22.86 approximately
    }

    @Test
    void testBMICalculationImperial() {
        // Given
        double weightLbs = 154.0; // 154 pounds
        double heightInches = 68.0; // 68 inches
        char metric = 'N';

        // When
        double calculatedBMI = BMI.calculateBMI(weightLbs, heightInches, metric);

        // Then
        assertEquals(23.42, calculatedBMI, 0.01); // Expected BMI = 23.42 approximately
    }

    @Test
    void testBMICategory() {
        // Given
        double bmi = 24.0;

        // When
        String category = BMI.getBMICategory(bmi);

        // Then
        assertEquals("Normal weight", category);
    }

    @Test
    void testBMICategoryObese() {
        // Given
        double bmi = 31.0;

        // When
        String category = BMI.getBMICategory(bmi);

        // Then
        assertEquals("Obese", category);
    }

}
