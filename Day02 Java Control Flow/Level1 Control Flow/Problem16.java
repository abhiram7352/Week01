import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking number is natural or not
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Use a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // If the number is divisible by 2, so it's even
                    System.out.println(i + " is an even number.");
                } else {
                    // If the number is not divisible by 2, so it's odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }

    }
}
