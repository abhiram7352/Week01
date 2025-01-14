// Importing Scanner for input
import java.util.Scanner; 

public class Problem7 {
    public static void main(String args[]) {
		// Creating Scanner for input
        Scanner sc = new Scanner(System.in); 

        // Reading first numbers
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt(); 
		
		// Reading second number
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt(); 

        // Swapping the numbers using a temporary variable
        int temp = num2;
        num2 = num1;
        num1 = temp;

        // Displaying the swapped numbers
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}
