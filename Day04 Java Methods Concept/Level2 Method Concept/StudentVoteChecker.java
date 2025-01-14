import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student is eligible to vote based on their age
    public boolean canStudentVote(int age) {
        // If the age is negative, it is invalid, so return false (student cannot vote)
        if (age < 0) {
            return false; 
        }
        // If the age is 18 or more, return true (student can vote)
        if (age >= 18) {
            return true; 
        }
        // If the age is less than 18, return false (student cannot vote)
        return false; 
    }

    public static void main(String[] args) {
        // Creating an instance of the StudentVoteChecker class to call its methods
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Storing the ages of 10 students
        int[] ages = new int[10];
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
    
        for (int i = 0; i < 10; i++) {
            // Enter the age of the student
            System.out.print("Enter the age of student " + (i + 1) + ": ");
			
            // Store the entered age into the ages array
            ages[i] = scanner.nextInt();
            
            // Check if the current student is eligible to vote using the method
            boolean canVote = voteChecker.canStudentVote(ages[i]);
            
            // Print whether the student can vote or not
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote."); // If true, the student can vote
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote."); // If false, the student cannot vote
            }
        }

        // Close the Scanner object 
        scanner.close();
    }
}
