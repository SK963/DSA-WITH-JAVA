import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Arrays;

public class HashSetExample {
    @SuppressWarnings({ "unused", "unchecked" })
    public static void main(String[] args) 
    {

        // Constructor: HashSet with default initial capacity
        HashSet<String> set1 = new HashSet<>();
        
        // Constructor: HashSet from a collection
        HashSet<String> set2 = new HashSet<>(set1);
        
        // Constructor: HashSet with defined initial capacity and load factor
        HashSet<String> set3 = new HashSet<>(10, 0.75f);
        
        // Constructor: HashSet with defined initial capacity
        HashSet<String> set4 = new HashSet<>(10);
        
        // size()
        System.out.println("Size of set1: " + set1.size()); // Output: 0
        
        // isEmpty()
        System.out.println("Is set1 empty? " + set1.isEmpty()); // Output: true
        
        // add(E e)
        set1.add("A");
        set1.add("B");
        set1.add("C");
        System.out.println("Set1 after adding elements: " + set1); 
        // Output: [A, B, C]
        
        // contains(Object o)
        System.out.println("Does set1 contain 'A'? " + set1.contains("A")); // Output: true
        System.out.println("Does set1 contain 'D'? " + set1.contains("D")); // Output: false
        
        // remove(Object o)
        set1.remove("A");
        System.out.println("Set1 after removing 'A': " + set1); // Output: [B, C]
        
        // clear()
        set1.clear();
        System.out.println("Set1 after clearing: " + set1); // Output: []
        
        // clone()
        set1.add("X");
        set1.add("Y");
        set1.add("Z");
        HashSet<String> clonedSet = (HashSet<String>) set1.clone();
        System.out.println("Cloned set from set1: " + clonedSet); // Output: [X, Y, Z]
        
        // iterator()
        Iterator<String> iterator = set1.iterator();
        System.out.print("Iterating over set1: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Output: X Y Z (order may vary)
        }
        System.out.println();
        
        // spliterator()
        Spliterator<String> spliterator = set1.spliterator();
        System.out.print("Spliterator over set1: ");
        spliterator.forEachRemaining(System.out::print); // Output: XYZ (order may vary)
        System.out.println();
        
        // toArray()
        Object[] array = set1.toArray();
        System.out.print("Array from set1: ");
        System.out.println(Arrays.toString(array));
        
        // toArray(T[] a)
        String[] strArray = set1.toArray(new String[0]);
        System.out.print("String array from set1: ");
        System.out.println(Arrays.toString(strArray));
        
        // newHashSet(int initialCapacity) 
        HashSet<Integer> set5 = HashSet.newHashSet(10);
        set5.add(1);
        set5.add(2);
        set5.add(3);
        System.out.println("Set5 with initial capacity 10: " + set5); // Output: [1, 2, 3]
    }
}
