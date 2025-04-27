package assignment6_5;

import java.util.Arrays;

import com.assignment.ErrorHandling;
import com.assignment.Prompt;

public class assignment65 {
    public static void main(String[] args){
        double num1 = Math.random() * 100000000;
        double num2 = Math.random() * 100000000;
        double num3 = Math.random() * 100000000;

        orderMyDigits(num1, num2, num3);
    }

    public static void orderMyDigits(double num1, double num2, double num3){
        Double[] numArray = {num1, num2, num3};
        Arrays.sort(numArray);
        String inOrderMessage = "These 3 numbers in order from largest to smallest :\n";

        inOrderMessage += String.format("1st number: %.5f \n2nd number: %.5f \n3rd number: %.5f \n", numArray[2], numArray[1], numArray[0]);
        System.out.println(inOrderMessage);
    }
}

