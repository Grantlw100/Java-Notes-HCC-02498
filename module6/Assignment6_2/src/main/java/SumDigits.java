package assignment6_2;

public class SumDigits {
    
    public static int SumUpDigits(long num){
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
