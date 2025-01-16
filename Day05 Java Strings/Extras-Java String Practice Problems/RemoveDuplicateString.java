import java.util.Scanner;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
		
		// Call the method and display the result
		System.out.println("Left string after removal of duplicate occurence is "+ removeDuplicate(inputString));
		
	}
	static String removeDuplicate(String string){
		String uniqueString = "";

		for(int i=0; i<string.length(); i++){
			boolean flag = true;
			for(int j=0; j<uniqueString.length(); j++){
				if(string.charAt(i)==uniqueString.charAt(j)){
					flag = false;
					break;
				}
			}
		if(flag){
			uniqueString += string.charAt(i);
		}
		}
		return uniqueString;
	}
}
	
