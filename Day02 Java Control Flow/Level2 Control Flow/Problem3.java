import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
	    // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        // Check if marks are valid
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Marks must be between 0 and 100.");
        } else {
            // Compute total marks, percentage, and average
            int totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 3.0);

            // Determine grade and remarks
            String grade;
            String remarks;

            if (percentage >=80) {
                grade = "A";
                remarks = "(Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards ";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards)";
            } 
			 else if (percentage >= 40) {
                grade = "D";
                remarks = "(Level 1- , too below agency-normalized standards)";
            }
			else {
                grade = "R";
                remarks = "(Remedial standards)";
            }

            // Display results
            System.out.println("Average Marks: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
