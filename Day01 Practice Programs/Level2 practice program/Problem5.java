// Importing utility package for Scanner
import java.util.*; 

public class Problem5 {
    public static void main(String args[]) {
		// Creating Scanner for reading user input
        Scanner sc = new Scanner(System.in); 

        // Reading temperature in Fahrenheit
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * (5.0 / 9.0); 

        // Here is the  result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
