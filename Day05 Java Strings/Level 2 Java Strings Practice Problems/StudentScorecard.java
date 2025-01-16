import java.util.Random;
import java.util.Scanner;
public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics
            scores[i][1] = random.nextInt(90) + 10; // Chemistry
            scores[i][2] = random.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrade(double[][] percentages) {
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] calculations, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10s%n", scores[i][0], scores[i][1], scores[i][2], calculations[i][0], calculations[i][1], calculations[i][2], grades[i]);
        }
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt(); // Define the number of students

        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] calculations = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrade(calculations);

        displayScorecard(scores, calculations, grades);
    }
}

