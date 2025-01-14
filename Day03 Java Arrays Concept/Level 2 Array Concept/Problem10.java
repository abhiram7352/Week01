
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Find the digits in the number and calculate their frequency
        while (num > 0) {
		
	     	// Extract the last digit
            int digit = (int) (num % 10);   
	
			// Increment the frequency of the digit
            frequency[digit]++;  
			// Remove the last digit
            num /= 10; 
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { 
			    // Display only digits that appear
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}