import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Calculate the sum of the first 'number' natural numbers using the formula
            int sum = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
