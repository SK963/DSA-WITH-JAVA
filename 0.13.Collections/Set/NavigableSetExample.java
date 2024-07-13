import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        // Create a NavigableSet using TreeSet
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Add elements to the NavigableSet
        navigableSet.add(1);
        navigableSet.add(3);
        navigableSet.add(2);
        navigableSet.add(5);
        navigableSet.add(4);
        System.out.println("NavigableSet: " + navigableSet); // Output: [1, 2, 3, 4, 5]

        // lower(E e)
        System.out.println("Element lower than 3: " + navigableSet.lower(3)); // Output: 2

        // floor(E e)
        System.out.println("Element floor of 3: " + navigableSet.floor(3)); // Output: 3

        // ceiling(E e)
        System.out.println("Element ceiling of 3: " + navigableSet.ceiling(3)); // Output: 3

        // higher(E e)
        System.out.println("Element higher than 3: " + navigableSet.higher(3)); // Output: 4

        // pollFirst()
        System.out.println("Poll first element: " + navigableSet.pollFirst()); // Output: 1
        System.out.println("NavigableSet after pollFirst: " + navigableSet); // Output: [2, 3, 4, 5]

        // pollLast()
        System.out.println("Poll last element: " + navigableSet.pollLast()); // Output: 5
        System.out.println("NavigableSet after pollLast: " + navigableSet); // Output: [2, 3, 4]

        // descendingSet()
        NavigableSet<Integer> descendingSet = navigableSet.descendingSet();
        System.out.println("Descending set: " + descendingSet); // Output: [4, 3, 2]

        // descendingIterator()
        System.out.print("Descending iterator: ");
        navigableSet.descendingIterator().forEachRemaining(e -> System.out.print(e + " ")); // Output: 4 3 2 
        System.out.println();

        // subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        NavigableSet<Integer> subSetInclusive = navigableSet.subSet(2, true, 4, true);
        System.out.println("Subset from 2 to 4 inclusive: " + subSetInclusive); // Output: [2, 3, 4]

        // headSet(E toElement, boolean inclusive)
        NavigableSet<Integer> headSetInclusive = navigableSet.headSet(3, true);
        System.out.println("HeadSet up to 3 inclusive: " + headSetInclusive); // Output: [2, 3]

        // tailSet(E fromElement, boolean inclusive)
        NavigableSet<Integer> tailSetInclusive = navigableSet.tailSet(3, true);
        System.out.println("TailSet from 3 inclusive: " + tailSetInclusive); // Output: [3, 4]

        // subSet(E fromElement, E toElement)
        NavigableSet<Integer> subSetExclusive = (NavigableSet<Integer>) navigableSet.subSet(2, 4);
        System.out.println("Subset from 2 to 4 exclusive: " + subSetExclusive); // Output: [2, 3]

        // headSet(E toElement)
        NavigableSet<Integer> headSetExclusive = (NavigableSet<Integer>) navigableSet.headSet(4);
        System.out.println("HeadSet up to 4 exclusive: " + headSetExclusive); // Output: [2, 3]

        // tailSet(E fromElement)
        NavigableSet<Integer> tailSetExclusive = (NavigableSet<Integer>) navigableSet.tailSet(2);
        System.out.println("TailSet from 2 exclusive: " + tailSetExclusive); // Output: [2, 3, 4]
    }
}
