import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] charFrequency = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            charFrequency[text1.charAt(i)]++;
            charFrequency[text2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine();

        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine();

        System.out.println("Are the texts anagrams? " + areAnagrams(text1, text2));

        scanner.close();
    }
}
