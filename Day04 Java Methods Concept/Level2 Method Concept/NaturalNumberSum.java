import java.util.Scanner;

class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int findSumUsingRecursion(int n) {
	
        // It's a base case if n is 1, the sum is simply 1 
        if (n == 1) {
            return 1;
        }
       
        // We call the function recursively for the next smaller number
        return n + findSumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula (n*(n+1)/2)
    public static int findSumUsingFormula(int n) {
       
        return n * (n + 1) / 2; // Finding the sum by using formula
    }

    public static void main(String[] args) {
	
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt(); // Take the user's input

        // Check if the input is a natural number (positive integer)
        
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            scanner.close(); 
            return;    // Exit from program because of invalid input
        }

        // Call to the recursive method to calculate the sum of first n natural numbers
        int recursionSum = findSumUsingRecursion(number);

        // Call to the formula method to calculate the sum using the formula
        int formulaSum= findSumUsingFormula(number);

        // Display the results
        System.out.println("Sum of the first " + number + " natural numbers using recursion: " + recursionSum);
        System.out.println("Sum of the first " + number + " natural numbers using the formula: " + formulaSum);

        // Compare the two results to check if both methods gives the correct same sumor not
        if (recursionSum == formulaSum) {
            System.out.println("Both methods give the same result, the computation is correct!");
        } else {
            System.out.println("There is a mismatch between the two methods.");
        }

        // Close the scanner to free up resources after input is taken
        scanner.close();
    }
}