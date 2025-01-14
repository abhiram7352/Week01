import java.util.*;
public class Problem6 {

    public static boolean checkSpring(int month,int day){
	    // Check if the given month and day fall within the Spring season
		if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return true;
		}else {
            return false;
		}
	}
    public static void main(String[] args) {
        // Check if the user has provided exactly two arguments
        if (args.length != 2) {
            System.out.println("Please provide the month and day as command line arguments.");
            return;
        }

        // Parse the month and day from the command line arguments using parseInt method
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
		boolean isSpring=checkSpring( month , day);
		
		// validity of day and month
		if(month <0 || month >12 || day<0 || day>30){
			System.out.println("Enter the valid month and day !! ");
			System.exit(0);
		}
        
		// checking entered month and day falls into spring season or not
		if(isSpring){
		    System.out.println("It's a spring season !! ");
		}else{
		    System.out.println("It's not a spring season !! ");
		}
       
    }
}
