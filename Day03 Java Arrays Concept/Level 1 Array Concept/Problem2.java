import java.util.*;
public class Problem2{
      public static void main(String args[]){
	      int num[]=new int[5];
		  
		  // Creating Scanner object to read all array input
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter all the number one by one and check the result :");
		  
		  //Iterate and take input for the five number
		  for(int i=0;i<5;i++){
			  int temp=sc.nextInt();
			  num[i]=temp;
		  }
		  
		  // Checking the number
		  for(int i=0;i<5;i++){
			  if(num[i]<0){
				  System.out.println(num[i]+" is negative Number :");
			  }else if(num[i]==0){
				  System.out.println(num[i]+" is zero Number :");
			  }else{
				  if(num[i]%2==0){
					  System.out.println(num[i]+" is even nummber:");
				  }else{
					  System.out.println(num[i]+" is Odd number :");
				  }
			  }
		  }
		  // Comparing first and last number
		  if(num[0]==num[4]){
			  System.out.println(" Numbers are equal :");
		  }else if(num[0]>num[4]){
			  System.out.println(num[0]+" is greater than "+num[4]);
		  }else{
			  System.out.println(num[0]+" is less than "+num[4]);
		  }
		  	  
	}
}