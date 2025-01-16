import java.util.Scanner;

public class SplitText1 {

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

    // Method to find the shortest and longest strings in a given text
    public static String[] findShortestAndLongest(String[][] wordsAndLengths) {
        String shortest = wordsAndLengths[0][0];
        String longest = wordsAndLengths[0][0];

        for (int i = 1; i < wordsAndLengths.length; i++) {
            if (Integer.parseInt(wordsAndLengths[i][1]) < stringLength(shortest)) {
                shortest = wordsAndLengths[i][0];
            }
            if (Integer.parseInt(wordsAndLengths[i][1]) > stringLength(longest)) {
                longest = wordsAndLengths[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = splitWords(text);
        String[][] wordsAndLengths = getWordsAndLengths(words);

        String[] shortestAndLongest = findShortestAndLongest(wordsAndLengths);

        System.out.printf("Shortest word: %s (Length: %d)%n", shortestAndLongest[0], stringLength(shortestAndLongest[0]));
        System.out.printf("Longest word: %s (Length: %d)%n", shortestAndLongest[1], stringLength(shortestAndLongest[1]));
		
    }
}
