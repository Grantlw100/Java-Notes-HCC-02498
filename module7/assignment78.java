import app.netlify.grantwilliams.errorhandling;
import app.netlify.grantwilliams.prompt;
import java.util.List;
import java.util.Scanner;

import java.util.*;
import java.util.regex.*;


public class assignment78 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        List<Prompt> prompts = List.of(
            new Prompt("Enter an array of numbers. Each number shoould be followed by a single space.", "doubleArray")
        )

        Object[] inputValues = Errorhandling.handlePrompts(prompts, input);
        // Extracting an int[] from Object
        int[] numbers = (int[]) inputValues[0];

        // Extracting a double[]
        double[] doubles = (double[]) inputValues[1];

    }

    public static int average(int[] intArray){
        int sum = 0;

        for (int i=0; i < intArray.length; i++){
            sum += intArray[i];
        }
        return sum;
    }

    public static double average(double[] doubleArray){
        int sum = 0;

        for (int i=0; i < doubleArray.length; i++){
            sum += doubleArray[i];
        }
        return sum;
    }
}
