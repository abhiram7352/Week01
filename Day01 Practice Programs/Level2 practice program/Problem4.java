// Importing utility package for Scanner
import java.util.*; 

public class Problem4 {
    public static void main(String args[]) {
		// Creating Scanner for read input
        Scanner sc = new Scanner(System.in);

        // Reading temperature in Celsius
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Displaying the conversion result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
