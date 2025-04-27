package assignment2_2;
import java.util.Scanner;

public class App 
{
    public static double subtotal(double subtotal,double gratuityRate) {
        // Calculate the gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

       // Display the gratuity and total
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
        return total;
    }

    public static void main(String[] args) {
        // Ask the user for the temperature in Fahrenheit
        System.out.println("Enter the subtotal: ");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        double subtotal = scanner.nextDouble();

        // Grab the gratuity rate
        System.out.println("Enter the gratuity rate: ");
        Scanner newScanner = new Scanner(System.in);

        double gratuityRate = newScanner.nextDouble();

        // Calculate the total
        subtotal(subtotal,gratuityRate);
    }
}
