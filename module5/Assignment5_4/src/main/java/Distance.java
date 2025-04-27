package assignment5_4;
import java.math.*;      // imports (SECOND, optional)
import java.util.Scanner; 

public class Distance {
        public double inValue = 0.0;
        public int roundAt = 0;
        public String inUnit = "mi";
        public String inUnitLong = "Miles";
        public double conversionRate = 1.609344;
        public double outValue = 0.0;
        public String outUnit = "km";
        public String outUnitLong= "Kilometers";
        
    // Create Big decimal for rounding
    public static double createBigDecimal(double BigDecimalValue, int roundTo){
        BigDecimal bd = new BigDecimal(BigDecimalValue);
        bd = bd.setScale(roundTo, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        return roundedNumber;
    }


    public Distance(double inValue, String inUnit, int roundAt) {
        if (inUnit.equals("mi")){
            this.inValue = inValue;
            outValue = createBigDecimal(inValue * conversionRate, roundAt);
            this.roundAt = roundAt;
        } else {
            this.inValue = inValue;
            this.inUnit = inUnit;
            inUnitLong = "Kilometers";
            conversionRate = 0.621371;
            outValue = createBigDecimal(inValue * conversionRate, roundAt);
            outUnit = "mi";
            outUnitLong = "Miles";
            this.roundAt = roundAt;
        }
    }

    public void createDistanceTable(){
        System.out.println(inUnitLong+ "  -->  "+ outUnitLong);

        int i;

        for ( i = 1 ; i <= inValue; ++i){
                double outTableValue = createBigDecimal((double)i * conversionRate, roundAt);
                System.out.println( i + " " + inUnit + "\t\t" + outTableValue + " " + outUnit);
        }
        
        if (inValue - (double) i + 1.0 != 0){
            System.out.println( inValue +" " + inUnit + "\t\t" + createBigDecimal(inValue * conversionRate, roundAt) + " " + outUnit );
        }

        // after rounding finish building the outputString statement and print to the user
        System.out.println("\nThe Conversion from " + inValue + " " +inUnitLong +" to " +outUnitLong + " is " + createBigDecimal(inValue*conversionRate, roundAt) + " " + outUnit);
    }

}