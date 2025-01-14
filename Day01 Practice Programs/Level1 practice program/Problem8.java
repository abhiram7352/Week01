import java.util.*;
public class Problem8{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
       Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the value of km distance ");
	   // Read the km distance
	   int km_distance=sc.nextInt();
	   
	   // Convert km_distance in mile_distance
	   double mile_distance=km_distance*1.6;
	   
	   System.out.println(" The total miles is "+mile_distance+" mile for the given "+km_distance+" km");
	}
 }