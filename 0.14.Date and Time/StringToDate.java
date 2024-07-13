import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//wrong output
public class StringToDate {
    public static void main(String[] args) {
        // String representation of the date
        String dateString = "2024-03-29";

        // Define the date format of the input string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try 
		{
            // Parse the string into a Date object
            Date date = dateFormat.parse(dateString);

            // Output the Date object
            System.out.println("Parsed Date: " + date);
        }
		catch (ParseException e) 
		{
            // Handle parsing errors
            e.printStackTrace();
        }
		
    }
}
