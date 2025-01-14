import java.util.Scanner;

public class FriendInfo {

    // Method to find the youngest friend based on age
    public String findYoungestFriend(int[] ages, String[] names) {
        int minAge = ages[0]; // Start with the first friend's age as the minimum age
        String youngestFriend = names[0]; // Assume the first friend is the youngest initially
        
        // Loop through the array of ages to find the minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) { 
                minAge = ages[i];  // Updating the minimum age
                youngestFriend = names[i];   // Update the name of the youngest friend
            }
        }
       
        return youngestFriend;
    }

    // Method to find the tallest friend based on height
    public String findTallestFriend(int[] heights, String[] names) {
        int maxHeight = heights[0]; 
        String tallestFriend = names[0];  // Assume the first friend is the tallest initially
        
      
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];   // Updating the maximum height
                tallestFriend = names[i];  // Updating the name of the tallest friend
            }
        }
        
        return tallestFriend;
    }

    public static void main(String[] args) {
        // Create an instance of FriendInfo class
        FriendInfo friend = new FriendInfo();
        
        // Declare arrays to store ages, heights, and names of the friends
        int[] ages = new int[3];   // Array to store ages of 3 friends
        int[] heights = new int[3];   // Array to store heights of 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};   // Array to store names of the friends
        
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Loop to take input for age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();  // Store the input age in the ages array
			
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = scanner.nextInt(); // Store the input height in the heights array
        }
        
        // Find and display the youngest friend
        String youngest = friend.findYoungestFriend(ages, names);   // Calling the method to find the youngest friend
        System.out.println("\nThe youngest friend is: " + youngest); // Displaying the name of the youngest friend
        
        // Find and display the tallest friend
        String tallest = friend.findTallestFriend(heights, names); // Calling the method to find the tallest friend
        System.out.println("The tallest friend is: " + tallest); // Displaying the name of the tallest friend
        
        // Close the scanner
        scanner.close(); 
    }
}
