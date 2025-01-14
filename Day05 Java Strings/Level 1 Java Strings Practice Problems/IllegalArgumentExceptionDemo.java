import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Using substring with start index greater than end index
        String subText = text.substring(5, 3); // This will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException with user input
    public static void handleException(String text) {
        try {
            // Using substring with start index greater than end index
            String subText = text.substring(5, 3); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter some text: ");
        String userInput = scanner.nextLine();

        // Call method to generate exception
        // Uncomment the line below to see the exception being thrown
        // generateException(userInput);

        // Call method to handle exception
        handleException(userInput);
    }
}
