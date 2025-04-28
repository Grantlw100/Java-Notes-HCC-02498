package bigdecimal;

/************************************************************************************************************************************************************************************/
/*                                                                                                                                                                                  */
/*                              INPUT VALIDATOR                                                                                                                                     */
/* Use this function to validate all inputs. Usage directions at the bottom.                                                                                                        */
/*                                                                                                                                                                                   */
/************************************************************************************************************************************************************************************/


public class BigDecimal {
    // public static void main(String[] args) {
    //     System.out.println("Running from class: " + Prompt.class.getName());
    //     System.out.println("Class location: " + Prompt.class.getResource("Prompt.class"));
    // }
    // Create Big decimal for rounding
    public static double createBigDecimal(double BigDecimalValue, int roundTo){
        BigDecimal bd = new BigDecimal(BigDecimalValue);
        bd = bd.setScale(roundTo, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        return roundedNumber;
    }
}

