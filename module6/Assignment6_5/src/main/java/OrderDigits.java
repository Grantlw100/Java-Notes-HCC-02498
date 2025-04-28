package assignment6_5;
import java.util.Arrays;


public class OrderDigits {
    
    public static String OrderMyDigits(double[] numArray){
        Arrays.sort(numArray);
        String newNumString = String.format("\n1st number: %.5f \n2nd number: %.5f \n3rd number: %.5f \n", numArray[2], numArray[1], numArray[0]);
        
        return newNumString;
    }
}
