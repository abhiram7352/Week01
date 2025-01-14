import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and dynamically resize array if needed
        while (number != 0) {
            if (index == maxDigit) {
                // Resize the array by increasing maxDigit by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Assign the resized array back to digits
            }
            digits[index] = number % 10;  // Here we are getting last digit of number
            number /= 10; // Remove the last digit from the number
            index++;
        }

        // Initialize variables to store the largest and second-largest digits
        int largestDigit = -1;
        int secondLargestDigit = -1;

         // Here we are finding the larget and smallest digits of number
        for (int i = 0; i < index; i++) {
            if (digits[i] > largestDigit) {
                secondLargestDigit = largestDigit; // Update second largest
                largestDigit = digits[i]; // Update largest
            } else if (digits[i] > secondLargestDigit && digits[i] != largestDigit) {
                secondLargestDigit = digits[i]; // Update second largest if valid
            }
        }

        // Displaying the expected results
        System.out.println("Digits stored in the array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Second largest digit: " + (secondLargestDigit == -1 ? "None" : secondLargestDigit));
    }
}
