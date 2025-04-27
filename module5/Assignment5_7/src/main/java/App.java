package assignment5_7;
import java.util.List;
import java.util.Scanner;
import prompt.Prompt;
import errorhandling.ErrorHandling;

/**
 * mvn exec:java -Dexec.mainClass="com.assignment.App"
        run the app from the cli 
 *
 */
public class App 
{
    //
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        List<Prompt> prompts = List.of(
            new Prompt("Please enter the initial cost of tuition. \nPlease enter a decimal value.", "float"),
            new Prompt("Please enter the amount of years to calculate the cost against. \nPlease enter an integer value.", "float"),
            new Prompt("What is the rate of change for tuition or the percent increase of tuition?", "percent"),
            new Prompt("Would you like to calculate the cost of tuition beginning on a specified year and ending 4 years after?", "yesorno")
        );


        List<Prompt> prompts2 = List.of(
            new Prompt("Please enter the year you plan on attending college. Example: 2025", "int"),
            new Prompt("Please enter the year you plan on finishing college. Example: 2029", "int")
        );


        Object[] results = ErrorHandling.handlePrompts(prompts, input);

        float initialCost = (float) results[0];
        float yearsCalculated = (float) results[1];
        float rateOfChange = (float) results[2];
        boolean myTuitionBool = (boolean) results[3];
        int firstYear = 0;
        int lastYear = 0;
        

        String totalTuition = "";
        String paidTuition = "";

        if (myTuitionBool == true)
        {
            Object[] results2 = ErrorHandling.handlePrompts(prompts2, input);
            firstYear = (int) results2[0];
            lastYear = (int) results2[1];
        }

        
        Tuition myTuition = new Tuition(initialCost, yearsCalculated, rateOfChange, firstYear, lastYear);
        paidTuition = myTuition.yearsOfCalculation();
        totalTuition = myTuition.costAfterYears();

        System.out.println(totalTuition + "\n\n" + paidTuition);

        System.exit(0);

    }

        // call the function, place up to 3 different values and validate their type and value
        // Make sure to allow null values within the code
        // exception block

        // duplicate codde for other lame ass responses
}
