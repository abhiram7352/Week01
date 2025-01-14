import java.util.*;
public class Problem4{
       public static int calculateRound(int side1,int side2,int side3,int totalDistance){
	      int perimeter=side1+side2+side3; // Finding perimeter
		  
		  int round=totalDistance/perimeter;  // Finding total number of round
		  
		  return round;
	   }
       public static void main(String args[]){
	      // Making scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter all the sides of triangle :");
		  
		  System.out.println("Enter the perimeter of first side of triangle :");
		  int side1=sc.nextInt();  // taking input the perimeter of first side
		  
		  System.out.println("Enter the perimeter of second side of triangle :");
		  int side2=sc.nextInt();  // taking input the perimeter of second side
		   
		  System.out.println("Enter the perimeter of third side of triangle :");
		  int side3=sc.nextInt();  // taking input the perimeter of third side
		  
		  int totalDistance=5000;
		  
		  // calling function to find no of round
		  
		  int round=calculateRound(side1,side2,side3,totalDistance);
		  
		  // Displaying the total number of round
		  
		  System.out.println("Number of rounds user needs to do to complete 5km run is : "+round);
		 
	   }

}