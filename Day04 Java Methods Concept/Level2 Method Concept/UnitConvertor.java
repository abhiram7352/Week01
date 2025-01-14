import java.util.*;
class UnitConvertor {

    // Method to converting kilometers to miles
    public static double convertKmToMiles(double km) {
	
	
        // Convert from kilometers to miles
        double km2miles = 0.621371;
		
        // Return the result 
        return km * km2miles;
    }

    // Method to converting miles to kilometers
    public static double convertMilesToKm(double miles) {
        // Convert from miles to kilometers
        double miles2km = 1.60934;
		
        // Return the result 
        return miles * miles2km;
    }

    // Method to converting meters to feet
    public static double convertMetersToFeet(double meters) {
        // Convert from meters to feet
        double meters2feet = 3.28084;
		
        // Return the result
        return meters * meters2feet;
    }

    // Method to converting feet to meters
    public static double convertFeetToMeters(double feet) {
        // Converting from feet to meters
        double feet2meters = 0.3048;
		
        // Return the result 
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        // Convering 10 kilometers to miles
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Converting 5 miles to kilometers
        double miles2 = 5;
        double km2 = convertMilesToKm(miles2);
        System.out.println(miles2 + " miles is equal to " + km2 + " kilometers.");

        // Converting 100 meters to feet
        double meters = 100;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Converting 50 feet to meters
        double feet2 = 50;
        double meters2 = convertFeetToMeters(feet2);
        System.out.println(feet2 + " feet is equal to " + meters2 + " meters.");
    }
}
