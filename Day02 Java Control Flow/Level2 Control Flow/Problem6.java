import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
		        int i=0; // Initializing i with zero
				
                while (i<=number) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number otherwise
                else {
                    System.out.println(i);
                }
				i++;
            }
        }
    }
}
