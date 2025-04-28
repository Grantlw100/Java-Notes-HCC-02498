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
        
        boolean validInput = false;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String letter = "";

        
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
        // Initialize all variables and comparison strings
        String reply = ConsonantOrVowel.DetermineConsonantOrVowel(letter);
        
        // Print to the user whether the character was a consonant or a vowel
        System.out.println(reply);

        
    }
}
