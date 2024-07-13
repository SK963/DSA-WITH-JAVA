import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetExample {
    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> set = new HashSet<>();
        
        // Add elements to the set
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("Initial Set: " + set);
         // Output: [A, B, C]
        
        // size()
        System.out.println("Size of the set: " + set.size());
         // Output: 3
        
        // isEmpty()
        System.out.println("Is the set empty? " + set.isEmpty()); 
        // Output: false
        
        // contains(Object o)
        System.out.println("Does the set contain 'A'? " + set.contains("A")); 
        // Output: true
        System.out.println("Does the set contain 'D'? " + set.contains("D")); 
        // Output: false
        

        // add(E e)
        System.out.println("Add 'D' to the set: " + set.add("D")); 
        // Output: true
        System.out.println("Set after adding 'D': " + set); 
        // Output: [A, B, C, D]
        
        // addAll(Collection<? extends E> c)
        Set<String> newSet = new HashSet<>();
        newSet.add("E");
        newSet.add("F");
        set.addAll(newSet);
        System.out.println("Set after adding all elements from newSet: " + set); // Output: [A, B, C, D, E, F]
        
        // remove(Object o)
        System.out.println("Remove 'A' from the set: " + set.remove("A")); // Output: true
        System.out.println("Set after removing 'A': " + set); // Output: [B, C, D, E, F]
        
        // removeAll(Collection<?> c)
        Set<String> removeSet = new HashSet<>();
        removeSet.add("B");
        removeSet.add("C");
        set.removeAll(removeSet);
        System.out.println("Set after removing elements of removeSet: " + set); // Output: [D, E, F]
        
        // clear()
        set.clear();
        System.out.println("Set after clearing: " + set); // Output: []
        
        // retainAll(Collection<?> c)
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        
        Set<String> retainSet = new HashSet<>();
        retainSet.add("B");
        retainSet.add("C");
        retainSet.add("D");
        
        set1.retainAll(retainSet);
        System.out.println("Set1 after retaining elements in retainSet: " + set1); // Output: [B, C]
        
        // containsAll(Collection<?> c)
        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        System.out.println("Does set1 contain all elements in set2? " + set1.containsAll(set2)); // Output: true
        
        // equals(Object o)
        Set<String> set3 = new HashSet<>(set1);
        System.out.println("Does set1 equal set3? " + set1.equals(set3)); // Output: true
        
        // hashCode()
        System.out.println("HashCode of set1: " + set1.hashCode()); // Output: [hash code value]
        
        // iterator()
        set1.add("A");
        System.out.print("Iterating over set1: ");
        for (String s : set1) {
            System.out.print(s + " "); // Output: A B C (order may vary)
        }
        System.out.println();
        
        // toArray()
        Object[] array = set1.toArray();
        System.out.print("Array from set1: ");
        System.out.println(Arrays.toString(array));
        //output : [A, B, C]
        
        // toArray(T[] a)
        String[] strArray = set1.toArray(new String[0]);
        System.out.print("String array from set1: ");
        System.out.println(Arrays.toString(strArray));
        //output : [A, B, C]

        
        // of() methods
        Set<String> setOf = Set.of("X", "Y", "Z");
        System.out.println("Set created with of(): " + setOf); // Output: [X, Y, Z]
        
        // copyOf(Collection<? extends E> coll)
        Set<String> setCopy = Set.copyOf(setOf);
        System.out.println("Set created with copyOf(): " + setCopy); // Output: [X, Y, Z]
    }
}
