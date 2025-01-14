public class problem7 {
    public static void main(String[] args) {
        // Check if the user has provided exactly two arguments
        if (args.length != 2) {
            System.out.println("Please provide the month and day as command line arguments.");
            return;
        }

        // Parse the month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the given month and day fall within the Spring season
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
