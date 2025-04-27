package assignment4_13;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initialize all variables and comparison strings
        String letter = "";
        boolean validInput = false;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Valid the input to ensure it is a letter or ask for a new letter
        while (!validInput) {
            System.out.println("Please enter a letter to check if the letter is a vowel or a consonant.");
            letter = scanner.next().toLowerCase(); // Read input and convert to lowercase
            if (alphabet.contains(letter) && letter.length() == 1) {
                validInput = true;
            } else {
                System.out.println("Please enter a valid letter.");
            }
        }

        // Turn the "Letter" string into a character and search for its index
        char letterChar = letter.charAt(0); // Convert the letter to a char
        String reply = consonants.indexOf(letterChar) != -1 ? "The letter " + letter + " is a consonant" : "The letter " + letter + " is a vowel.";
        
        // Print to the user whether the character was a consonant or a vowel
        System.out.println(reply);

        
    }
}
