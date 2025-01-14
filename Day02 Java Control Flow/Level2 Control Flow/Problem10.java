import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number and Power
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result variable
        int result = 1;

        // Calculate the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);


    }
}
