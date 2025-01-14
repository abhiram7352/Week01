import java.util.*;
public class Problem9{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the value of courseFee ");
	   // Read the input of courseFee
	   int courseFee=sc.nextInt();
	   
	   System.out.print("Enter the value of discountPercent ");
	   // Read the user input of discountPercent
	   int discountPercent=sc.nextInt();
	   
	   // Here a discount 
	   double discount=((courseFee*discountPercent)/(100.0));
	   
	   // Here a actual fees after discount
	   double feesAfterDiscount=courseFee-discount;
	   System.out.println("The discount amount is INR "+discount+"and final discounted fee is INR "+feesAfterDiscount);
	}
 }