import java.util.*;
public class Problem3{
       public static void main(String args[]){
	      // Making scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  
		  // Enter the value of number of people
		  System.out.println("Enter the number of people : ");
		  int number=sc.nextInt();   // Reading number of people
		  
		  
		  int totalHandshake=(number*(number-1))/2;
		 
		  
		  // Displaying the simple interest result
		  System.out.println("Number of possible handshake "+totalHandshake);
	   }

}