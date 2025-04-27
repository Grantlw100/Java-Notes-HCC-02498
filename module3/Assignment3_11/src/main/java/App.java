package assignment3_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for year
        System.out.print("Enter a 4-digit year (e.g., 2025): ");
        int year = scanner.nextInt();

        // Prompt the user for month
        System.out.print("Enter a month number (1 = January, 12 = December): ");
        int month = scanner.nextInt();

        // Get results from Days class
        int days = Days.getDaysInMonth(month, year);
        String monthName = Days.getMonthName(month);

        if (days == -1 || monthName == null) {
            System.out.println("Invalid month. Please try again.");
        } else {
            System.out.println("It is currently " + monthName + " of " + year
                + " and there are " + days + " days in this month.");
        }

        scanner.close();
    }
}
