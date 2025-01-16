import java.util.Arrays;
import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of the string without using built-in length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the text into words without using split() method
    public static String[] splitText(String text) {
        int length = findLength(text);

        // Count the number of words
        int wordCount = 1; // At least one word exists
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the starting indexes of each word
        int[] wordStartIndexes = new int[wordCount];
        int index = 0;
        wordStartIndexes[0] = 0; // First word starts at 0

        // Find the start indexes of each word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordStartIndexes[++index] = i + 1;
            }
        }

        // Extract words using the indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = wordStartIndexes[i];
            int end = (i == wordCount - 1) ? length : wordStartIndexes[i + 1] - 1;
            words[i] = text.substring(start, end);
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Use custom method to split the text
        String[] customSplitWords = splitText(inputText);

        // Use built-in split() method to split the text
        String[] builtInSplitWords = inputText.split("\\s+");

        // Compare the two arrays
        boolean isEqual = compareArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Custom Split Words: " + Arrays.toString(customSplitWords));
        System.out.println("Built-in Split Words: " + Arrays.toString(builtInSplitWords));
        System.out.println("Are both methods producing the same result? " + isEqual);
    }
}
