import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Checking the eligibilty for vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

    }
}
