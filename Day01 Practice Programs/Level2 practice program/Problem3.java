import java.util.Scanner;

public class Problem3 {
    public static void main(String args[]) {
		// Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers :");
		// First number
        double a = sc.nextInt(); 
		
		// Second number
        double b = sc.nextInt(); 
		
		// Third number
        double c = sc.nextInt(); 

        // Performing some required operations
        double operation1 = a + b * c;  
        double operation2 = a * b + c;  
        double operation3 = c + a / b;   
        double operation4 = a % b + c;   

        // Displaying the results of operations
        System.out.println("The results of operations are: " + 
                           operation1 + ", " + operation2 + ", " + 
                           operation3 + ", " + operation4);
    }
}
