import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
		// Create a 11 size of array called player
		int player[]=new int[11];
        int totalHeights=0; // Initializing sum to zero
		
		 System.out.println("Enter  the heights of player :");
        // Taking user input for height of all player
        for (int i = 0; i <11; i++) {
			player[i]=sc.nextInt();
			totalHeights+=player[i];
        }
		
		//Finding the mean height
		
		double meanHeight=(totalHeights/11f);
		System.out.println(" Mean height of the football team :"+meanHeight);
    }
}
