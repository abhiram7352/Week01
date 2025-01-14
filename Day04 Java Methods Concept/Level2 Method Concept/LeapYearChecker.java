import java.util.Scanner;

class LeapYearChecker {

    // Method to check if a given year is a leap year based on the provided conditions
    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
            
            // Checking the condition of leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;   // The year is a leap year
            } else {
                return false;    // The year is not a leap year
            }
    
    }

    public static void main(String[] args) {
	
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a year to check that it's a leap year: ");
        int year = scanner.nextInt();  // Take a user input

        // Checking it's a leap year or not
        boolean result = isLeapYear(year);

        // Output whether the year is a leap year or not
        if (result) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner object
        scanner.close();
    }
}
