package assignment3_6;

public class Days {

    
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 2:
                return (isLeapYear) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

   
    public static String getMonthName(int month) {
        switch (month) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return null; // Invalid month
        }
    }
}
