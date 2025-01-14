// Importing Scanner for input
import java.util.Scanner; 

public class Problem6 {
    public static void main(String args[]) {
		// Creating Scanner for input
        Scanner sc = new Scanner(System.in); 

        // Reading salary and bonus
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
		
        System.out.println("Enter your bonus:");
        int bonus = sc.nextInt(); 

        // Calculating total income
        int totalIncome = salary + bonus;

        // Displaying the results
        System.out.println("The salary is INR " + salary +", the bonus is INR " + bonus + ", and the total income is INR " + totalIncome);
    }
}
