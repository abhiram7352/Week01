import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
	    // Creating a scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        // Storing the name of amar akbar anthony
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
		
		// Initialize arrays to store ages and heights
        double[] heights = new double[3];

        // Take a user input for ages and heights for the friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for "+names[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height : ");
            heights[i] = scanner.nextDouble();
        }

        //Here finding the youngest and tallest
        int youngestIndex = 0;
        int minAge = ages[0];
        int tallestIndex = 0;
        double maxHeight = heights[0];

        for (int i = 1; i < 3; i++) {
            // Checking for youngest
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }

            // Checking for tallest
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Results: ");
        System.out.println(" Youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("Tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    }
}
