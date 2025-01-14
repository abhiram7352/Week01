import java.util.Scanner;
//Creating CompareSubstring 
public class CompareSubstring{
	public static void main(String []args){
		
		    //Creating scanner class to re input from the user
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter String: ");
			String string1 = sc.nextLine();
			
			System.out.print("Enter starting starting index: ");
			int start = sc.nextInt();
			
			System.out.print("Enter starting ending index: ");
			int end = sc.nextInt();
			
			
			if(start>=string1.length() || start<0 || end >= string1.length() || end<0){
				System.out.println("Enter valid staring and ending point");
				System.exit(0);
			}
			
			//Creating findSubstringUsingCharAt variable to to call substringOfString method
			String findSubstringUsingCharAt = substringOfString(string1, start, end);
			 
			 //Creating findSubstringUsingInBuiltMethod variable to find substring
			String findSubstringUsingInBuiltMethod  = string1.substring(start, end+1);
			System.out.println(findSubstringUsingInBuiltMethod);
			 
			//Displaying the result
			if(findSubstringUsingCharAt.equals(findSubstringUsingInBuiltMethod)){
				System.out.println("Substring are equals");
			}else{
				System.out.println("Substring are not equals");
			}
			  
			
			
		}
		
	//substringOfString method to find substring of the strings
	 static String substringOfString(String string, int start, int end){
		 String sub = "";
		 for(int i=start; i<=end; i++){
			 sub += string.charAt(i);
			 System.out.println(sub);
		 }
		 return sub;
	 
	 }
}