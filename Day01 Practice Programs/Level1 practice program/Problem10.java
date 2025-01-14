import java.util.*;
public class Problem10{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the value of cm height ");
	   // Read input from user
	   int cmHeight=sc.nextInt();
	   
	   // Converting cm height into inches
	   double inchesHeight=cmHeight/2.54;
	   
	   // After calculating inches then I convert inches into feet
	   double feetHeight=inchesHeight/12;
	  
	   
	   System.out.println(" Your Height in cm is "+cmHeight+" while in feet is "+feetHeight+"and inches is "+inchesHeight);
	}
 }