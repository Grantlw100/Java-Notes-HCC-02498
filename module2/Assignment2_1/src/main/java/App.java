package assignment2_1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        return fahrenheit;
    }

    public static void main(String[] args) {
        // Ask the user for the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the temperature in Fahrenheit
        double Celsius = scanner.nextDouble();

        // Convert the temperature to Fahrenheit
        celsiusToFahrenheit(Celsius);
    }
}
