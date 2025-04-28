package assignment3_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "1, 31",
        "2, 28",  // Assuming non-leap year unless specified
        "3, 31",
        "4, 30",
        "5, 31",
        "6, 30",
        "7, 31",
        "8, 31",
        "9, 30",
        "10, 31",
        "11, 30",
        "12, 31"
    })
    void testDaysInMonth(int month, int expectedDays) {
        int year = 2001; // Non-leap year assumed
        assertEquals(expectedDays, Days.getDaysInMonth(month, year));
    }

    @ParameterizedTest
    @CsvSource({
        "1, January",
        "2, February",
        "3, March",
        "4, April",
        "5, May",
        "6, June",
        "7, July",
        "8, August",
        "9, September",
        "10, October",
        "11, November",
        "12, December"
    })
    void testGetMonthName(int month, String expectedName) {
        assertEquals(expectedName, Days.getMonthName(month));
    }
}
