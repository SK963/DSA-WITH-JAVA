import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {


        // TreeSet constructors

        TreeSet<String> treeSet = new TreeSet<>();

        // add(E e)
        // Adds an element to the set
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");


        // Constructor: TreeSet(Collection<? extends E> c)
        // Creates a TreeSet containing the elements in the specified collection
        TreeSet<String> treeSet2 = new TreeSet<>(treeSet);
        
        // Constructor: TreeSet(Comparator<? super E> comparator)
        // Creates a TreeSet with the specified comparator
        TreeSet<String> treeSet3 = new TreeSet<>(Comparator.reverseOrder());
        treeSet3.addAll(treeSet);

        // Constructor: TreeSet(SortedSet<E> s)
        // Creates a TreeSet containing the elements in the specified sorted set
        TreeSet<String> treeSet4 = new TreeSet<>(treeSet2);

        // Printing initial sets
        System.out.println("TreeSet1: " + treeSet); // Output: [Apple, Banana, Cherry]
        System.out.println("TreeSet2: " + treeSet2); // Output: [Apple, Banana, Cherry]
        System.out.println("TreeSet3: " + treeSet3); // Output: [Cherry, Banana, Apple]
        System.out.println("TreeSet4: " + treeSet4); // Output: [Apple, Banana, Cherry]


        // size()
        // Returns the number of elements in the set
        System.out.println("Size: " + treeSet.size()); // Output: 5

        // isEmpty()
        // Checks if the set is empty
        System.out.println("Is Empty: " + treeSet.isEmpty()); // Output: false

        // contains(Object o)
        // Checks if the set contains the specified element
        System.out.println("Contains 'Banana': " + treeSet.contains("Banana")); 
        // Output: true

        // ceiling(E e)
        // Returns the least element greater than or equal to the given element, or null if no such element
        System.out.println("Ceiling of 'Blueberry': " + treeSet.ceiling("Blueberry"));
         // Output: Cherry

        // descendingIterator()
        // Returns an iterator over the elements in this set, in descending order
        System.out.print("Descending Iterator: ");
        Iterator<String> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " "); // Output: Elderberry Date Cherry Banana Apple 
        }
        System.out.println();

        // descendingSet()
        // Returns a reverse order view of the elements contained in this set
        NavigableSet<String> descSet = treeSet.descendingSet();
        System.out.println("Descending Set: " + descSet); // Output: [Elderberry, Date, Cherry, Banana, Apple]

        // floor(E e)
        // Returns the greatest element less than or equal to the given element, or null if no such element
        System.out.println("Floor of 'Blueberry': " + treeSet.floor("Blueberry")); // Output: Banana

        // headSet(E toElement)
        // Returns a view of the portion of this set whose elements are strictly less than toElement
        SortedSet<String> headSet = treeSet.headSet("Cherry");
        System.out.println("HeadSet (Cherry): " + headSet); // Output: [Apple, Banana]

        // headSet(E toElement, boolean inclusive)
        // Returns a view of the portion of this set whose elements are less than or equal to toElement
        NavigableSet<String> headSetInclusive = treeSet.headSet("Cherry", true);
        System.out.println("HeadSet (Cherry, true): " + headSetInclusive); // Output: [Apple, Banana, Cherry]

        // higher(E e)
        // Returns the least element strictly greater than the given element, or null if no such element
        System.out.println("Higher than 'Banana': " + treeSet.higher("Banana")); // Output: Cherry

        // iterator()
        // Returns an iterator over the elements in this set, in ascending order
        System.out.print("Iterator: ");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Output: Apple Banana Cherry Date Elderberry
        }
        System.out.println();

        // lower(E e)
        // Returns the greatest element strictly less than the given element, or null if no such element
        System.out.println("Lower than 'Banana': " + treeSet.lower("Banana")); // Output: Apple

        // pollFirst()
        // Retrieves and removes the first (lowest) element, or returns null if this set is empty
        System.out.println("Poll First: " + treeSet.pollFirst()); // Output: Apple

        // pollLast()
        // Retrieves and removes the last (highest) element, or returns null if this set is empty
        System.out.println("Poll Last: " + treeSet.pollLast()); // Output: Elderberry

        // subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        // Returns a view of the portion of this set whose elements range from fromElement to toElement
        NavigableSet<String> subSet = treeSet.subSet("Banana", true, "Date", true);
        System.out.println("SubSet (Banana, true, Date, true): " + subSet); // Output: [Banana, Cherry, Date]

        // subSet(E fromElement, E toElement)
        // Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
        SortedSet<String> subSetExclusive = treeSet.subSet("Banana", "Date");
        System.out.println("SubSet (Banana, Date): " + subSetExclusive); // Output: [Banana, Cherry]

        // tailSet(E fromElement)
        // Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        SortedSet<String> tailSet = treeSet.tailSet("Cherry");
        System.out.println("TailSet (Cherry): " + tailSet); // Output: [Cherry, Date]

        // tailSet(E fromElement, boolean inclusive)
        // Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement
        NavigableSet<String> tailSetInclusive = treeSet.tailSet("Cherry", false);
        System.out.println("TailSet (Cherry, false): " + tailSetInclusive); // Output: [Date]
    }
}
