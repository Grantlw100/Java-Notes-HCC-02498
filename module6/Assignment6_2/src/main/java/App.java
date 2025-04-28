package assignment6_2;
import java.lang.Math.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args){
        long l = (long) (Math.random() * 1000);
        System.out.println(l);
        int sum = SumDigits.SumUpDigits(l);
        System.out.println(sum);
    }
    
}
