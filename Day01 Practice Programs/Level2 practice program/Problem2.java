import java.util.Scanner; // Importing Scanner class to take input from the user

public class Problem2 {
    public static void main(String args[]) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter the first integer in (a): ");
		// Reading the first integer
        int a = sc.nextInt(); 
		
        System.out.println("Enter the second integer in (b): ");
		// Reading the second integer
        int b = sc.nextInt(); 
        
		
        System.out.println("Enter the third integer in (c): ");
		// Reading the third integer
        int c = sc.nextInt(); 
        
        // Performing all the operation
        int operation1 = a + b * c; 
        int operation2 = a * b + c; 
        int operation3 = c + a / b; 
        int operation4 = a % b + c;

        // Displaying results of the operations with explanations
        System.out.println(" The results of Int Operations are "+operation1+","+operation2+","+operation3+","+operation4);
    }
}
