import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the strings are anagrams
        boolean areAnagrams = isAnagram(firstString, secondString);

        // Display the result
        if (areAnagrams) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }
	
    static boolean isAnagram(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
