// Importing Scanner for input
import java.util.Scanner; 

public class Problem11 {
    public static void main(String[] args) {
	    // Creating Scanner for input
        Scanner sc = new Scanner(System.in);

        // Taking input for Principal, Rate, and Time
        System.out.println("Enter the Principal amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter the Rate of Interest (in %):");
        double rate = sc.nextDouble();

        System.out.println("Enter the Time (in years):");
        double time = sc.nextDouble();

        // heer we are calculating Simple Interest
        double simpleInterest = (principal * rate * time) / (100.0);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    }
}
