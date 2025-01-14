import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input and start countdown value
        System.out.print("Enter the countdown start value: ");
        int num = scanner.nextInt();

        // Use a while loop to count down from the input value to 1
        for(int i=num;i>=1;i--) {
            System.out.println("T-" + num + " seconds");
        }

        // Print the final message after the countdown finishes
        System.out.println("Launch!");
	}
}
