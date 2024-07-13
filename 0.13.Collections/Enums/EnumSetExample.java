import java.util.EnumSet;

public class EnumSetExample 
{

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) 
    {

        // Creating an empty EnumSet
        EnumSet<Day> noneOfDays = EnumSet.noneOf(Day.class);
        System.out.println("noneOfDays: " + noneOfDays); // Output: noneOfDays: []

        // Creating an EnumSet with all days
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("allDays: " + allDays); // Output: allDays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        // Creating a copy of an EnumSet
        EnumSet<Day> copyOfAllDays = EnumSet.copyOf(allDays);
        System.out.println("copyOfAllDays: " + copyOfAllDays); // Output: copyOfAllDays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        
        // Creating an EnumSet with a range of elements
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        
        // Creating an EnumSet with a complement of another EnumSet
        EnumSet<Day> weekends = EnumSet.complementOf(weekdays);
        System.out.println("weekdays: " + weekdays); // Output: weekdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
        System.out.println("weekends: " + weekends); // Output: weekends: [SATURDAY, SUNDAY]

        
    
        // Creating EnumSets with specific elements
        EnumSet<Day> oneDay = EnumSet.of(Day.MONDAY);
        EnumSet<Day> twoDays = EnumSet.of(Day.MONDAY, Day.TUESDAY);
        EnumSet<Day> threeDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
        EnumSet<Day> fourDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY);
        EnumSet<Day> fiveDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
        EnumSet<Day> variableDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);


        System.out.println("oneDay: " + oneDay); // Output: oneDay: [MONDAY]
        System.out.println("twoDays: " + twoDays); // Output: twoDays: [MONDAY, TUESDAY]
        System.out.println("threeDays: " + threeDays); // Output: threeDays: [MONDAY, TUESDAY, WEDNESDAY]
        System.out.println("fourDays: " + fourDays); // Output: fourDays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY]
        System.out.println("fiveDays: " + fiveDays); // Output: fiveDays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
        System.out.println("variableDays: " + variableDays); // Output: variableDays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        // Cloning an EnumSet
        EnumSet<Day> clonedWeekdays = weekdays.clone();
        System.out.println("clonedWeekdays: " + clonedWeekdays); // Output: clonedWeekdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
    
        
        }
}
