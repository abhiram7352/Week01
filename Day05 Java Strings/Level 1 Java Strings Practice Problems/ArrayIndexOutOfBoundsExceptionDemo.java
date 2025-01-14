import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index larger than the length of the array
        String name = names[10]; // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException with user input
    public static void handleException(String[] names) {
        try {
            // Accessing index larger than the length of the array
            String name = names[10]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create an array to store names
        String[] names = new String[n];

        // Prompt the user to enter names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call method to generate exception
        // Uncomment the line below to see the exception being thrown
        // generateException(names);

        // Call method to handle exception
        handleException(names);
    }
}
