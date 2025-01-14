import java.util.*;
public class Problem1 {
    public static void main(String args[]) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number as dividend ");
		// Reading the first number
        int num1 = sc.nextInt(); 
        
        System.out.print("Enter the second number as divisor ");
		// Reading the second number
        int num2 = sc.nextInt(); 
        
        // Calculating the quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder 
                           + " of two numbers " + num1 + " and " + num2);
    }
}
