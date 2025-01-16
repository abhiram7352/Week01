import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        int[] frequency = new int[text.length()];
        char[] characters = text.toCharArray();

        // Initialize frequency array
        for (int i = 0; i < text.length(); i++) {
            frequency[i] = 1;
        }

        // Nested loops to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Avoid counting duplicate characters again
                }
            }
        }

        // Create a 1D String array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    // Main function to take user input, call the user-defined method, and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("Character frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }

        scanner.close();
    }
}
