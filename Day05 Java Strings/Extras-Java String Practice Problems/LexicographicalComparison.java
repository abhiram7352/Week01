import java.util.Scanner;
public class LexicographicalComparison {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Example input
		System.out.print("Enter any String 1: ");
        String str1 = sc.nextLine();
		
		System.out.print("Enter any String 2: ");
        String str2 = sc.nextLine();

        int result = compareStringsLexicographically(str1, str2);

        if (result < 0) {
            System.out.println("String 1 is lexicographically smaller than String 2");
        } else if (result > 0) {
            System.out.println("String 1 is lexicographically larger than String 2");
        } else {
            System.out.println("String 1 is lexicographically equal to String 2");
        }
    }

    static int compareStringsLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // Difference between ASCII values of the characters
            }
        }

        // If all characters are the same up to the length of the shorter string
        return len1 - len2; // Difference in lengths
    }
}
