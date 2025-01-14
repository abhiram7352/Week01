import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user to input three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
		
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
		
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Checking first number is the largest or not
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

         // Checking second number is the largest or not
        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Checking third number is the largest or not
        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
		
    }
}
