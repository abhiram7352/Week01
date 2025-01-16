import java.util.Scanner;

public class TrimString {

    // Method to trim leading and trailing spaces from a string using charAt() method
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;

        // Find the starting index of non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the ending index of non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method with the string, start, and end index as parameters
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with leading and trailing spaces:");
        String text = scanner.nextLine();

        int[] trimIndices = findTrimIndices(text);
        String trimmedText = createSubstring(text, trimIndices[0], trimIndices[1]);
        String builtInTrimmedText = text.trim();

        System.out.println("Custom trimmed text: \"" + trimmedText + "\"");
        System.out.println("Built-in trimmed text: \"" + builtInTrimmedText + "\"");

        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);
        System.out.println("Are the custom trimmed and built-in trimmed texts equal? " + areEqual);
    }
}
