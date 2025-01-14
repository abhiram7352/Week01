import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
	    // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
         // Ask user to take input and store in number variable
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Initialize sum variable to 0
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // Check if sum is greater than number
        if (sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is not an Abundant Number.");
        }
    }
}
