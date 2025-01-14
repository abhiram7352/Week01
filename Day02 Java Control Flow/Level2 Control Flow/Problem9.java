import java.util.Scanner;

public class Problem9 {
    // Creating scanner object to read user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("No greatest factor exists for numbers less than or equal to 1.");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor variable

            // Loop to find the greatest factor
            for (int i = number/2; i > 0; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Exit the loop once the greatest factor is found
                }
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }
    }
}
