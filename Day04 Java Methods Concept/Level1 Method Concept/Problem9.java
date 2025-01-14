import java.util.Scanner;

public class Problem9 {

    public static int[] findRemainderAndQuotient(int number, int divisor){
	    int arr[]=new int[2]; // Making arr to store quotient and remainder
		
	    int quotient=number/divisor; 
		
		int remainder=number%divisor;
		
		arr[0]=quotient;
		arr[1]=remainder;
		
		return arr;
	}
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input as number and divisor
        System.out.println("Enter a two number: ");
		System.out.print("Number: ");
        int number = scanner.nextInt();  // First number
		
		System.out.print(" Divisor: ");
        int divisor = scanner.nextInt();  // Second number
		
		
		int arr[]=findRemainderAndQuotient(number,divisor);

        int quotient=arr[0];  //Finding quotient 
		int remainder=arr[1];  // Finding divisor 
		
		System.out.println("Quotient is : "+quotient);
		System.out.println("Remainder is : "+remainder);
    }
}
