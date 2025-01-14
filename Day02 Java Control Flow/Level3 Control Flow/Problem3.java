import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
		// Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for checking number is Harshad or not
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Initialize sum variable to 0
        int sum = 0;
        
        // Make a copy of the original number to work with
        int originalNumber = num;
        
        // Loop to access all the digit of umber
        while (originalNumber != 0) {
            // Find the remainder which is the last digit
            int remainder = originalNumber % 10;
            
            // Add the digit to the sum
            sum += remainder;
            
            // Remove the last digit from the original number
            originalNumber /= 10;
        }
        
        // Check if the number is perfectly divisible by the sum
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}
