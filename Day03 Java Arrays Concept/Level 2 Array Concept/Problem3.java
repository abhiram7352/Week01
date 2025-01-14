import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
	    // Creating the scanner object to readd the user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input for further coding
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
		// Maximum size of the array we have told in question
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Finding all the digits and store them in the array
        while (number != 0) {
            if (index >= maxDigit) {
                System.out.println("Exceed maximum digit limit of " + maxDigit);
                break;
            }
            digits[index] = number % 10; // Getting the  last digit
            number /= 10;  // Remove last digit of number
            index++;
        }

        // Initialize variables to store the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Here we are finding the larget and smallest digits of number
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Updating the second largest
                largest = digits[i];  // Updating the  largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];   // store in second largest if valid
            }
        }

        System.out.println("Digits stored in the array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
		
        System.out.println();

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));
    }
}
