import java.util.*;
public class Problem11{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	    
	   System.out.print("Enter the value of num1 ");
	   // Read the user input and store in num1
	   int num1=sc.nextInt();
	   
	   System.out.print("Enter the value of num2 ");
       // Read the user input and store in num1
	   int num2=sc.nextInt();
	   System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+"is "+(num1+num2)+", "+(num1-num2)+", "+(num1*num2)+", "+(num1/(double)(num1/num2))+"respectively");
	}
 }