import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
          int num[]=new int[10];
		  
		  // Creating Scanner object to read all array input
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter all the number one by one up to 10:");
		  
		  double  total=0;
		  
		  int i=0; // Initialize i with zero ans traverse up to 10
		  //Iterate and take input for the five number
		  while(true){
			  if(i>=10){
				  break;  // After 10 iteration we break out from the loop
			  }
			  int temp=sc.nextInt();
			  if(temp<=0){
				  break;
			  }
			  num[i]=temp;
			  i++;
		  }
		  
		  // Calculating the total
		  for(i=0;i<10;i++){
			  total+=num[i];
		  }
		  
		  // Displaying the result as total
		  System.out.println("Final total value is :"+total);
    }
}
