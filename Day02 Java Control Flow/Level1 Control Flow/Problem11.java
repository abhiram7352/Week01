import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        
        // Infinite while loop
        while (true) {
            
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
			// Taking user input 
            double number = scanner.nextDouble();

            // Check if the number is 0 or negative
            if (number <= 0) {
			// Exit the loop if the number is 0 or negative
                break;  
            }
            
            // Adding the number to the total
            total += number;
        }

        // Display the total value after the loop ends
        System.out.println("The total sum is: " + total);

    }
}
