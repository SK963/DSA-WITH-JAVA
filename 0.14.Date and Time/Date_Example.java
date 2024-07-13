import java.util.Date;

public class Date_Example {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
		
        // Creating Date objects using various constructors
        Date currentDate = new Date(); // Current date and time
        Date futureDate = new Date(2025 - 1900, 4, 3, 12, 30, 0); // May 3, 2025, 12:30:00
        Date pastDate = new Date(2023 - 1900, 4, 3); // May 3, 2023, 00:00:00

        // Demonstrating various methods
        boolean isAfter = futureDate.after(currentDate);
        boolean isBefore = pastDate.before(currentDate);
        Date clonedDate = (Date) currentDate.clone();
        int comparison = currentDate.compareTo(futureDate);
        boolean isEqual = currentDate.equals(clonedDate);
        long millis = currentDate.getTime();
        int dayOfMonth = currentDate.getDate();
        int dayOfWeek = currentDate.getDay();
        int hours = currentDate.getHours();
        int minutes = currentDate.getMinutes();
        
        int month = currentDate.getMonth();
        int seconds = currentDate.getSeconds();
        int year = currentDate.getYear() + 1900;
        int timezoneOffset = currentDate.getTimezoneOffset();
        currentDate.setDate(15); // Setting the day of the month
        currentDate.setHours(15); // Setting the hour
        currentDate.setMinutes(30); // Setting the minutes
        currentDate.setMonth(5); // Setting the month (June)
        currentDate.setSeconds(45); // Setting the seconds
        currentDate.setTime(System.currentTimeMillis()); // Setting the time to current time
        currentDate.setYear(2025 - 1900); // Setting the year
        String gmtString = currentDate.toGMTString(); // GMT representation
        String localeString = currentDate.toLocaleString(); // Locale-specific representation
        String dateString = currentDate.toString(); // Default string representation
        // Static method
        long parsedMillis = Date.parse("Fri May 03 12:30:45 GMT 2024"); // Parsing string to milliseconds
        // Deprecated static method
        long utcMillis = Date.UTC(2024 - 1900, 4, 3, 12, 30, 45); // UTC time in milliseconds

        // Output
        System.out.println("isAfter: " + isAfter);
        System.out.println("isBefore: " + isBefore);
        System.out.println("comparison: " + comparison);
        System.out.println("isEqual: " + isEqual);
        System.out.println("millis: " + millis);
        System.out.println("dayOfMonth: " + dayOfMonth);
        System.out.println("dayOfWeek: " + dayOfWeek);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("month: " + month);
        System.out.println("seconds: " + seconds);
        System.out.println("year: " + year);
        System.out.println("timezoneOffset: " + timezoneOffset);
        System.out.println("Date after setting: " + currentDate);
        System.out.println("gmtString: " + gmtString);
        System.out.println("localeString: " + localeString);
        System.out.println("dateString: " + dateString);
        System.out.println("parsedMillis: " + parsedMillis);
        System.out.println("utcMillis: " + utcMillis);
    }
}

//output
// isAfter: true
// isBefore: true
// comparison: -1
// isEqual: true
// millis: 1714761725113
// dayOfMonth: 3
// dayOfWeek: 5
// hours: 18
// minutes: 42
// month: 4
// seconds: 5
// year: 2024
// timezoneOffset: 0
// Date after setting: Sat May 03 18:42:05 GMT 2025
// gmtString: 3 May 2025 18:42:05 GMT
// localeString: May 3, 2025, 6:42:05 PM
// dateString: Sat May 03 18:42:05 GMT 2025
// parsedMillis: 1714739445000
// utcMillis: 1714739445000
