// Importing Scanner for input
import java.util.Scanner; 

public class Problem8 {
    public static void main(String[] args) {
	    // Creating Scanner for input
        Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter your name:");
		// User's name
        String name = sc.nextLine(); 

        // Taking user input for starting cities , via cities ,to cities
        System.out.print("Enter the city you are starting from ");
        String fromCity = sc.nextLine(); // Starting city
        
        System.out.print("Enter the city from where we will travel via ");
        String viaCity = sc.nextLine(); // City you are passing through
        
        System.out.println("Enter your final destination city ");
        String toCity = sc.nextLine(); // Destination city

        // Taking user input for distances in miles
        System.out.println("Enter the distance from " +fromCity+ " to " + viaCity + " in miles is ");
		// Distance from start to via city
        double fromToVia = sc.nextDouble(); 

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles is ");
		// Distance from via city to destination
        double viaToFinalCity = sc.nextDouble(); 

        // Here calculating total distance you covered
        double totalDistance = fromToVia + viaToFinalCity;

        // Time taken from fromcity to viacity
        System.out.println("Enter the time taken from Fromcity to Viacity ");
        double timeFromToVia = sc.nextDouble(); 
		
		// Time taken from viacity to Finalcity
        System.out.println("Enter the time taken from viaCity to Finalcity ");
        double timeViaToFinal = sc.nextDouble(); 

        // Here a total time
        double totalTime=timeFromToVia+timeViaToFinal;
		
		// Here displaying a expexted result
		
      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " hours");

		

    }
}
