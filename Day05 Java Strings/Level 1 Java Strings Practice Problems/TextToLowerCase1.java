import java.util.Scanner;

public class TextToLowerCase1 {

    // Method to convert each character to lowercase using ASCII values
    public static String toLowerCase(String text) {
        StringBuilder lowerText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            lowerText.append(ch);
        }
        return lowerText.toString();
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

    // Method to split text into words and return a 2D array with words and their lengths
    public static String[][] splitTextAndReturnWordLengths(String text) {
        String[] words = text.split("\\s+"); // Split the text into words based on whitespace
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(words[i].length());
        }
        return wordsWithLengths;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter some text: ");
        String userInput = scanner.nextLine();

        // Convert the text to lowercase using the user-defined method
        String lowerTextUserDefined = toLowerCase(userInput);

        // Convert the text to lowercase using the built-in method
        String lowerTextBuiltIn = userInput.toLowerCase();

        // Compare the two strings using the user-defined method
        boolean areEqual = compareStrings(lowerTextUserDefined, lowerTextBuiltIn);

        // Display the result
        System.out.println("Text converted to lowercase using user-defined method: " + lowerTextUserDefined);
        System.out.println("Text converted to lowercase using built-in method: " + lowerTextBuiltIn);
        System.out.println("Are both lowercase texts equal? " + areEqual);

        // Split the text into words and return the words along with their lengths
        String[][] wordsWithLengths = splitTextAndReturnWordLengths(userInput);

        // Display the words along with their lengths
        System.out.println("Words and their lengths:");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }

    }
}
