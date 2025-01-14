import java.util.*;
public class Problem1{
      public static void main(String args[]){
	      int ages[]=new int[10];
		  
		  // Creating Scanner object to read all array input
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter all the ages of people :");
		  for(int i=0;i<10;i++){
			  int temp=sc.nextInt();
			  ages[i]=temp;
		  }
		  for(int i=0;i<10;i++){
			  if(ages[i]<0){
				  System.out.println(" Invalid age ");
				  System.exit(0);
			  }else{
				  if(ages[i]>=18){
					  System.out.println("The student with the age "+ages[i]+" can vote");
				  }else{
					  System.out.println("The student with the age "+ages[i]+" cannot vote. ");
				  }
			  }
		  }
		  	  
	  }
}