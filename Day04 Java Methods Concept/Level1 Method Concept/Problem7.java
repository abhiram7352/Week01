import java.util.Scanner;

public class Problem7 {

    public static int findSum(int n){
	    int sum = 0;
        int count = 1;
        while (count <= n) {
            sum += count;
            count++;
        }
		
		return sum;
	
	}
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input (natural number)
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number or not
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
			// Calling findSum method to sum all natural number
			int totalSum= findSum(n); 
			
            // Displaying the sum of n natural number
            System.out.println("Sum of N natural number is: " + totalSum);
       }
    }
}
