package assignment7_8;
public class Average {
    
    public static int intAverage(int[] intArray){
        int sum = 0;

        for (int i=0; i < intArray.length; i++){
            sum += intArray[i];
        }
        return sum;
    }

    public static double doubleAverage(double[] doubleArray){
        int sum = 0;

        for (int i=0; i < doubleArray.length; i++){
            sum += doubleArray[i];
        }
        return sum;
    }
}
