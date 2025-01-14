import java.util.Scanner;
public class CountVowelsAndConsonant{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter String ");
        String string = scanner.nextLine();
		int vowelCount = countVowel(string);
		int consonantCount = string.length()-vowelCount;
		
		System.out.println("No of vowels present in the strings "+ vowelCount + " and no of consonant present in the string is "+ consonantCount);
		
	}
	static int countVowel(String string){
		int count = 0;
		for(int i=0; i<string.length(); i++){
	     if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' 
		 || string.charAt(i) == 'u' || string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){
				count++;
		
		  }
		}
		return count;
	}
}