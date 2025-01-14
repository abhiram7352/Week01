import java.util.*;
public class Problem15{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Take number of item from user ");
	   // Reading user input for number of item
	   int numberOfItem=sc.nextInt();
	   
	   System.out.print("Take price of item from user ");
	   // Reading user input for price
	   int priceOfItem=sc.nextInt();
	   
	   System.out.println("The total purchase price is INR "+(priceOfItem*numberOfItem)+" if the quantity "+ numberOfItem+" and unit price is INR "+priceOfItem);
	}
 }