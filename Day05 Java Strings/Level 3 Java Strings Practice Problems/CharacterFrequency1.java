import java.util.Scanner;

public class CharacterFrequency1 {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // ASCII characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D String array to store the characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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
