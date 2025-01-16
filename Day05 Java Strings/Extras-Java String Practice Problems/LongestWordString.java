import java.util.Scanner;

public class LongestWordString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
		
		// Call the method and display the result
		System.out.println("Maximum length of the string in the sentence is "+ longestWordString(inputString));
		
	}
	static String longestWordString(String string){
		String[] splited = string.split(" ");
		String longestString = "";
		int size = 0;
		for(int i=0; i<splited.length; i++){
			if(splited[i].length() > size){
				size=splited[i].length();
				longestString = splited[i];
			}
		}
		return longestString;
		
	}
}