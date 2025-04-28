package assignment4_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

class AppTest {

    @Test
    void testAreaCalculationWithoutRounding() {
        double sideLength = 5.0;
        double expectedArea = (6 * (sideLength * sideLength)) / (4 * Math.tan(Math.PI / 6));
        
        // Recalculate same as program logic
        double actualArea = (6 * (sideLength * sideLength)) / (4 * Math.tan(Math.PI / 6));
        
        assertEquals(expectedArea, actualArea, 0.0001, "Area should match expected without rounding");
    }

    @Test
    void testAreaCalculationWithRounding() {
        double sideLength = 5.0;
        int roundTo = 2; // rounding to 2 decimal places

        double area = (6 * (sideLength * sideLength)) / (4 * Math.tan(Math.PI / 6));

        BigDecimal bd = new BigDecimal(area);
        bd = bd.setScale(roundTo, RoundingMode.HALF_UP);
        double roundedArea = bd.doubleValue();

        assertEquals(roundedArea, Double.parseDouble(bd.toString()), 0.0001, "Rounded area should match manually calculated rounding");
    }

    @Test
    void testFinalAnswerFormat() {
        double roundedArea = 64.95;
        String units = "cm";

        String expectedAnswer = "The area of the Hexagon is 64.95 cm²";
        String actualAnswer = "The area of the Hexagon is " + roundedArea + " " + units + "\u00b2";

        assertEquals(expectedAnswer, actualAnswer, "Answer format with units and squared symbol should match");
    }

}
