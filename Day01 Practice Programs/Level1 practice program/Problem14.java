import java.util.*;
public class Problem14{
    public static void main(String args[]){
		 // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the distance in feet ");
	   // Read input from user
	   int feetDistance=sc.nextInt();
	   
	   // Finding the distance in yard
	   double yardDistance=feetDistance/(3.0);
	   
	   // Finding the distance in mile
	   double mileDistance=yardDistance/(1760.0);
	   
	   System.out.println("Your Height in yard is "+yardDistance+" and while in miles is "+mileDistance);
	}
 }