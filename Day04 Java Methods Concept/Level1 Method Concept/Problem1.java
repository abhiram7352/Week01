import java.util.*;
public class Problem1{
	
	   public static double simpleInterest(double principal,double rate,double time){
		   
		    // Calcilating the simple interest
		  double interest=(principal*rate*time)/100f;
		  return interest;
	   }
       public static void main(String args[]){
	      // Making scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  
		  // Enter the value of principal and rate and time
		  System.out.println("Enter the values of principal and rate and time: ");
		  System.out.println("Enter principal values : ");
		  double principal=sc.nextDouble();   // Input value for Principal12
		  
		  
		  
		  System.out.print("Enter rate values: ");
		  
		  double rate=sc.nextDouble();  // Input value for rate 
		  
		  
		  System.out.print("Enter time values: ");
		  double time=sc.nextDouble();   // Input value for time
		  
		   // Calcilating the simple interest
		  double interest= simpleInterest(principal,rate,time);
		  
		  // Displaying the simple interest result
		  System.out.println("The Simple Interest is "+interest+" for Principal "+principal+" and rate of Interest "+rate+" and Time "+time);
	   }

}