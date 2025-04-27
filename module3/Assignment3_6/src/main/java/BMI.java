package assignment3_6;

public class BMI {
    public static double calculateBMI(double weight, double height, char metric) {
        if (metric == 'N') {
            // Convert weight from pounds to kilograms
            weight /= 2.20462;
            // Convert height from inches to meters
            height /= 39.3701;
        } 
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
