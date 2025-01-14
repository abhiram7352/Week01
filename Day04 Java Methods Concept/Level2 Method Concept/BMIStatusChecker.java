import java.util.Scanner;

public class BMIStatusChecker {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height); // BMI formula: weight (kg) / height (m)^2
    }

    // Method to determine BMI status based on BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";   // BMI is less than or equal to 18.4
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";     // BMI is between 18.5 and 24.9
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";   // BMI is between 25.0 and 39.9
        } else {
            return "Obese";    // BMI is greater than or equal to 40.0
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store weight, height, BMI, and BMI status for 10 persons
        double[][] personData = new double[10][3]; // 10 persons, each with weight, height, and BMI
        String[] bmiStatus = new String[10]; // Array to store BMI status for each person

        // Collect data and calculate BMI for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            // Get weight and height from user input
            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (in cm): ");
            double height = scanner.nextDouble();

            // Store weight and height in the array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI and store in the array
            double bmi = calculateBMI(weight, height);
            personData[i][2] = bmi;

            // Determine the BMI status and store it
            bmiStatus[i] = getBMIStatus(bmi);
        }

        // Output the BMI and status for each person
        System.out.println("\nBMI and Status for each person:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm, BMI: " + personData[i][2] + ", Status: " + bmiStatus[i]);
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
