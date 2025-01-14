import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter the number of rows we want: ");
        int rows = scanner.nextInt();
		
        System.out.print("Enter the number of columns we want: ");
        int columns = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");

        // Take user input for matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
			    // Taking user input for particular cell i and j
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array and we create a new array of size rows*columns
        int[] copy = new int[rows * columns];
        int index = 0;

        //Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                copy[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("After copying all element from matrix to single array is : ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
