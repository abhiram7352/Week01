import java.util.Scanner;

public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        int length = text.length(); 
    }

    // Method to handle NullPointerException with user input
    public static void handleException(String text) {
        try {
            // This will throw NullPointerException if text is null
            int length = text.length(); 
            System.out.println("The length of the input text is: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter some text (or press Enter to use null): ");
        String userInput = scanner.nextLine();

        // If the user presses Enter without typing anything, set userInput to null
        if (userInput.isEmpty()) {
            userInput = null;
        }

        // Call method to handle exception with user input
        handleException(userInput);
    }
}
