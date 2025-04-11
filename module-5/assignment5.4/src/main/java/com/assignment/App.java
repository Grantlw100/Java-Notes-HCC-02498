
package com.assignment;
import java.math.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // initiate variables
        double inValue;
        int roundAt = 0;
        String inUnit = "";
        boolean validInput = false;


    // Initiate scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for decimal value to be converted
        System.out.print("\nEnter the distance to be converted as a decimal number: ");

        // validate the users input to verify if it is  double 
        while (!input.hasNextDouble()) {
            System.out.println("\nInvalid input. Please enter a valid decimal number \nExamples include 1.0 || 10. || .10 || 10:");
            input.next(); // clears invalid input
        }        
        // after validation save input as inValue to figure 
        inValue = input.nextDouble();
        System.out.println("\nYou entered: " + inValue);


        // Prompt the user f\nor the significant digits trailing behind 0
        System.out.print("\nEnter an integer value to round to: ");

        // validate user input to ensure they used an integer value
        while (!input.hasNextInt()) {
            System.out.println("\nInvalid input. Please enter a valid integer to round your conversion to:");
            input.next(); // clears invalid input
        }
        // after validation save input as round to figure 
        roundAt = input.nextInt();
        System.out.println("\nYou entered: " + roundAt);


        // Validate the input of the inUnit within a while loop 
        while(!validInput){
            System.out.println( "\nPlease enter the unit of measurement associated with the distance\n(Enter mi for Miles or km for kiloMeters) for your conversion." );
            inUnit = input.next().toLowerCase(); 
            // if the input is one of the units required, convert the value, reset the unit to the unit converted to, write the first portion of the outputString statement 
            if (inUnit.equals("mi") || inUnit.equals("km")) {
                validInput = true;
            } else {
                System.out.println("\nInvalid input. \n Please enter the unit associated with the distance.\nEnter mi for miles or km for kilometers.");
                continue;
            }
        }        
        
        Distance programDistance = new Distance(inValue, inUnit, roundAt);

        programDistance.createDistanceTable();


    }

}