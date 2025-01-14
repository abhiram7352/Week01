import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create separate arrays to store marks, percentages, and grades
		
        int[] physicsMarks = new int[numStudents];
		
        int[] chemistryMarks = new int[numStudents];
		
        int[] mathsMarks = new int[numStudents];
		
        double[] percentages = new double[numStudents];
		
        String[] grades = new String[numStudents];

        // Take input for marks of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");


            // Taking user input for physics
            do {
                System.out.print("Physics: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Marks must be between 0 and 100. Please re-enter.");
                }
            } while (physicsMarks[i] < 0 || physicsMarks[i] > 100);


            // Taking user input for chemistry
            do {
                System.out.print("Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Marks must be between 0 and 100. Please re-enter.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);


            // Taking user input for maths
            do {
                System.out.print("Maths: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Marks must be between 0 and 100. Please re-enter.");
                }
            } while (mathsMarks[i] < 0 || mathsMarks[i] > 100);
            
			
            // Calculating total marks and percentage
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
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
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics : "+physicsMarks[i]+ " Chemistry : "+ chemistryMarks[i]+" Maths : "+mathsMarks[i]);
            System.out.println("Percentage: "+ percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

        scanner.close();
    }
}
