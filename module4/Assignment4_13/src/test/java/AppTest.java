package assignment4_13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @ParameterizedTest
    @CsvSource({
        "b, The letter b is a consonant.",
        "c, The letter c is a consonant.",  // Assuming non-leap year unless specified
        "d, The letter d is a consonant.",
        "f, The letter f is a consonant.",
        "g, The letter g is a consonant.",
        "q, The letter q is a consonant.",
        "a, The letter a is a vowel.",
        "u, The letter u is a vowel.",
        "o, The letter o is a vowel.",
        "i, The letter i is a vowel.",
        "e, The letter e is a vowel.",
    })
    void testCharacterValue(String letter, String expectedOutput) {
        assertEquals(expectedOutput, ConsonantOrVowel.DetermineConsonantOrVowel(letter));
    }
}
