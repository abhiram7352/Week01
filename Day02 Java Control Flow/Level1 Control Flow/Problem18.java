import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Calculate and print the result of multiplication
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
