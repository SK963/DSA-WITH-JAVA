import java.util.*;

public class SortedSetExample {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) 
	{
		
      	SortedSet<String> sortedSet = new TreeSet<>();
        
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
        sortedSet.add("grapes");

		 // Using comparator()
        Comparator comparator = sortedSet.comparator();
        System.out.println("Comparator: " + comparator); 
        // Output: Comparator: null (natural ordering)

		
        
        System.out.println("Sorted Set: " + sortedSet); 
        // Outputs: Sorted Set: [apple, banana, grapes, orange]
        
        // Using methods of SortedSet
        System.out.println("First element: " + sortedSet.first()); 
        // Outputs: First element: apple
        System.out.println("Last element: " + sortedSet.last()); 
        // Outputs: Last element: orange
        
        SortedSet<String> subset = sortedSet.subSet("banana", "orange");
        System.out.println("Subset: " + subset); 
        // Outputs: Subset: [banana, grapes]

        System.out.println("HeadSet: " + sortedSet.headSet("banana"));  
        //output: HeadSet: [apple]
        
        System.out.println("TailSet: "+ sortedSet.tailSet("banana")); 
        //output: TailSet: [banana, grapes, orange]
    }
}
