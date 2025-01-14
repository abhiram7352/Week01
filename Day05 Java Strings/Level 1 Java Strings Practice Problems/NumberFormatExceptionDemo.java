import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Using Integer.parseInt() to convert a string to an integer
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
    }

    // Method to handle NumberFormatException with user input
    public static void handleException(String text) {
        try {
            // Using Integer.parseInt() to convert a string to an integer
            int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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
