import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 1000000;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store in array
        for (int i = 1; i <= number; i++) {
           if(number%i==0){
		     factors[index++]=i;
		   }
		   if(index>=maxFactor){
		     maxFactor+=10;
		   }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
