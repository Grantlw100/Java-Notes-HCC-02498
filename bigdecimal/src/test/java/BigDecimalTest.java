package bigdecimal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BigDecimalTest {

    @ParameterizedTest
    @CsvSource({
        "30.987654321, 30.987654321",
        "30.987654321, 30.98765432",
        "30.987654321, 30.9876543",
        "30.987654321,30.987654",
        "30.987654321,30.98765",
        "30.987654321,30.9877",
        "30.987654321,30.988",
        "30.987654321,30.99",
        "30.987654321,30.0",
    })
    

    @Test
    public static void TestBigDouble(double decimal, double expectedReturn){
        for (int i = 10; i > 0; i-- ){
            assertEquals(expectedReturn, BigDecimal.createBigDecimal(decimal, i));
        }
    }
}
