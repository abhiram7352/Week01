public class Problem5 {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 3) {
            System.out.println("Please provide three command-line arguments: month, day, and year.");
            return;
        }
        
       //Getting input values from command line interface
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        // Calculating the year part of the formula
        int y0 = y - (14 - m) / 12;
        
        // Calculating x using the formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // Calculating the month part of the formula
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // Calculating the day of the week using the formula
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Printing the result (0 for Sunday, 1 for Monday, ..., 6 for Saturday)
        System.out.println(d0);
    }
}
