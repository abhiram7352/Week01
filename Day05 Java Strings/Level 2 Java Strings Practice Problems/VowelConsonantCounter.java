import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkVowelConsonant(char ch) {
        char lowerCh = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if (lowerCh >= 'a' && lowerCh <= 'z') {
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return their count
    public static int[] countVowelsConsonants(String text) {
        int[] counts = new int[2]; // counts[0] for vowels, counts[1] for consonants
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkVowelConsonant(ch);
            if (result.equals("Vowel")) {
                counts[0]++;
            } else if (result.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        int[] counts = countVowelsConsonants(text);

        System.out.printf("Number of Vowels: %d%n", counts[0]);
        System.out.printf("Number of Consonants: %d%n", counts[1]);

        scanner.close();
    }
}
