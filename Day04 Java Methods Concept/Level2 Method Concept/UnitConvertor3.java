class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
		
        // Conversion from Fahrenheit to Celsius
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
		
        // Returning the result in celsius
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
		
        // Conversion from Celsius to Fahrenheit
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
		
        // Returning the result inn Fahrenheit
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
		
        // Conversion from pounds to kilograms
        double pounds2kilograms = 0.453592;
		
        // Returning the result in kg
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion from kilograms to pounds
        double kilograms2pounds = 2.20462;
        // Returning the result in pound
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
		
        // Conversion from gallons to liters
        double gallons2liters = 3.78541;
		
        // Returning the result in liters
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
		
        // Conversion from liters to gallons
        double liters2gallons = 0.264172;
        // Returning the result gallons
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Test the UnitConvertor methods

        // converting 100 Fahrenheit to Celsius
        double fahrenheit = 100;
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusFromFahrenheit + " Celsius.");

        // converting 25 Celsius to Fahrenheit
        double celsius = 25;
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit.");

        // converting 150 pounds to kilograms
        double pounds = 150;
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");

        // converting 70 kilograms to pounds
        double kilograms = 70;
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");

        // converting 10 gallons to liters
        double gallons = 10;
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");

        //converting 50 liters to gallons
        double liters = 50;
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
