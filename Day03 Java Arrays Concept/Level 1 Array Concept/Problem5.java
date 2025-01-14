import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
		int num[]=new int[10];
        // Using a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <=9; i++) {
            // Calculate and print the result of multiplication
			num[i-1]=number*i;
        }
		 for (int i = 1; i <= 10; i++) { 
		 
		    if(i<6){
				continue;
			}
            // Calculate and print the result of multiplication
			System.out.println(number +"*"+ i + "=" +num[i-1]);
        }
    }
}
