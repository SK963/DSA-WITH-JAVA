import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

		// CONSTRUCTORS 
		
		// Using the default constructor
        ArrayDeque<Integer> defaultDeque = new ArrayDeque<>();
        defaultDeque.add(10);
        defaultDeque.add(20);
        System.out.println("Default Constructor Deque: " + defaultDeque);

        // Using the constructor with initial capacity
        ArrayDeque<Integer> capacityDeque = new ArrayDeque<>(5);
        capacityDeque.add(30);
        capacityDeque.add(40);
        System.out.println("Initial Capacity Constructor Deque: " + capacityDeque);

        // Using the constructor with a collection
        Collection<Integer> collection = Arrays.asList(50, 60, 70);
        ArrayDeque<Integer> collectionDeque = new ArrayDeque<>(collection);
        System.out.println("Collection Constructor Deque: " + collectionDeque);

		// METHODS
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst(10); //[10]
        deque.addLast(20); //[10,20]
        deque.add(30);  //[10,20,30]
        deque.offerFirst(5); //[5,10,20,30]
        deque.offerLast(35); //[5,10,20,30,35]
        deque.offer(40);  //[5,10,20,30,35,40]
		System.out.println(deque);

        // Adding a collection of elements
        List<Integer> list = Arrays.asList(50, 60, 70);
        deque.addAll(list); // [5,10,20,30,35,40,50, 60, 70]
		System.out.println(deque);

        // Removing elements
        System.out.println("Remove First: " + deque.removeFirst());
		System.out.println(deque);
        System.out.println("Remove Last: " + deque.removeLast());
		System.out.println(deque);
        System.out.println("Poll First: " + deque.pollFirst());
		System.out.println(deque);
        System.out.println("Poll Last: " + deque.pollLast());
		System.out.println(deque);
        System.out.println("Remove: " + deque.remove()); 
		System.out.println(deque);
        System.out.println("Poll: " + deque.poll()); 
		System.out.println(deque);

        // Accessing elements
        System.out.println("Get First: " + deque.getFirst());
        System.out.println("Get Last: " + deque.getLast());
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
        System.out.println("Element: " + deque.element()); // equivalent to getFirst
        System.out.println("Peek: " + deque.peek()); // equivalent to peekFirst

        // Push and pop (treating deque as stack)
        deque.push(100);
		System.out.println(deque);
        System.out.println("Pop: " + deque.pop());

        // Check size and emptiness
        System.out.println("Size: " + deque.size());
        System.out.println("Is Empty: " + deque.isEmpty());

        // Iterators
        System.out.println("Iterator:");
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\nDescending Iterator:");
        Iterator<Integer> dit = deque.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

        // Spliterator
        System.out.println("\nSpliterator:");
        deque.spliterator().forEachRemaining(System.out::println);

        // forEach method
        System.out.println("forEach method:");
        deque.forEach(System.out::println);

        // Remove first/last occurrence
        deque.add(40);
        deque.add(50);
		System.out.println("after adding 40 and 50 deque :" + deque);
        System.out.println("Remove First Occurrence of 40: " + deque.removeFirstOccurrence(40));
		System.out.println(deque);
        System.out.println("Remove Last Occurrence of 50: " + deque.removeLastOccurrence(50));
		System.out.println(deque);

        // Remove if
		System.out.println("removeIf condition ");
        deque.removeIf(e -> e > 45);
		System.out.println(deque);

        // Check contents
        System.out.println("Contains 20: " + deque.contains(20));
        System.out.println("Remove 20: " + deque.remove(20));

        // Convert to array
        Object[] array = deque.toArray();
        Integer[] intArray = deque.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Integer Array: " + Arrays.toString(intArray));

        // Clone the deque
        ArrayDeque<Integer> clonedDeque = deque.clone();
        System.out.println("Cloned Deque: " + clonedDeque);

        // Adding elements back for removeAll and retainAll
        deque.addAll(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("deque after adding elements :" + deque);
        ArrayDeque<Integer> anotherDeque = new ArrayDeque<>(Arrays.asList(30, 40, 50, 60, 70));
        
        // removeAll
        deque.removeAll(anotherDeque);
        System.out.println("After removeAll: " + deque);

        // Adding elements back
        deque.addAll(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("deque after adding elements :" + deque);

        // retainAll
        deque.retainAll(anotherDeque);
        System.out.println("After retainAll: " + deque);

		// Clear the deque
        deque.clear();
        System.out.println("After clear, is empty: " + deque.isEmpty());
		System.out.println(deque);
    }
}
