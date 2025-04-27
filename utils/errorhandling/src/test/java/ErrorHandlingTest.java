package errorhandling;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import prompt.Prompt;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ErrorHandlingTest {
    
    @Test
    void sampleTest() {
        assertEquals(2, 1+1, "1+1 should be 2");
    }

    private Scanner input;

    @BeforeEach
    void setup() {
        // Default valid input
        input = new Scanner("42\n");
    }

    @ParameterizedTest
    @CsvSource({
        "int, 42",
        "double, 42.0",
        "float, 42.0",
        "char, 4",
        "string:Hello, Hello",
        "regex:\\d{2}, 42",
        "yesorno, Y",
        "intarray, 1 2 3",
        "doublearray, 1.0 2.0 3.0"
    })
    @DisplayName("Test successful parsing of various types")
    void testHandlePromptsVariousTypes(String type, String expected) {
        Prompt prompt = new Prompt("Enter value:", type);
        Scanner dynamicinput = new Scanner(expected +"\n");
        Object[] result = ErrorHandling.handlePrompts(List.of(prompt), dynamicinput);

        assertEquals(1, result.length);

        switch (type.split(":")[0].toLowerCase()) {
            case "int":
                assertTrue(result[0] instanceof Integer);
                assertEquals(Integer.parseInt(expected), result[0]);
                break;
            case "double":
                assertTrue(result[0] instanceof Double);
                assertEquals(Double.parseDouble(expected), (Double) result[0], 0.0001);
                break;
            case "float":
                assertTrue(result[0] instanceof Float);
                assertEquals(Float.parseFloat(expected), (Float) result[0], 0.0001);
                break;
            case "char":
                assertTrue(result[0] instanceof Character);
                assertEquals(expected.charAt(0), result[0]);
                break;
            case "string":
            case "regex":
                assertTrue(result[0] instanceof String);
                assertEquals(expected, result[0]);
                break;
            case "yesorno":
                assertTrue(result[0] instanceof String);
                assertTrue(((String) result[0]).equalsIgnoreCase(expected));
                break;
            case "intarray":
                assertTrue(result[0] instanceof int[]);
                int[] expectedIntArray = parseIntArray(expected);
                assertArrayEquals(expectedIntArray, (int[]) result[0]);
                break;
            case "doublearray":
                assertTrue(result[0] instanceof double[]);
                double[] expectedDoubleArray = parseDoubleArray(expected);
                assertArrayEquals(expectedDoubleArray, (double[]) result[0], 0.0001);
                break;
            default:
                fail("Unsupported type for testing: " + type);
        }
    }

    // Helper methods
    private int[] parseIntArray(String input) {
        return Arrays.stream(input.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private double[] parseDoubleArray(String input) {
        return Arrays.stream(input.trim().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }


    @Test
    @DisplayName("Test yesOrNo validation logic")
    void testHandleYesOrNo() {
        Scanner yesInput = new Scanner("Y\n");
        Prompt prompt = new Prompt("Accept? Y/N", "yesOrNo");

        Object[] result = ErrorHandling.handlePrompts(List.of(prompt), yesInput);

        assertEquals(1, result.length);
        assertEquals("Y", result[0]);
    }

    @Test
    @DisplayName("Test regex fails then passes")
    void testRegexInputValidation() {
        Scanner invalidThenValidInput = new Scanner("abc\n123\n");
        Prompt prompt = new Prompt("Enter 3-digit number:", "regex:\\d{3}");

        Object[] result = ErrorHandling.handlePrompts(List.of(prompt), invalidThenValidInput);

        assertEquals(1, result.length);
        assertEquals("123", result[0]);
    }
}
