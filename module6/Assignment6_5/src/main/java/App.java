package assignment6_5;

import java.util.Arrays;

import prompt.Prompt;
import errorhandling.ErrorHandling;

public class App {
    public static void main(String[] args){
        double num1 = Math.random() * 100000000;
        double num2 = Math.random() * 100000000;
        double num3 = Math.random() * 100000000;
        double[] numArray = {num1, num2, num3};
        String order = OrderDigits.OrderMyDigits(numArray);
        
        String inOrderMessage = String.format("These 3 numbers in order from largest to smallest :%s", order);
        System.out.println(inOrderMessage);
    }

}

