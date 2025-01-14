import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
