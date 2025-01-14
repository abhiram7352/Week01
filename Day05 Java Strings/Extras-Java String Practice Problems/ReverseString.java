import java.util.Scanner;
public class ReverseString{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter String ");
        String string = scanner.nextLine();
		
		//Calling reverseString method
		String reverseStr = reverseString(string);
		
		//Displaying result
		System.out.println("Reverse Str of the strings "+ string + " is " + reverseStr);
		
	}
	static String reverseString(String string){
		
		//Creating a variable reverseStr to store string in reverse order
	    String reverseStr = "";
		
		for(int i=string.length()-1; i>=0; i--){
		reverseStr += string.charAt(i);
		}
		return reverseStr;
	}
}