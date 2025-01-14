// Importing Scanner for input
import java.util.Scanner; 

public class Problem10 {
    public static void main(String[] args) {
		// Creating Scanner for input
        Scanner sc = new Scanner(System.in); 

        // Taking input for number of chocolates and children
        System.out.println("Enter the total number of chocolates we have");
		// Total chocolates
        int numberOfChocolates = sc.nextInt(); 
        
		// Total children
        System.out.println("Enter the total number of children:");
        int numberOfChildren = sc.nextInt(); 

        // Chocolates per child
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
		
		// Remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren; 

        // Displaying the results
        System.out.println("The number of chocolates each child gets is "+ chocolatesPerChild +" and the number of remaining chocolates are "+remainingChocolates);
      
    }
}
