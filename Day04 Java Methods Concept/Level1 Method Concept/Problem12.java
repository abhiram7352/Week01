import java.util.Scanner;

public class Problem12 {

    // Method to calculate trigonometric functions-> sin cos, and tan
    public double[] calculateTrigonometricFunctions(double angle) {
	
        // Converting  the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sin, cos, and tan of the angle
        double sinV = Math.sin(radians);
        double cosV = Math.cos(radians);
        double tanV = Math.tan(radians);

        // Return the results as an array of doubles
		
        return new double[]{sinV, cosV, tanV};
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Enter the user for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an instance of Problem12 class
        Problem12 calculator = new Problem12();

        // Calculate the trigonometric values
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("For an angle of: "+ angle);
        System.out.println("Sin"+angle+" is : "+ results[0]);
        System.out.println("cos"+angle+" is : "+ results[1]);
        System.out.println("tan"+angle+" is : "+ results[2]);

        // Close the scanner
        scanner.close();
    }
}