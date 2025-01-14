import java.util.Scanner;
//Creating StringChecker 
public class StringChecker{
	public static void main(String []args){
		
		    //Creating scanner class to re input from the user
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter String1 ");
			String string1 = sc.nextLine();
			
			System.out.print("Enter String2 ");
			String string2 = sc.nextLine();
			
			//Creating areEqualUsingInBuildMethod variable to check is it equal or not
			boolean areEqualUsingInBuildMethod = string1.equals(string2);
			 
			 // Calling the are areEqualsUsingCharAt method 
			boolean areEqualsUsingCharAt  = isEqual( string1,  string2);
			 
			//Displaying the result
			System.out.println(string1 +" and "+ string2 +" is  "+ areEqualUsingInBuildMethod);
			System.out.println(string1 +" and "+ string2 +" is "+ areEqualsUsingCharAt);
			
			
		}
		
	//isEqual method to check equality of both strings
	 static boolean isEqual(String s1, String s2){
		 //finding the length of the string
		 int n = s1.length();
		 int m = s2.length();
		 if( n!= m){
			 return false;
		 }
		 for(int i=0; i<n; i++){
			 if(s1.charAt(i) == s2.charAt(i)){
				 return true;
			 }
		 }
		 
		 return false;
	 
	 }
}