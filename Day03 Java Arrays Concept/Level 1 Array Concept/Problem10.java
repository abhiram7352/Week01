import java.util.Scanner;

public class Problem10 {
     // Creating scanner object to read user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Enter a valid number: ");
            return;
        }

        // Create a String array to save results
        String[] results = new String[number + 1];

        // looping from 0 to the number and apply the logic FizzBuzz
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
