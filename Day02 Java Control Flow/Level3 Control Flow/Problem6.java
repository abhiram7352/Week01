import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
	    // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Getting input values for the first number, second number, and operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        
        System.out.print("Enter the operator we have(+, -, *, /): ");
        String op = scanner.next();
        
        // Performing specific operations based on the input value of the operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check if the second number is not zero to avoid division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
