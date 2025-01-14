import java.util.*;

// Creating ToCharArray class to demonstrate converting a string into a character array
public class ToCharArray {
    public static void main(String []args) {
        
        // Creating Scanner class to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        
        // Reading the string input from the user
        String string = sc.nextLine();
        
        // Converting the string to a character array using the in-built method
        char[] charArrayUsingInBuiltMethod = string.toCharArray();
        
        // Converting the string to a character array using a custom method
        char[] charArrayUsingMethod = charArray(string);
        
        // Comparing both character arrays for equality
        if (Arrays.equals(charArrayUsingInBuiltMethod, charArrayUsingMethod)) {
            // Printing a message if both arrays are equal
            System.out.println(Arrays.toString(charArrayUsingInBuiltMethod) + " and " + Arrays.toString(charArrayUsingMethod) + " both are Equal");
        } else {
            // Printing a message if both arrays are not equal
            System.out.println(Arrays.toString(charArrayUsingInBuiltMethod) + " and " + Arrays.toString(charArrayUsingMethod) + " both are not Equal");
        }
    }

    // Method to convert a string into a character array manually
    static char[] charArray(String string) {
        
        // Creating a character array of the same length as the string
        char[] ch = new char[string.length()];
        
        // Iterating over each character in the string and storing it in the array
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
        }
        
        // Returning the character array
        return ch;
    }
}
