import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3]; // Storing  marks of Physics, Chemistry, and Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
				
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Marks must be between 0 and 100. Please re-enter.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculating total marks and percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Determine grade based on percentage
			
            if (percentages[i] >= 80) {
                grades[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentages[i] >= 70) {
                grades[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentages[i] >= 60) {
                grades[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            } else if (percentages[i] >= 50) {
                grades[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percentages[i] >= 40) {
                grades[i] = "D- (Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = "R (Remedial standards)";
            }
        }

        // Display results for each student
        System.out.println("Student Results: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(" Student "+ (i + 1));
            System.out.println("Physics : "+marks[i][0]+ " Chemistry : "+ marks[i][1]+" Maths : "+marks[i][2]);
            System.out.println("Percentage: "+ percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
