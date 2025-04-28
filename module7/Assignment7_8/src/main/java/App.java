package assignment7_8;
import errorhandling.ErrorHandling;
import prompt.Prompt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        List<Prompt> prompts = List.of(
            new Prompt("Enter an array of numbers. Each number shoould be followed by a single space.", "doubleArray")
        );



        Object[] inputValues = ErrorHandling.handlePrompts(prompts, input);
        // Extracting an int[] from Object
        int[] numbers = (int[]) inputValues[0];

        // Extracting a double[]
        double[] doubles = (double[]) inputValues[1];


        int intAverage = Average.intAverage(numbers);
        double doubleAverage = Average.doubleAverage(doubles);

        String averageString = Arrays.toString(numbers);
        String doubleString = Arrays.toString(doubles);

        String messageString = String.format("The average of all of the integers is equal to %s and the average for all of the doubles is equal to %s.", averageString, doubleString);
        System.out.println(messageString);
    }

}
