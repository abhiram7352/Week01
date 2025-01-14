import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays (salaries,yearsOfService,bonuses)
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
		
		// Creating the variables totalBonus , totalNewSalary ,totalOldSalary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = scanner.nextDouble();

                System.out.print("Enter years of service: ");
                yearsOfService[i] = scanner.nextDouble();

                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    break; // For a Valid input
                } else {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                }
            }
        }

        // Step 2: Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus percentage based on years of service
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;

            // Here we are calculating new salary
            newSalaries[i] = salaries[i] + bonuses[i];

            // Updating totalBonus , totalNewSalary ,totalOldSalary for each employee
            totalBonus += bonuses[i];  // total bonuses ew are calculating
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the results
        System.out.println("Employee Details with Bonus and New Salary:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee "+ 
                i + 1 +" " +salaries[i]+ " "+ bonuses[i] +" " +newSalaries[i]);
        }

        System.out.println("Total Bonus Payout: "+ totalBonus);
        System.out.println("Total Old Salary: " +totalOldSalary);
        System.out.println("Total New Salary: "+ totalNewSalary);
    }
}
