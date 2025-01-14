import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Taking positive user input value
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check if the user has entered a positive integer
        if (num < 0) {
            System.out.println("Not possible to find the factorial value ");
        } else {
            // Initialize factorial to 1 (since factorial of 0 is 1)
            long factorial = 1;

            // Using while loop to compute the factorial
            int i = 1;
            while (i <= num) {
                factorial *= i;  
                i++;
            }

            // Print the factorial result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

       
    }
}
