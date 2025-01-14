import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
	    // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
		
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
		
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Input heights
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = scanner.nextInt();
		
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = scanner.nextInt();
		
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend
        String youngestFriend;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        String tallestFriend;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

  
    }
}
