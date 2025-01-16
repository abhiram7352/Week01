import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the sentence from the user
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        // Get the word to be replaced
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        // Get the replacement word
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        // Call the replaceWord method
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Construct the modified sentence using simple string concatenation
        String result = "";
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                result += replacementWord + " ";
            } else {
                result += word + " ";
            }
        }

        // Remove the trailing space and return
        return result.trim();
    }
}
