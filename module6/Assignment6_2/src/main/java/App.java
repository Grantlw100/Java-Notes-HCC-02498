package assignment6_2;
import java.lang.Math.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args){
        long l = (long) (Math.random() * 1000);
        System.out.println(l);
        int sum = sumDigits(l);
        System.out.println(sum);
    }
    
    public static int sumDigits(long num){
        int sum = 0;
        int iterations = String.valueOf(num).length();

        for (int i = 1; i <= iterations; i++){
            int value = (int) num % 10;
            num /= 10;
            sum += value;
            System.out.println(String.format("%d integer and %d sum", value, sum));
        }    
        return sum;
    }
}
