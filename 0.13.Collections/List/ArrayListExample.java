import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    {
        // Constructor with default initial capacity
        ArrayList<String> list1 = new ArrayList<>();
        
        // Constructor with defined initial capacity
        ArrayList<String> list2 = new ArrayList<>(20);
        
        // Constructor from a collection
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        // Add an element to the list
        list1.add("A"); 
        // Output: [A]
        System.out.println(list1);

        // Get the size of the list
        System.out.println(list1.size()); 
        // Output: 1

        // Trim the capacity to the current size
        list1.trimToSize();

        // Ensure the capacity is at least 15
        list1.ensureCapacity(15);

        // Check if the list is empty
        System.out.println(list1.isEmpty()); 
        // Output: false

        // Add an element to the end of the list
        list1.add("B"); 
        // Output: [A, B]
        System.out.println(list1);

        // Add an element at index 1
        list1.add(1, "C"); 
        // Output: [A, C, B]
        System.out.println(list1);

        // Add all elements from the collection to the end
        list1.addAll(Arrays.asList("D", "E")); 
        // Output: [A, C, B, D, E]
        System.out.println(list1);

        // Add all elements from the collection at index 2
        list1.addAll(2, Arrays.asList("F", "G")); 
        // Output: [A, C, F, G, B, D, E]
        System.out.println(list1);

        // Get the element at index 0
        System.out.println(list1.get(0)); 
        // Output: A

        // Set the element at index 0 to "H"
        list1.set(0, "H"); 
        // Output: [H, C, F, G, B, D, E]
        System.out.println(list1);

        // Replace all elements using the provided UnaryOperator
        list1.replaceAll(e -> e.toLowerCase()); 
        // Output: [h, c, f, g, b, d, e]
        System.out.println(list1);

        // Remove and return the element at index 1
        System.out.println(list1.remove(1)); 
        // Output: c
        // Output: [h, f, g, b, d, e]
        System.out.println(list1);

        // Remove the first occurrence of "d"
        System.out.println(list1.remove("d")); 
        // Output: true
        // Output: [h, f, g, b, e]
        System.out.println(list1);

        // Remove all elements in the specified collection
        list1.removeAll(Arrays.asList("e", "f")); 
        // Output: [h, g, b]
        System.out.println(list1);

        // Retain only the elements in the specified collection
        list1.retainAll(Arrays.asList("h", "g")); 
        // Output: [h, g]
        System.out.println(list1);

        // Remove all elements
        list1.clear(); 
        // Output: []
        System.out.println(list1);

        // Add all elements from the collection to the list
        list1.addAll(Arrays.asList("A", "B", "C", "D")); 
        // Output: [A, B, C, D]
        System.out.println(list1);

        // Remove elements matching the predicate
        list1.removeIf(e -> e.equals("B")); 
        // Output: [A, C, D]
        System.out.println(list1);

        // Check if "A" is present
        System.out.println(list1.contains("A")); 
        // Output: true

        // Get the index of the first occurrence of "C"
        System.out.println(list1.indexOf("C")); 
        // Output: 1

        // Add "A" to the list
        list1.add("A"); 
        // Output: [A, C, D, A]
        System.out.println(list1);

        // Get the index of the last occurrence of "A"
        System.out.println(list1.lastIndexOf("A")); 
        // Output: 3

        // Iterate through the list using listIterator
        list1.listIterator().forEachRemaining(System.out::println); 
        // Output: A
        //         C
        //         D
        //         A

        // Perform the given action for each element
        list1.forEach(System.out::println); 
        // Output: A
        //         C
        //         D
        //         A

        // Iterate through the elements using spliterator
        list1.spliterator().forEachRemaining(System.out::println); 
        // Output: A
        //         C
        //         D
        //         A

        // Compare the list with another object
        ArrayList<String> list4 = new ArrayList<>(list1);
        System.out.println(list1.equals(list4)); 
        // Output: true

        // Create a view of the portion of the list
        List<String> subList = list1.subList(1, 3); 
        // Output: [C, D]
        System.out.println(subList);

        // Sort the list according to the natural order
        list1.sort(Comparator.naturalOrder()); 
        // Output: [A, A, C, D]
        System.out.println(list1);

        // Convert the list to an array
        Object[] array1 = list1.toArray(); 
        // Output: [A, A, C, D]
        System.out.println(Arrays.toString(array1));

        // Convert the list to an array of type String
        String[] array2 = list1.toArray(new String[0]); 
        // Output: [A, A, C, D]
        System.out.println(Arrays.toString(array2));
    }
}
