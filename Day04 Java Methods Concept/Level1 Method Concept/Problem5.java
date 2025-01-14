import java.util.*;
public class Problem5{
       public static int checkNumber(int number){
	      if(number==0) return 0; // for zero
		 
		  else if(number>0) return 1;  // for positive number
		  
		  else return -1;  // for negative number

	   }
       public static void main(String args[]){
	      // Making scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter the number :");
		  
		  int number=sc.nextInt();  // taking user input for number
		  
		  int status=checkNumber(number);
		  if(status==0){
		      System.out.println("Enteres number is zero : ");
		  
		  }else if(status==1){
		      System.out.println("Enteres number is positive : ");
		  }else{
		      System.out.println("Enteres number is negative: ");
		  }
		 
	   }

}