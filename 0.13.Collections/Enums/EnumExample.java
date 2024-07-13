


public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        // Using name() method
        System.out.println("name(): " + Day.MONDAY.name());

        // Using ordinal() method
        System.out.println("ordinal(): " + Day.TUESDAY.ordinal());

        // Using toString() method
        System.out.println("toString(): " + Day.MONDAY.toString());

        // Using equals(Object) method
        System.out.println("equals(): " + Day.MONDAY.equals(Day.TUESDAY));
        System.out.println("equals(): " + Day.MONDAY.equals(Day.MONDAY));
        // Using hashCode() method
        System.out.println("hashCode(): " + Day.MONDAY.hashCode());

        // Using compareTo(E) method
        System.out.println("compareTo(): " + Day.TUESDAY.compareTo(Day.TUESDAY));
        System.out.println("compareTo(): " + Day.TUESDAY.compareTo(Day.MONDAY));
        System.out.println("compareTo(): " + Day.TUESDAY.compareTo(Day.WEDNESDAY));

        // Using getDeclaringClass() method
        System.out.println("getDeclaringClass(): " + Day.MONDAY.getDeclaringClass());

        // Using describeConstable() method
        System.out.println("describeConstable(): " + Day.MONDAY.describeConstable());

        // Using valueOf(Class<T>, String) method
        System.out.println("valueOf(): " + Enum.valueOf(Day.class, "MONDAY"));
    }
}

/*Output
 

 */
