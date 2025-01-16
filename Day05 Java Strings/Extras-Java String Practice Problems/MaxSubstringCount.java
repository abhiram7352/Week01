import java.util.Scanner;

public class MaxSubstringCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
		
		// Prompt the user for input
		System.out.print("Enter a any substring: ");
		String inputSubString = scanner.nextLine();
		
		// Call the method and display the result
		System.out.println(maxiCountSubstring(inputString, inputSubString) +" This many times given substring "+ inputSubString + " occurs in the " + inputString);
	
		
	}
	static int maxiCountSubstring(String string, String subString){
		int count = 0;
		for(int i=0; i<=string.length()-subString.length(); i++){
			String subStr = string.substring(i,i+subString.length());
			
			if(subStr.equals(subString)){
				count++;
			}
		}
		return count;
	}
}
		
		
		