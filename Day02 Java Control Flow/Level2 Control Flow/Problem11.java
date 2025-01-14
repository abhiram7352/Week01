import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check for valid input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The factors of " + number + " are:");

            // Loop to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i); // We print each and every factor
                }
            }
        }
    }
}
