import java.util.Scanner; 

public class Problem12 {
    public static void main(String[] args) {
	    // Creating Scanner for input
        Scanner sc = new Scanner(System.in); 

        // Taking user input for weight in pounds
        System.out.print("Enter the weight in pounds ");
        double poundsWeight = sc.nextDouble();

        // 1 pound = 2.2 kg and converting pounds in Kg
        double KgWeight = poundsWeight * 2.2; 

        // Displaying the results
        System.out.println("The weight of the person in pound is " + poundsWeight + " and in kg is " + KgWeight);
    }
}
