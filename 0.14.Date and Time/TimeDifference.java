import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;

public class TimeDifference {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String start = sc.nextLine();
		String end = sc.nextLine();
       
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        
        LocalTime time0 = LocalTime.parse(start, formatter);
		LocalTime time1 = LocalTime.parse(end, formatter);
            
           
        System.out.println("start time: " + time0);
		System.out.println("end time: " + time1);
		Duration duration = Duration.between(time0, time1);			 
		long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println( hours + " hours and " + minutes + " minutes");
		

		sc.close();
    }
}
