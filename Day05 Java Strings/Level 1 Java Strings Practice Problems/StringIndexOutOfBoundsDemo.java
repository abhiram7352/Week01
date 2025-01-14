import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Access an index beyond the length of the string
        char ch = text.charAt(text.length() + 1); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException with user input
    public static void handleException(String text) {
        try {
            // Access an index beyond the length of the string
            char ch = text.charAt(text.length() + 1); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
