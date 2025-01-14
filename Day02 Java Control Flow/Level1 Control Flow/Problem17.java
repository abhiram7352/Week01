import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the salary and years of service
        System.out.print("Enter the salary of the employee man ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service man done till now ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for the bonus
        if (yearsOfService > 5) {
            // Calculate the bonus (should be 5% of the salary)
            double bonus = salary * 0.05;
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
