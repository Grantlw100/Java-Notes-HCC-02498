package assignment5_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TuitionTest {

    @Test
    void testCalculateTotalTuition() {
        Tuition tuition = new Tuition(10000f, 4f, 0.05f, 2026, 2030); 
        // 5% increase every year for 4 years

        float expected = (float) (10000 * Math.pow(1.05, 4));
        assertEquals(expected, tuition.calculateTotalTuition(), 0.01, 
            "Total tuition after 4 years should match the expected growth.");
    }

    @Test
    void testCalculateMyTuition() {
        int currentYear = java.time.LocalDate.now().getYear();
        Tuition tuition = new Tuition(10000f, 4f, 0.05f, currentYear + 1, currentYear + 3);
        Float myTuition = tuition.calculateMyTuition();

        assertNotNull(myTuition, "My Tuition should not be null.");
        assertTrue(myTuition > 0, "Calculated tuition should be greater than 0.");
    }

    @Test
    void testYearsOfCalculationWithValidYears() {
        int currentYear = java.time.LocalDate.now().getYear();
        Tuition tuition = new Tuition(10000f, 4f, 0.05f, currentYear + 1, currentYear + 3);
        String result = tuition.yearsOfCalculation();

        assertTrue(result.contains(String.valueOf(currentYear + 1)),
            "The output should mention the first year.");
        assertTrue(result.contains(String.valueOf(currentYear + 3)),
            "The output should mention the last year.");
    }

    @Test
    void testCostAfterYears() {
        int currentYear = java.time.LocalDate.now().getYear();
        Tuition tuition = new Tuition(10000f, 4f, 0.05f, 2026, 2030);
        String result = tuition.costAfterYears();

        assertTrue(result.contains(String.valueOf(currentYear + 4)),
            "Should mention the correct year after calculation.");
    }
}
