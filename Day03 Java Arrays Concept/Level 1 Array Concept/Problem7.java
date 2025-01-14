import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
         
		System.out.print("Enter the input value : ");
		// taking user input for number
		int number=sc.nextInt();
		int oddSize=-1;
		int evenSize=-1;
		if(number%2!=0){
			oddSize=(number/2)+1;
			evenSize=number/2;
		}else{
			evenSize=number/2;
			oddSize=number/2;
		}
		// Create a odd and even array
		int odd[]=new int[oddSize];
		int even[]=new int[evenSize];
		
		// here we are checking each number and accordingly we store in odd and even array
	    int m=0,n=0; //Initializing m and n indexes for both array
        for (int i = 1; i <=number; i++) {
			if(i%2==0){
			   even[m++]=i;
			}else{
			   odd[n++]=i;
			}
        }
		
		
		// Printing even array
		for(int i=0;i<evenSize;i++){
		    System.out.println(even[i]+" Even number ");
		}
		
		// Printing odd array
        for(int i=0;i<oddSize;i++){
		    System.out.println(odd[i]+" Odd number ");
		}
		
    }
}
