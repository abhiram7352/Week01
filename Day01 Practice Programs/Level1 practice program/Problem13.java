import java.util.*;
public class Problem13{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the value of perimeter ");
	   // Read the perimeter from user
	   int perimeterOfSquare=sc.nextInt();
	   
	   // Finding the side with the help of perimeter
	   double side=(perimeterOfSquare/4.0);
	   
	   System.out.println("The length of the side is "+side+" whose perimeter is "+perimeterOfSquare);
	}
 }