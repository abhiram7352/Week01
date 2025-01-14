import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //Take the user input for a number
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        // Checking the number is divisible by 5 or not
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

    }
}
