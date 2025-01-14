import java.util.Random;
import java.util.Scanner;

class StudentScores {
    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();  // Taking number of student as input

        int[][] scores = generateRandomScores(numberOfStudents); // Store random generated score
        double[][] results = calculateResults(scores);
        displayScorecard(results);
    }

    // Generate random scores
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Math
        }
        return scores;
    }

    // Calculate results
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][6]; // 6 columns: Physics, Chemistry, Math, Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int math = scores[i][2];
            int total = physics + chemistry + math;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = physics;    // Physics
            results[i][1] = chemistry;  // Chemistry
            results[i][2] = math;       // Math
            results[i][3] = total;      // Total
            results[i][4] = average;    // Average
            results[i][5] = percentage; // Percentage
        }
        return results;
    }

    // Display scorecard
    public static void displayScorecard(double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        for (double[] result : results) {
            System.out.printf("%-10.0f %-10.0f %-10.0f %-10.0f %-10.2f %-10.2f\n", result[0], result[1], result[2], result[3], result[4], result[5]);
        }
    }
}
