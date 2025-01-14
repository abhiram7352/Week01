import java.util.Scanner;

public class Problem10 {

    public static int[] findRemainderAndQuotient(int n, int m){
	    int arr[]=new int[2]; // Making arr to store quotient and remainder
		
	    int quotient=n/m; 
		
		int remainder=n%m;
		
		arr[0]=quotient;
		arr[1]=remainder;
		
		return arr;
	}
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input as number and divisor
        System.out.println("Enter number of chocolate and number of student: ");
		System.out.print("Number of chocolate : ");
        int n = scanner.nextInt();  // Number of Chocolate 
		
		System.out.print(" Number of student: ");
        int m = scanner.nextInt();  // Number of student
		
		
		int arr[]=findRemainderAndQuotient(n,m);

        int equalChocolate=arr[0];  //Finding equal chocolate 
		int remainingChocolate=arr[1];  // Finding remaining chocolate
		
		System.out.println("Equally distributed chocolate : "+equalChocolate);
		System.out.println("Remaining chocolate : "+remainingChocolate);
    }
}
