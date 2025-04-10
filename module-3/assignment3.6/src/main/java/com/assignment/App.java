package com.assignment;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Hello, to start, will you be using the Metric System or the Imperial System? \n OTHER SYSTEMS OF MEASUREMENT NOT CURRENTLY SUPPORTED \n If Using the Metric System enter Y. If using the Imperial system enter N." );
        char metric = scanner.next().charAt(0);
        

        if (metric == 'Y') {
            System.out.println( "Please enter your weight in kilograms: " );
            double weight = scanner.nextDouble();
            System.out.println( "Please enter your height in meters: " );
            double height = scanner.nextDouble();
            double userBMI = BMI.calculateBMI(weight, height, metric);
            String BMICat = BMI.getBMICategory(userBMI);
            System.out.println( "Your BMI is: " + userBMI + " and you are: " + BMICat );
        } else if (metric == 'N') {
            System.out.println( "Please enter your weight in pounds: " );
            double weight = scanner.nextDouble();
            System.out.println( "Please enter your height in inches: " );
            double height = scanner.nextDouble();
            double userBMI = BMI.calculateBMI(weight, height, metric);
            String BMICat = BMI.getBMICategory(userBMI);
            System.out.println( "Your BMI is: " + userBMI + " and you are: " + BMICat );
        } else {
            System.out.println( "Invalid input. Please enter Y or N." );
        }
    
    }
}
