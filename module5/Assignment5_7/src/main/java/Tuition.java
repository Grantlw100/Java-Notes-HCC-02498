package assignment5_7;
import java.time.LocalDate;
import java.lang.Math.*;

public class Tuition {

    public float initialCost;
    public float yearsCalculated;
    public float rateOfChange;
    public Integer firstYear;   // Nullable
    public Integer lastYear;    // Nullable
    public int currentYear = LocalDate.now().getYear(); // primitive is okay here

    public Tuition(float initialCost, float yearsCalculated, float rateOfChange, 
                   Integer firstYear, Integer lastYear) {
        this.initialCost = initialCost;
        this.yearsCalculated = yearsCalculated;
        this.rateOfChange = rateOfChange + 1.0f;
        this.firstYear = Math.min((firstYear - currentYear), (lastYear - currentYear));
        this.lastYear = Math.max((firstYear - currentYear), (lastYear - currentYear));  
    }

    public float calculateTotalTuition() {
        float result = initialCost;
        for (int i = 1; i <= yearsCalculated; i++) {
            result *= (rateOfChange);
        }
        return result;
    }

    public Float calculateMyTuition() {
        if (firstYear == null || lastYear == null) {
            System.out.println("firstYear and lastYear must not be null.");
            return null;
        }

        float costMyTuition = 0.0f;
        float cost = initialCost;

        
        for (int i = 0; i < lastYear; i++) {
            cost *= (rateOfChange);
            System.out.println(String.format("%.2f and %d", cost, (i + currentYear)));
            if (i > firstYear && i < lastYear){
                costMyTuition += cost;
            }
        }
        return costMyTuition;
    }

    public String yearsOfCalculation() {
        if (firstYear == null || lastYear == null) {
            return "No year range provided.";
        }
        return String.format("The cost of your tuition from %d to %d is %.2f", firstYear + currentYear, lastYear + currentYear, calculateMyTuition());
    }

    public String costAfterYears() {
        return String.format("The cost of tuition in year %d is %.2f", (int) (currentYear + yearsCalculated), calculateTotalTuition());
    }
}
