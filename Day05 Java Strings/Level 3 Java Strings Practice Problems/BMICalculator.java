import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] heightWeight = new double[10][2];

        // Take user input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter height (in cm) of person %d: ", i + 1);
            heightWeight[i][1] = scanner.nextDouble();

            System.out.printf("Enter weight (in kg) of person %d: ", i + 1);
            heightWeight[i][0] = scanner.nextDouble();
        }

        String[][] bmiData = calculateBMI(heightWeight);

        displayBMIData(bmiData);

        scanner.close();
    }

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeight) {
        String[][] bmiData = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1] / 100; // Convert cm to meters

            double bmi = weight / (height * height);
            String status = getBMIStatus(bmi);

            bmiData[i][0] = String.format("%.2f", heightWeight[i][1]); // Height in cm
            bmiData[i][1] = String.format("%.2f", weight); // Weight in kg
            bmiData[i][2] = String.format("%.2f", bmi); // BMI
            bmiData[i][3] = status; // Status
        }

        return bmiData;
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        for (String[] row : bmiData) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
