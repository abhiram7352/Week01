import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number to check for prime
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();

        // Prime number check logic
        boolean isPrime = true;

        // Check for numbers greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Displaying the result whether number is prime or not
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
