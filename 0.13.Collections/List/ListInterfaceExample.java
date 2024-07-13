import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.ListIterator;

public class ListInterfaceExample {
    public static void main(String[] args) {
        
        // Create a new ArrayList
        List<String> fruits = new ArrayList<>();
        
        // Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Cherry"); // Insert "Cherry" at index 1
        fruits.addAll(Arrays.asList("Date", "Elderberry")); // Add multiple elements

        System.out.println("List after additions: " + fruits);
		
		fruits.addAll(1, Arrays.asList("Date", "Elderberry", "Fig"));
		System.out.println(fruits);
        
        // Size and Empty check
        System.out.println("Size of list: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());
        
        // Access elements
        System.out.println("Element at index 2: " + fruits.get(2));
        
        // Modify elements
        fruits.set(2, "Blueberry"); // Replace element at index 2
        System.out.println("List after modification: " + fruits);
        
        // Search, Check & Comparison
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Last index of 'Date': " + fruits.lastIndexOf("Date"));
        System.out.println("Does list contain 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Does list contain all elements of ['Apple', 'Date']? " + fruits.containsAll(Arrays.asList("Apple", "Date")));
        System.out.println("List equals another list? " + fruits.equals(Arrays.asList("Apple", "Cherry", "Blueberry", "Date", "Elderberry")));
        
        // Deletion
		System.out.println(fruits);
        fruits.remove(1); // Remove element at index 1
        fruits.remove("Date"); // Remove element by value
        System.out.println("List after removals: " + fruits);
        
        fruits.addAll(Arrays.asList("Fig", "Grape", "Honeydew" , "Apple" , "Blueberry"));
        System.out.println("List after adding more fruits: " + fruits);

        fruits.removeAll(Arrays.asList("Apple", "Blueberry")); // Remove all specified elements
        System.out.println("List after removeAll: " + fruits);
        
        fruits.retainAll(Arrays.asList("Elderberry", "Fig")); // Retain only specified elements
        System.out.println("List after retainAll: " + fruits);
        
        // Sorting
        fruits.addAll(Arrays.asList("Apple", "Cherry", "Banana"));
        fruits.sort(Comparator.naturalOrder()); // Sort elements
        System.out.println("List after sorting: " + fruits);
        
        // Replace all
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        fruits.replaceAll(toUpperCase); // Replace all elements with their uppercase versions
        System.out.println("List after replaceAll: " + fruits);
        
        // Traversing using for each loop
        System.out.print("Traversing list using for each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Traversing using list iterator
        System.out.print("Traversing list using listIterator: ");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

		// Get a ListIterator starting at a specific index (2)
        ListIterator<String> lit = fruits.listIterator(2);

        System.out.print ("Using ListIterator starting at index 2: ");
        // Iterate through the list starting at index 2
        while (lit.hasNext()) {
            System.out.print(lit.next() +" ");
        }
		System.out.println();

        // Reverse the list using ListIterator
        System.out.print("Reversing and printing the list: ");
        ListIterator<String> reverseIterator = fruits.listIterator(fruits.size());
        while (reverseIterator.hasPrevious()) {
            System.out.print(reverseIterator.previous() + " ");
        }
		System.out.println();

        
    

        // Sublist
        List<String> subList = fruits.subList(1, 3);
        System.out.println("Sublist (index 1 to 3): " + subList);

        // toArray() - Convert the list to an Object array
        Object[] fruitsArray = fruits.toArray();
        System.out.println("Array (toArray()): " + Arrays.toString(fruitsArray));

        // toArray(T[]) - Convert the list to a String array
        String[] fruitsStringArray = fruits.toArray(new String[0]);
        System.out.println("Array (toArray(T[])): " + Arrays.toString(fruitsStringArray));

        // copyOf(Collection<? extends E>) - Create an unmodifiable copy of the list
        List<String> unmodifiableFruits = List.copyOf(fruits);
        System.out.println("Unmodifiable list (copyOf): " + unmodifiableFruits);

        // Attempt to modify the unmodifiable list (will throw UnsupportedOperationException)
        try {
            unmodifiableFruits.add("Date");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the unmodifiable list: " + e.getMessage());
        }

		//immutable list  using List.of() methods
		// Create an empty list using List.of()
        List<String> emptyList = List.of();
        System.out.println("Empty list: " + emptyList);

        // Create a list with a single element using List.of(E)
        List<String> singleElementList = List.of("Apple");
        System.out.println("Single element list: " + singleElementList);

        // Create a list with two elements using List.of(E, E)
        List<String> twoElementList = List.of("Apple", "Banana");
        System.out.println("Two element list: " + twoElementList);

        // Create a list with multiple elements using List.of(E...)
        List<String> multipleElementList = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");
        System.out.println("Multiple element list: " + multipleElementList);

        // Attempt to modify the immutable list (will throw UnsupportedOperationException)
        try {
            multipleElementList.add("Fig");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable list: " + e.getMessage());
        }

		
        // Clear list
        fruits.clear();
        System.out.println("List after clear: " + fruits);


		
    }
}

/*
List after additions: [Apple, Cherry, Banana, Date, Elderberry]
[Apple, Date, Elderberry, Fig, Cherry, Banana, Date, Elderberry]
Size of list: 8
Is list empty? false
Element at index 2: Elderberry
List after modification: [Apple, Date, Blueberry, Fig, Cherry, Banana, Date, Elderberry]
Index of 'Banana': 5
Last index of 'Date': 6
Does list contain 'Apple'? true
Does list contain all elements of ['Apple', 'Date']? true
List equals another list? false
[Apple, Date, Blueberry, Fig, Cherry, Banana, Date, Elderberry]
List after removals: [Apple, Blueberry, Fig, Cherry, Banana, Elderberry]
List after adding more fruits: [Apple, Blueberry, Fig, Cherry, Banana, Elderberry, Fig, Grape, Honeydew, Apple, Blueberry]
List after removeAll: [Fig, Cherry, Banana, Elderberry, Fig, Grape, Honeydew]
List after retainAll: [Fig, Elderberry, Fig]
List after sorting: [Apple, Banana, Cherry, Elderberry, Fig, Fig]
List after replaceAll: [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Traversing list using for each: APPLE BANANA CHERRY ELDERBERRY FIG FIG 
Traversing list using listIterator: APPLE BANANA CHERRY ELDERBERRY FIG FIG 
Using ListIterator starting at index 2: CHERRY ELDERBERRY FIG FIG 
Reversing and printing the list: FIG FIG ELDERBERRY CHERRY BANANA APPLE 
Sublist (index 1 to 3): [BANANA, CHERRY]
Array (toArray()): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Array (toArray(T[])): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Unmodifiable list (copyOf): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Cannot modify the unmodifiable list: null
Empty list: []
Single element list: [Apple]
Two element list: [Apple, Banana]
Multiple element list: [Apple, Banana, Cherry, Date, Elderberry]
Cannot modify the immutable list: null
List after clear: []

*/