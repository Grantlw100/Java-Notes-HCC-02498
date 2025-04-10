package com.assignment;
import java.util.Scanner;
import java.math.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize all necessary variables
        double sideLength = 0;
        String units = "";
        int roundTo = 0;
        boolean validInput = false;
        boolean roundValidInput = false;


        while (!validInput) {
            System.out.println("What is the length of one side of your hexagon?");
            if (scanner.hasNextDouble()) {
                sideLength = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        while (!roundValidInput) {
            System.out.println("How many decimal places would you like in your answe?");
            if (scanner.hasNextInt()) {
            roundTo = scanner.nextInt();
            roundValidInput = true;
        } else {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
    }
        
        System.out.println("Please enter the units associated with the length of the side.");
        units = scanner.next();

        double area = (6 * (sideLength * sideLength))/(4*Math.tan(Math.PI/6));

        
        // Create Big decimal for rounding
        BigDecimal bd = new BigDecimal(area);
        bd = bd.setScale(roundTo, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();


        String answer = "The area of the Hexagon is "+ roundedNumber + " " + units + "\u00b2";
        
        System.out.println(answer);


    }
}
