import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Input height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Output of BMI index

        System.out.println("You are classified as: " + status);

      
    }
}
