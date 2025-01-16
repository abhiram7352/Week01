import java.util.Scanner;
public class StringLengthWithoutLengthMethod  {
    public static void main(String[] args) {
		
		//Creating the scanner class to read the input from the user
		Scanner sc = new Scanner(System.in);
        // Input string
		System.out.print("ENter any String: ");
        String inputString = sc.nextLine();
		
		// Finding the length of the string using .length method
		int lengthStringUsingMethod = inputString.length();
		
		//Calling the lengthString method
		int lengthStringUsingLogic = lengthString(inputString);
		
		
		
		//Displaying result
		if(lengthStringUsingLogic == lengthStringUsingMethod){
			System.out.println(lengthStringUsingMethod +" and "+lengthStringUsingLogic+ "  length of the string "+inputString+" both are same using both method");
		}else {
			System.out.println(lengthStringUsingMethod +" and "+lengthStringUsingLogic+ "  length of the string "+inputString+" both are not same using both menthod");
		}
		
		
	}
	static int lengthString(String string){
		int count=0;
         int ans =0;
		 
		 //Using try catch to handling index out of bound Exception
		try{
		for(;;){
			string.charAt(count);
			count++;
		}
	}catch(IndexOutOfBoundsException e){
		ans = count;
	}
	return ans;
	}
	
}