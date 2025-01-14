import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
	
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int persons = sc.nextInt();


        // Create a 2D array to store weight, height, and BMI
        double[][] personData = new double[persons][3];
        // Create a string array to store the weight status
        String[] weightStatus = new String[persons];

        // Input weight and height, calculate BMI, and determine weight status
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            // Inputing  weight here
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Please re-enter.");
                }
            } while (personData[i][0] <= 0);

            // Here taking input of height
            do {
                System.out.print("Enter height  : ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Enter a valid height !! ");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and storing 2D matrix in 3d column
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Here we are determine the weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and status of each person
        System.out.println("Person Details: ");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person "+
                              i + 1+" weight is "+ personData[i][0] +" and height is "+ personData[i][1] +" and BMI is " + personData[i][2]+ " and weightStatus is "+weightStatus[i]);
        }
    }
}
