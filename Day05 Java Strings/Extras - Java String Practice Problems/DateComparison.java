import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter the first date (yyyy-MM-dd):");
        String inputDate1 = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd):");
        String inputDate2 = scanner.nextLine();

        // Parse the input dates
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }

        scanner.close();
    }
}
