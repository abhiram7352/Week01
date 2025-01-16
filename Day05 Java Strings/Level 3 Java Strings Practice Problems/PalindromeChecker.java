import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare characters using character arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to check for palindrome:");
        String text = scanner.nextLine();

        System.out.println("Iterative Check: " + isPalindromeIterative(text));
        System.out.println("Recursive Check: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Array Check: " + isPalindromeArray(text));

        scanner.close();
    }
}
