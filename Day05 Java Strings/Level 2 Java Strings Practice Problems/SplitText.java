import java.util.Scanner;

public class SplitText {

    // Method to split the text into words without using split() method
    public static String[] splitWords(String text) {
        String word = "";
        String[] words = new String[text.length()];
        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    words[wordCount] = word;
                    wordCount++;
                    word = "";
                }
            }
        }
        if (!word.isEmpty()) {
            words[wordCount] = word;
            wordCount++;
        }
        
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        
        return result;
    }

    // Method to find and return the length of a string without using the length() method
    public static int stringLength(String word) {
        int length = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordsAndLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(stringLength(words[i]));
        }
        return wordsAndLengths;
    }

    // Main method to take user input and display the result in a tabular format
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = splitWords(text);
        String[][] wordsAndLengths = getWordsAndLengths(words);

        System.out.printf("%-15s%-10s%n", "Word", "Length");
        for (int i = 0; i < wordsAndLengths.length; i++) {
            System.out.printf("%-15s%-10s%n", wordsAndLengths[i][0], Integer.parseInt(wordsAndLengths[i][1]));
        }
    }
}
