package assignment4_13;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static String DetermineConsonantOrVowel(String letter){
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";

        // Turn the "Letter" string into a character and search for its index
        char letterChar = letter.charAt(0); // Convert the letter to a char
        String reply = consonants.indexOf(letterChar) != -1 ? "The letter " + letter + " is a consonant." : "The letter " + letter + " is a vowel.";
        return reply;
    }
}
