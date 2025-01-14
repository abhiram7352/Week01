
class FactorsCalculator {

    // Method to find the factors of the given number and return them as an array
    public static int[] getFactors(int number) {
        int count = 0;

        // Count the number of factors by checking divisibility
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // count each factor
            }
        }

        // Initialize the array to store all the factors
        int[] factors = new int[count];
        int index = 0;

        // Store each factor in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // Add factor to the array
            }
        }
        // Return the array of factors
        return factors;
    }

    // Here we are calculating the sum of all the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        // Add each factor to the sum
        for (int factor : factors) {
            sum += factor;
        }

        return sum;  // Returning the sum of the factors
    }

    // Calculating the product of the factors
    public static int findProductOfFactors(int[] factors) {
        int product = 1;

        // Multiply each factor to calculate the product
		
        for (int factor : factors) {
            product *= factor;
        }

        return product;   // Return the product of the factors
    }

    // Calculating  sum of squares of the factors
	
    public static int findSumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;

        // Add the square of each factor to the sum of squares
        for (int factor : factors) {
		
		    // Math.pow computes the square
            sumOfSquares += Math.pow(factor, 2); 
        }
         // Return the sum of squares of the factors
        return sumOfSquares;    
    }

    public static void main(String[] args) {
	
        // Create a Scanner object to take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();  // Read the input number
        scanner.close();

        // Get the factors of the number
        int[] factors = getFactors(number);

        // Displaying all  the factors
        System.out.println("Factors of the number are :");
        for (int factor : factors) {
            System.out.print(factor + " "); // Printing each factor
        }
        System.out.println(); // Printing in a newline 
		
        // Calculating and display the sum of all the factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of the all the factors: " + sumOfFactors);

        // Calculating and display the product of all tthe factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of the factors: " + productOfFactors);

        // Calculating and display the sum of squares of all the factors
        int sumOfSquaresOfFactors = findSumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of the factors: " + sumOfSquaresOfFactors);
    }
}
