import java.util.*;
public class Problem12{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the value base in inches ");
	   // Read the user input
	   int baseInches=sc.nextInt();
	   
	   System.out.print("Enter the value height in inches ");
	   // Read the user input
	   int heightInches=sc.nextInt();
	   
	   // Storing base value in cm
	   double baseCm=2.54*baseInches;
	   
	   // Storing height value in cm
	   double heightCm=2.54*heightInches;
	   
	   // Area in square Inches
	   double areaInchesSq=0.5*baseInches*heightInches;
	   
	   // Area in square cm
	   double areaCmSq=0.5*baseInches*heightCm;
	   System.out.println("Area of Triangle in square inches is "+areaInchesSq+" and in square cm is "+areaCmSq);
	}
 }