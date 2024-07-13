import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListExample {

    public static void main(String[] args) 
    {
        // Constructor: LinkedList()
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("LinkedList: " + list); // Output: [A, B, C]

        // Constructor: LinkedList(Collection<? extends E> c)
        List<String> anotherList = List.of("X", "Y", "Z");
        LinkedList<String> list2 = new LinkedList<>(anotherList);
        System.out.println("LinkedList from another collection: " + list2); // Output: [X, Y, Z]

        // Insertion
        list.add("D");
        System.out.println("After add(E): " + list); 
        // Output: [A, B, C, D]

        list.addAll(List.of("E", "F"));
        System.out.println("After addAll(Collection<? extends E>): " + list); 
        // Output: [A, B, C, D, E, F]

        list.addAll(2, List.of("G", "H"));
        System.out.println("After addAll(int, Collection<? extends E>): " + list); 
        // Output: [A, B, G, H, C, D, E, F]

        list.addFirst("I");
        System.out.println("After addFirst(E): " + list); 
        // Output: [I, A, B, G, H, C, D, E, F]

        list.addLast("J");
        System.out.println("After addLast(E): " + list); 
        // Output: [I, A, B, G, H, C, D, E, F, J]

        list.push("K");
        System.out.println("After push(E): " + list); 
        // Output: [K, I, A, B, G, H, C, D, E, F, J]

        // Get first and last element
        System.out.println("First element: " + list.getFirst()); 
        // Output: K
        System.out.println("Last element: " + list.getLast()); 
        // Output: J

        // Remove first and last element
        list.removeFirst();
        System.out.println("After removeFirst(): " + list); 
        // Output: [I, A, B, G, H, C, D, E, F, J]

        list.removeLast();
        System.out.println("After removeLast(): " + list); 
        // Output: [I, A, B, G, H, C, D, E, F]

        // Remove by object
        list.remove("G");
        System.out.println("After remove(Object): " + list); 
        // Output: [I, A, B, H, C, D, E, F]

        // Clear the list
        list.clear();
        System.out.println("After clear(): " + list); // Output: []

        // Contains, size
        System.out.println("Contains 'A': " + list.contains("A")); // Output: true
        System.out.println("Size: " + list.size()); // Output: 9

        

        // Get and set element by index
        list.addAll(List.of("A", "B", "C", "D"));
        System.out.println("Element at index 2: " + list.get(2)); // Output: C

        list.set(2, "Z");
        System.out.println("After set(int, E): " + list); // Output: [A, B, Z, D]

        // Add and remove by index
        list.add(2, "Y");
        System.out.println("After add(int, E): " + list); // Output: [A, B, Y, Z, D]

        list.remove(2);
        System.out.println("After remove(int): " + list); // Output: [A, B, Z, D]

        // Index of element
        System.out.println("Index of 'Z': " + list.indexOf("Z")); // Output: 2
        System.out.println("Last index of 'Z': " + list.lastIndexOf("Z")); // Output: 2

        // Peek, element, poll, remove
        System.out.println("Peek: " + list.peek()); // Output: A
        System.out.println("Element: " + list.element()); // Output: A
        System.out.println("Poll: " + list.poll()); // Output: A
        System.out.println("After poll(): " + list); // Output: [B, Z, D]
        System.out.println("Remove: " + list.remove()); // Output: B
        System.out.println("After remove(): " + list); // Output: [Z, D]

        // Offer methods
        list.offer("E");
        System.out.println("After offer(E): " + list); // Output: [Z, D, E]

        list.offerFirst("F");
        System.out.println("After offerFirst(E): " + list); // Output: [F, Z, D, E]

        list.offerLast("G");
        System.out.println("After offerLast(E): " + list); // Output: [F, Z, D, E, G]

        // Peek methods
        System.out.println("Peek first: " + list.peekFirst()); // Output: F
        System.out.println("Peek last: " + list.peekLast()); // Output: G

        // Poll methods
        System.out.println("Poll first: " + list.pollFirst()); // Output: F
        System.out.println("After pollFirst(): " + list); // Output: [Z, D, E, G]

        System.out.println("Poll last: " + list.pollLast()); // Output: G
        System.out.println("After pollLast(): " + list); // Output: [Z, D, E]

        // Pop method
        System.out.println("Pop: " + list.pop()); // Output: Z
        System.out.println("After pop(): " + list); // Output: [D, E]

        // Remove first and last occurrence
        list.add("D");
        list.add("E");
        list.add("D");
        System.out.println("List before removing occurrences: " + list); // Output: [D, E, D, E, D]

        list.removeFirstOccurrence("D");
        System.out.println("After removeFirstOccurrence(Object): " + list); // Output: [E, D, E, D]

        list.removeLastOccurrence("D");
        System.out.println("After removeLastOccurrence(Object): " + list); // Output: [E, D, E]

        // List iterator
        ListIterator<String> iterator = list.listIterator();
        System.out.print("ListIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Output: E D E 
        }
        System.out.println();

        // Descending iterator
        System.out.print("DescendingIterator: ");
        iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " "); // Output: E D E 
        }
        System.out.println();

        // Spliterator
        Spliterator<String> spliterator = list.spliterator();
        System.out.print("Spliterator: ");
        spliterator.forEachRemaining(System.out::print); // Output: E D E 
        System.out.println();

        // Clone
        @SuppressWarnings("unchecked")
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList); // Output: [E, D, E]

        // toArray
        Object[] array = list.toArray();
        System.out.print("Array: ");
        for (Object o : array) {
            System.out.print(o + " "); // Output: E D E 
        }
        System.out.println();

        // toArray with type
        String[] stringArray = list.toArray(new String[0]);
        System.out.print("Typed Array: ");
        for (String s : stringArray) {
            System.out.print(s + " "); // Output: E D E 
        }
        System.out.println();
    }
}
