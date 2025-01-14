import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
	    // Creating the scanner object to readd the user input
        Scanner scanner = new Scanner(System.in);

        // Taking input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        //  Store the digits in an array
        int[] digitsOfNumber = new int[digitCount];
        int index = 0;

        while (number != 0) {
            digitsOfNumber[index] = number % 10;   // Extract last digit from the number
            number /= 10;   // Removing the last digit from number
            index++;
        }

        // Display the digits in reverse order
        System.out.println("The reversed number is: "  );
        for (int i = 0; i < digitsOfNumber.length; i++) {
            System.out.print(digitsOfNumber[i]);
        }
        System.out.println();
    }
}
