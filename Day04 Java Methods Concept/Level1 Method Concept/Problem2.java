import java.util.*;
public class Problem2{
	
	   public static int possibleHandshaking(int number){
		   
		    // Calcilating the simple interest
		  int possibleWays=(number*(number-1))/2;
		  return possibleWays;
	   }
       public static void main(String args[]){
	      // Making scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  
		  // Enter the value of number of people
		  System.out.println("Enter the number of people : ");
		  int number=sc.nextInt();   // Reading number of people
		  
		  
		  int totalHandshake=possibleHandshaking(number);
		 
		  
		  // Displaying the simple interest result
		  System.out.println("Number of possible handshake "+totalHandshake);
	   }

}