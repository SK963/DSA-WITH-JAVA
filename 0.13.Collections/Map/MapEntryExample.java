import java.util.*;
import java.util.Map.Entry;

public class MapEntryExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Apple", 3);

        System.out.println("The map looks like: " + map);
        // Output: The map looks like: {Banana=2, Cherry=5, Apple=3}

        // Accessing entries
        for (Entry<String, Integer> entry : map.entrySet()) {
            // getKey() and getValue() - Access the key and value of each entry
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Output: Key: Banana, Value: 2
        // Output: Key: Cherry, Value: 5
        // Output: Key: Apple, Value: 3

        // Using setValue() - Modify the value of the first entry
        Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
        System.out.println("Original first entry: " + firstEntry);
        // Output: Original first entry: Banana=2
        firstEntry.setValue(10);
        System.out.println("Modified first entry: " + firstEntry);
        // Output: Modified first entry: Banana=10

        // equals(Object) and hashCode() - Compare entries and get hash codes
        Entry<String, Integer> entry1 = map.entrySet().iterator().next();
        Entry<String, Integer> entry2 = new AbstractMap.SimpleEntry<>("Banana", 10);
        System.out.println("Entry1 equals Entry2? " + entry1.equals(entry2));
        // Output: Entry1 equals Entry2? true

        System.out.println("Entry1 hashCode: " + entry1.hashCode());
        // Output: Entry1 hashCode: 2223138
        
        System.out.println("Entry2 hashCode: " + entry2.hashCode());
        // Output: Entry2 hashCode: 2223138

        // Comparing entries by key
        List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Entry.comparingByKey());
        System.out.println("Entries sorted by key: " + entryList);
        // Output: Entries sorted by key: [Apple=3, Banana=10, Cherry=5]

        // Comparing entries by value
        entryList.sort(Entry.comparingByValue());
        System.out.println("Entries sorted by value: " + entryList);
        // Output: Entries sorted by value: [Apple=3, Cherry=5, Banana=10]

        // Comparing entries by key using a custom comparator
        entryList.sort(Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("Entries sorted by key (reverse order): " + entryList);
        // Output: Entries sorted by key (reverse order): [Cherry=5, Banana=10, Apple=3]

        // Comparing entries by value using a custom comparator
        entryList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("Entries sorted by value (reverse order): " + entryList);
        // Output: Entries sorted by value (reverse order): [Banana=10, Cherry=5, Apple=3]

        // Copying an entry
        Entry<String, Integer> copiedEntry = Entry.copyOf(entry1);
        System.out.println("Copied entry: " + copiedEntry);
        // Output: Copied entry: Banana=10
    }
}
