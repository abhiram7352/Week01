import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a input from user to find out each factor
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        // Check for valid input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The multiples of " + number + " below 100 are:");

            // Loop to find multiples in reverse order
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i); // Print each factor
                }
            }
        }
    }
}
