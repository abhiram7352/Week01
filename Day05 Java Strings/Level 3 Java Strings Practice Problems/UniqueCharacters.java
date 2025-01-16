import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int getLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Nested loops to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Main function to take user input, call user-defined methods, and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
