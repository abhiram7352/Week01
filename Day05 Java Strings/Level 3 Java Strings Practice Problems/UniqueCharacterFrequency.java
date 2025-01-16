import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        String uniqueChars = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueChars.indexOf(currentChar) == -1) {
                uniqueChars += currentChar;
            }
        }
        return uniqueChars.toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // ASCII characters
        char[] characters = text.toCharArray();

        // Loop through the text to find the frequency of each character
        for (char c : characters) {
            frequency[c]++;
        }

        // Call the uniqueCharacters() method to find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D String array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Main function to take user input, call user-defined methods, and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("Character frequencies:");
        for (String[] entry : frequency) {
            System.out.println(entry[0] + " : " + entry[1]);
        }

        scanner.close();
    }
}
