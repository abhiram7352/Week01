import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        
        // Variable to store the user input value
        double number;

        // Use a while loop to keep asking for input until the user enters 0
        do {
            System.out.print("Enter a number : ");
            number = sc.nextDouble();
            
            // If the number is not 0, add it to the total
            if (number != 0) {
                total += number;
            }

        } while (number != 0);  // Continue until user enters 0
        
        // Display the total value
        System.out.println("The total sum is: " + total);
    }
}
