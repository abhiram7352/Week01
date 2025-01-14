class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Conversion from yards to feet
        double yards2feet = 3;
        // Return the result 
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Conversion from feet to yards
        double feet2yards = 0.333333;
        // Return the result 
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion from meters to inches
        double meters2inches = 39.3701;
        // Return the result 
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion from inches to meters
        double inches2meters = 0.0254;
        // Return the result 
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        // Conversion from inches to centimeters
        double inches2cm = 2.54;
        // Return the result 
        return inches * inches2cm;
    }

    public static void main(String[] args) {
  

        // Converting 10 yards to feet
        double yards = 10;
		// Calling repective function call
        double feetFromYards = convertYardsToFeet(yards);
		
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        // Converting 30 feet to yards
        double feet = 30;
		// Calling repective function call
        double yardsFromFeet = convertFeetToYards(feet);
		
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        //Converting 5 meters to inches
        double meters = 5;
		// Calling repective function call
        double inchesFromMeters = convertMetersToInches(meters);
		
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");

        // Converting 50 inches to meters
        double inches = 50;
		// Calling repective function call
        double metersFromInches = convertInchesToMeters(inches);
		
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");

        // Converting 40 inches to centimeters
        double inchesToCm = 40;
        double cmFromInches = convertInchesToCentimeters(inchesToCm);
        System.out.println(inchesToCm + " inches is equal to " + cmFromInches + " centimeters.");
    }
}
