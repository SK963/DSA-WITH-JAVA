import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Constructors
		
        // 1. Default constructor
        PriorityQueue<Integer> defaultQueue = new PriorityQueue<>();
        defaultQueue.add(30);
        defaultQueue.add(20);
        defaultQueue.add(10);
        System.out.println("defaultQueue: " + defaultQueue); 
        // Output: [10, 30, 20]

        // 2. Constructor with initial capacity
        PriorityQueue<Integer> capacityQueue = new PriorityQueue<>(5);
        capacityQueue.add(40);
        capacityQueue.add(15);
        System.out.println("capacityQueue: " + capacityQueue); 
        // Output: [15, 40]

        // 3. Constructor with comparator
        Comparator<Integer> comparator = Collections.reverseOrder();
        PriorityQueue<Integer> comparatorQueue = new PriorityQueue<>(comparator);
        comparatorQueue.add(5);
        comparatorQueue.add(25);
        System.out.println("comparatorQueue: " + comparatorQueue); 
        // Output: [25, 5]

        // 4. Constructor with initial capacity and comparator
        PriorityQueue<Integer> customQueue = new PriorityQueue<>(5, comparator);
        customQueue.add(35);
        customQueue.add(45);
        System.out.println("customQueue: " + customQueue); 
        // Output: [45, 35]

        // 5. Constructor with a collection
        List<Integer> list = Arrays.asList(55, 65, 75);
        PriorityQueue<Integer> collectionQueue = new PriorityQueue<>(list);
        System.out.println("collectionQueue: " + collectionQueue); 
        // Output: [55, 65, 75]

        // 6. Constructor with another priority queue
        PriorityQueue<Integer> copyQueue = new PriorityQueue<>(defaultQueue);
        System.out.println("copyQueue: " + copyQueue); 
        // Output: [10, 30, 20]

        // 7. Constructor with a sorted set
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(85, 95, 105));
        PriorityQueue<Integer> sortedSetQueue = new PriorityQueue<>(sortedSet);
        System.out.println("sortedSetQueue: " + sortedSetQueue); 
        // Output: [85, 95, 105]

        // Methods
        // Insertion
        collectionQueue.add(35);
        System.out.println("add 35: " + collectionQueue); 
        // Output: [35, 55, 75, 65]
        collectionQueue.offer(25);
        System.out.println("offer 25: " + collectionQueue); 
        // Output: [25, 35, 75, 65, 55]


        

        // Search
        System.out.println("Contains 55: " + collectionQueue.contains(55)); 
        // Output: true

        // retrival without deletion
        System.out.println("Peek: " + collectionQueue.peek()); 
        // Output: 25
        System.out.println("Element: " + collectionQueue.element()); 
        // Output: 25

        // retrieval with deletion
        //poll
        int polled_element = collectionQueue.poll();
        System.out.println("Poll: " + polled_element); 
        // Output: 25
        System.out.println("Remaining element: " + collectionQueue); 
        // Output: [35, 55, 75, 65]

        //remove
        System.out.println("Remove: " + collectionQueue.remove()); 
        // Output: 35
        System.out.println("Remaining pq: " + collectionQueue); // Output: [55, 65, 75]

        //remove(object)
        collectionQueue.remove(65);
        System.out.println("Remove 65: " + collectionQueue); // Output: [55, 75]

        //removeIf
        collectionQueue.removeIf(n -> n > 70);
        System.out.println("RemoveIf: " + collectionQueue); 
        // Output: [55]

        System.out.println("collectionQueue : " + collectionQueue);
        //output : collectionQueue : [55]
        List<Integer> removeList = Arrays.asList(55, 35);
        collectionQueue.removeAll(removeList);
        System.out.println("RemoveAll: " + collectionQueue); 
        // Output: []

        collectionQueue.add(25);
        collectionQueue.add(35);
        collectionQueue.add(75);
        System.out.println("collectionQueue : " + collectionQueue);
        collectionQueue.retainAll(Arrays.asList(25, 75));
        System.out.println("RetainAll: " + collectionQueue); 
        // Output: [25, 75]

        collectionQueue.clear();
        System.out.println("Clear: " + collectionQueue); 
        // Output: []

        // Size
        collectionQueue.add(1);
        collectionQueue.add(2);
        collectionQueue.add(3);
        System.out.println("Size: " + collectionQueue.size()); 
        // Output: 3

        // Conversion
        Object[] array = collectionQueue.toArray();
        Integer[] intArray = collectionQueue.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array)); 
        // Output: [1, 2, 3]
        System.out.println("Integer Array: " + Arrays.toString(intArray)); 
        // Output: [1, 2, 3]

        // Traversing
        System.out.println("Default Queue Traversal:");
        Iterator<Integer> iterator = defaultQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); 
        // Output: 10 30 20 

        // Spliterator
        System.out.println("Spliterator Traversal:");
        Spliterator<Integer> spliterator = defaultQueue.spliterator();
        spliterator.forEachRemaining(System.out::println); 
        // Output: 10 30 20 

        // forEach
        System.out.println("forEach Traversal:");
        defaultQueue.forEach(System.out::println); 
        // Output: 10 30 20 

        // Comparator
        Comparator<? super Integer> queueComparator = comparatorQueue.comparator();
        System.out.println("the comparator used in comparatorQueue : " + queueComparator);

        //traversal;
        System.out.println("Comparator Queue Traversal:");
        while (!comparatorQueue.isEmpty()) {
            System.out.print(comparatorQueue.poll() + " ");
        }
        System.out.println(); // Output: 25 5 
    }
}
