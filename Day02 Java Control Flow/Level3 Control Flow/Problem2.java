import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
		// Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to take input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize count variable to 0
        int count = 0;
        
        // Loop to iterate until number is not equal to 0
        while (number != 0) {
		
            // Remove the last digit from number in each iteration
            number /= 10;
            
            // Increase count by 1 in each looping
            count++;
        }
        
        // Display the count to show the number of digits
        System.out.println("The number of digits is: " + count);
    }
}
