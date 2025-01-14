import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive, negative, or zero
    public String isPositiveOrNegative(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // Method to checking whether the number is even or odd
    public String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();

        int[] numbers = new int[5];  // Array to store the 5 numbers
		//Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Taking input for each number
        }

        // Loop the array to check positivity/negativity and even/odd
        for (int number : numbers) {
            String positivity = numberChecker.isPositiveOrNegative(number);
            if (positivity.equals("positive")) {
                System.out.println(number + " is positive and " + numberChecker.isEvenOrOdd(number) + ".");
            } else if (positivity.equals("negative")) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last numbers
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
		
        int comparisonResult = numberChecker.compare(first, last);

        // Output the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first number " + first + " is greater than the last number " + last + ".");
        } else if (comparisonResult == -1) {
            System.out.println("The first number " + first + " is less than the last number " + last + ".");
        } else {
            System.out.println("The first number " + first + " is equal to the last number " + last + ".");
        }

        scanner.close(); // Closing the scanner
    }
}
