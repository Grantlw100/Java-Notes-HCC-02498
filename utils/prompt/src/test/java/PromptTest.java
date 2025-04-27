package prompt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PromptTest {

    @Test
    @DisplayName("Prompt stores and returns values correctly")
    void testPromptStorage() {
        Prompt prompt = new Prompt("Enter your age:", "int");

        assertEquals("Enter your age:", prompt.getMessage());
        assertEquals("int", prompt.getType());
    }
}
