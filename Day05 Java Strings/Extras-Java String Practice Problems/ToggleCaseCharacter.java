import java.util.Scanner;

public class ToggleCaseCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
		
		
		
		// Call the method and display the result
		System.out.println("Toggles form of the " + inputString + " String is "+lowerToUpperAndViceVersa(inputString));
	
		
	}
	static String lowerToUpperAndViceVersa(String string){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<string.length(); i++){
			
			char ch = string.charAt(i);
		if(Character.isLowerCase(ch)){
			sb.append(Character.toUpperCase(ch));
		}else if(Character.isUpperCase(ch)){
			sb.append(Character.toLowerCase(ch));
		}else{
			sb.append(ch);
		}
		
	}
		return sb.toString();
	}
}
			