import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user to input three numbers
        System.out.print("Enter the first number: ");
		// Read number 1
        int number1 = scanner.nextInt(); 
		
        System.out.print("Enter the second number: ");
		// Read number 2
        int number2 = scanner.nextInt(); 
		
        System.out.print("Enter the third number: ");
		// Read number 3
        int number3 = scanner.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

    }
}
