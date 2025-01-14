import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
	    // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to take input ()
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define sum variable and initialize it to zero
        int sum = 0;
        
        // Define originalNumber variable and assign it to the input number
        int originalNumber = number;
        
        // Use while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder by using the modulus operator
            int remainder = originalNumber % 10;
            
            // Find the cube of the remainder and add it to the sum
            sum += remainder * remainder * remainder;
            
            // Find the quotient of the number and assign it to originalNumber
            originalNumber /= 10; 
        }
        
        // Check if the number and the sum are the same or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
