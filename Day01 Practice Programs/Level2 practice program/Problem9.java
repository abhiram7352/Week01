// Importing Scanner for input
import java.util.Scanner; 
import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
	    // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in); 

        // Reading user input for all sides of the triangular park
        System.out.print("Enter the first side of the triangular in meter ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter the second side of the triangular park in meter ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter the third side of the triangular park in meter ");
        double side3 = sc.nextDouble();

        // Here we are calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance
        double totalDistance = 5000;

        // Calculating the number of rounds required
        double rounds = totalDistance / perimeter;

        // Displaying the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
