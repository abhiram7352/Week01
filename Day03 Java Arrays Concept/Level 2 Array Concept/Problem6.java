import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
	    // Creating the scanner object to readd the user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons : ");
        int numPersons = scanner.nextInt();

        // Arrays to store the weight, height, BMI, and weight status of a person
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Take a user input for the weight and height of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();
            
            // Calculating BMI of a person
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";    // underweight condition
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";  // Normal weight condition
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";  // overweight condition
            } else {
                status[i] = "Obese";   
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person :"+(i + 1)+" weight is "+weight[i]+" and height is"+height[i]+" and bmi is "+ bmi[i]+ " and status is" + status[i]);
        }
    }
}