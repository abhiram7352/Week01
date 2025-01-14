import java.util.Scanner;

public class TextToUpperCase {

    // Method to convert each character to uppercase using ASCII values
    public static String toUpperCase(String text) {
        StringBuilder upperText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            upperText.append(ch);
        }
        return upperText.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter some text: ");
        String userInput = scanner.nextLine();

        // Convert the text to uppercase using the user-defined method
        String upperTextUserDefined = toUpperCase(userInput);

        // Convert the text to uppercase using the built-in method
        String upperTextBuiltIn = userInput.toUpperCase();

        // Compare the two strings using the user-defined method
        boolean areEqual = compareStrings(upperTextUserDefined, upperTextBuiltIn);

        // Display the result
        System.out.println("Text converted to uppercase using user-defined method: " + upperTextUserDefined);
        System.out.println("Text converted to uppercase using built-in method: " + upperTextBuiltIn);
        System.out.println("Are both uppercase texts equal? " + areEqual);
    }
}
