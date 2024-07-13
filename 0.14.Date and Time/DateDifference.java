import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        // Sample date string inputs

		Scanner sc  = new Scanner(System.in);
		
		
        String dateString1 = sc.nextLine();
        String dateString2 =  sc.nextLine();

        // Define the format of the date strings
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        
            // Parse the date strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(dateString1, formatter);
            LocalDate date2 = LocalDate.parse(dateString2, formatter);

            // Calculate the period between the two dates
            Period period = Period.between(date1, date2);

            // Output the difference
            System.out.println("Difference between the dates:");
            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days: " + period.getDays());


            sc.close();
        
    }
}
