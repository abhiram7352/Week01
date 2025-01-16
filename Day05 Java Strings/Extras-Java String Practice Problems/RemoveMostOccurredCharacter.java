import java.util.Scanner;
public class RemoveMostOccurredCharacter {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Input string
		System.out.print("ENter any String: ");
        String inputString = sc.nextLine();
        
        // Call the method to find and remove the most occurred character
        String modifiedString = removeMostOccurredCharacter(inputString);

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);
    }

    /**
     * Removes all occurrences of the most frequently occurring character from the input string.
     *
     * @param inputString The original string.
     * @return The modified string with the most occurred character removed.
     */
    static String removeMostOccurredCharacter(String inputString) {
        int[] charCount = new int[256]; // To store frequency of each character
        
        // Count frequency of each character
        for (int i = 0; i < inputString.length(); i++) {
            charCount[inputString.charAt(i)]++;
        }
        
        // Find the most occurred character
        int maxCount = 0;
        char mostOccurredChar = '\0';  // Null character by default
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostOccurredChar = (char) i;
            }
        }
        
        // Remove occurrences of the most occurred character
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != mostOccurredChar) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
