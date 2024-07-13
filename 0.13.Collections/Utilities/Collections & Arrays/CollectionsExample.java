import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Example lists
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        List<String> strList = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));

        // 1. Sorting List 
        Collections.sort(list);
        System.out.println("Sorted list: " + list); 
        // [1, 1, 3, 4, 5, 9]

        // 2. Sorting List with Comparator
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println("Sorted strList with comparator: " + strList); // [cherry, banana, apple]

        // 3. BinarySearch with Comparable
        int index = Collections.binarySearch(list, 4);
        System.out.println("Index of 4 in list: " + index); // 3

        // 4. BinarySearch with Comparator
        index = Collections.binarySearch(strList, "banana", Comparator.reverseOrder());
        System.out.println("Index of 'banana' in strList: " + index); // 1

        // 5. Reverse
        Collections.reverse(list);
        System.out.println("Reversed list: " + list); // [9, 5, 4, 3, 1, 1]

        // 6. Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list); // [3, 1, 9, 4, 5, 1]

        // 7. Shuffle with Random
        Collections.shuffle(strList, new Random());
        System.out.println("Shuffled strList with Random: " + strList); // [apple, banana, cherry]

        // 8. Swap
        Collections.swap(list, 0, 1);
        System.out.println("Swapped list: " + list); // [1, 3, 9, 4, 5, 1]

        // 9. Fill
        Collections.fill(list, 7);
        System.out.println("Filled list: " + list); // [7, 7, 7, 7, 7, 7]

        // 10. Copy
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
        Collections.copy(dest, list);
        System.out.println("Copied list: " + dest); // [7, 7, 7, 7, 7, 7]

        // 11. Min with Comparable
        int min = Collections.min(list);
        System.out.println("Min of list: " + min); // 7

        // 12. Min with Comparator
        String minStr = Collections.min(strList, Comparator.naturalOrder());
        System.out.println("Min of strList: " + minStr); // apple

        // 13. Max with Comparable
        int max = Collections.max(list);
        System.out.println("Max of list: " + max); // 7

        // 14. Max with Comparator
        String maxStr = Collections.max(strList, Comparator.naturalOrder());
        System.out.println("Max of strList: " + maxStr); // cherry

        // 15. Rotate
        Collections.rotate(list, 2);
        System.out.println("Rotated list: " + list); // [7, 7, 7, 7, 7, 7]

        // 16. ReplaceAll
        boolean replaced = Collections.replaceAll(list, 7, 8);
        System.out.println("Replaced list: " + list + ", replaced: " + replaced); // [8, 8, 8, 8, 8, 8], replaced: true

        // 17. IndexOfSubList
        List<Integer> subList = Arrays.asList(8, 8);
        int subIndex = Collections.indexOfSubList(list, subList);
        System.out.println("Index of subList in list: " + subIndex); // 0

        // 18. LastIndexOfSubList
        subIndex = Collections.lastIndexOfSubList(list, subList);
        System.out.println("Last index of subList in list: " + subIndex); // 4

        // 19. UnmodifiableCollection
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection(list);
        System.out.println("Unmodifiable list: " + unmodifiableList);

        // 20. UnmodifiableSet
        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three"));
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("Unmodifiable set: " + unmodifiableSet);

        // 21. UnmodifiableSortedSet
        SortedSet<String> sortedSet = new TreeSet<>(set);
        SortedSet<String> unmodifiableSortedSet = Collections.unmodifiableSortedSet(sortedSet);
        System.out.println("Unmodifiable sorted set: " + unmodifiableSortedSet);

        // 22. UnmodifiableNavigableSet
        NavigableSet<String> navigableSet = new TreeSet<>(set);
        NavigableSet<String> unmodifiableNavigableSet = Collections.unmodifiableNavigableSet(navigableSet);
        System.out.println("Unmodifiable navigable set: " + unmodifiableNavigableSet);

        // 23. UnmodifiableList
        List<String> unmodifiableStrList = Collections.unmodifiableList(strList);
        System.out.println("Unmodifiable strList: " + unmodifiableStrList);

        // 24. UnmodifiableMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("Unmodifiable map: " + unmodifiableMap);

        // 25. UnmodifiableSortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>(map);
        SortedMap<String, Integer> unmodifiableSortedMap = Collections.unmodifiableSortedMap(sortedMap);
        System.out.println("Unmodifiable sorted map: " + unmodifiableSortedMap);

        // 26. UnmodifiableNavigableMap
        NavigableMap<String, Integer> navigableMap = new TreeMap<>(map);
        NavigableMap<String, Integer> unmodifiableNavigableMap = Collections.unmodifiableNavigableMap(navigableMap);
        System.out.println("Unmodifiable navigable map: " + unmodifiableNavigableMap);

        // 27. SynchronizedCollection
        Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);
        System.out.println("Synchronized list: " + synchronizedList);

        // 28. SynchronizedSet
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        System.out.println("Synchronized set: " + synchronizedSet);

        // 29. SynchronizedSortedSet
        SortedSet<String> synchronizedSortedSet = Collections.synchronizedSortedSet(sortedSet);
        System.out.println("Synchronized sorted set: " + synchronizedSortedSet);

        // 30. SynchronizedNavigableSet
        NavigableSet<String> synchronizedNavigableSet = Collections.synchronizedNavigableSet(navigableSet);
        System.out.println("Synchronized navigable set: " + synchronizedNavigableSet);

        // 31. SynchronizedList
        List<String> synchronizedStrList = Collections.synchronizedList(strList);
        System.out.println("Synchronized strList: " + synchronizedStrList);

        // 32. SynchronizedMap
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
        System.out.println("Synchronized map: " + synchronizedMap);

        // 33. SynchronizedSortedMap
        SortedMap<String, Integer> synchronizedSortedMap = Collections.synchronizedSortedMap(sortedMap);
        System.out.println("Synchronized sorted map: " + synchronizedSortedMap);

        // 34. SynchronizedNavigableMap
        NavigableMap<String, Integer> synchronizedNavigableMap = Collections.synchronizedNavigableMap(navigableMap);
        System.out.println("Synchronized navigable map: " + synchronizedNavigableMap);

        // 35. CheckedCollection
        Collection<String> checkedCollection = Collections.checkedCollection(new ArrayList<>(), String.class);
        System.out.println("Checked collection: " + checkedCollection);

        // 36. CheckedQueue
        Queue<String> checkedQueue = Collections.checkedQueue(new LinkedList<>(), String.class);
        System.out.println("Checked queue: " + checkedQueue);

        // 37. CheckedSet
        Set<String> checkedSet = Collections.checkedSet(new HashSet<>(), String.class);
        System.out.println("Checked set: " + checkedSet);

        // 38. CheckedSortedSet
        SortedSet<String> checkedSortedSet = Collections.checkedSortedSet(new TreeSet<>(), String.class);
        System.out.println("Checked sorted set: " + checkedSortedSet);

        // 39. CheckedNavigableSet
        NavigableSet<String> checkedNavigableSet = Collections.checkedNavigableSet(new TreeSet<>(), String.class);
        System.out.println("Checked navigable set: " + checkedNavigableSet);

        // 40. CheckedList
        List<String> checkedList = Collections.checkedList(new ArrayList<>(), String.class);
        System.out.println("Checked list: " + checkedList);

        // 41. CheckedMap
        Map<String, Integer> checkedMap = Collections.checkedMap(new HashMap<>(), String.class, Integer.class);
        System.out.println("Checked map: " + checkedMap);

        // 42. CheckedSortedMap
        SortedMap<String, Integer> checkedSortedMap = Collections.checkedSortedMap(new TreeMap<>(), String.class, Integer.class);
        System.out.println("Checked sorted map: " + checkedSortedMap);

        // 43. CheckedNavigableMap
        NavigableMap<String, Integer> checkedNavigableMap = Collections.checkedNavigableMap(new TreeMap<>(), String.class, Integer.class);
        System.out.println("Checked navigable map: " + checkedNavigableMap);

        // 44. EmptyIterator
        Iterator<Object> emptyIterator = Collections.emptyIterator();
        System.out.println("Empty iterator has next: " + emptyIterator.hasNext()); // false

        // 45. EmptyListIterator
        ListIterator<Object> emptyListIterator = Collections.emptyListIterator();
        System.out.println("Empty list iterator has next: " + emptyListIterator.hasNext()); // false

        // 46. EmptyEnumeration
        Enumeration<Object> emptyEnumeration = Collections.emptyEnumeration();
        System.out.println("Empty enumeration has more elements: " + emptyEnumeration.hasMoreElements()); // false

        // 47. EmptySet
        Set<Object> emptySet = Collections.emptySet();
        System.out.println("Empty set size: " + emptySet.size()); // 0

        // 48. EmptySortedSet
        SortedSet<Object> emptySortedSet = Collections.emptySortedSet();
        System.out.println("Empty sorted set size: " + emptySortedSet.size()); // 0

        // 49. EmptyNavigableSet
        NavigableSet<Object> emptyNavigableSet = Collections.emptyNavigableSet();
        System.out.println("Empty navigable set size: " + emptyNavigableSet.size()); // 0

        // 50. EmptyList
        List<Object> emptyList = Collections.emptyList();
        System.out.println("Empty list size: " + emptyList.size()); // 0

        // 51. EmptyMap
        Map<Object, Object> emptyMap = Collections.emptyMap();
        System.out.println("Empty map size: " + emptyMap.size()); // 0

        // 52. EmptySortedMap
        SortedMap<Object, Object> emptySortedMap = Collections.emptySortedMap();
        System.out.println("Empty sorted map size: " + emptySortedMap.size()); // 0

        // 53. EmptyNavigableMap
        NavigableMap<Object, Object> emptyNavigableMap = Collections.emptyNavigableMap();
        System.out.println("Empty navigable map size: " + emptyNavigableMap.size()); // 0

        // 54. Singleton
        Set<String> singleton = Collections.singleton("singleton");
        System.out.println("Singleton set: " + singleton); // [singleton]

        // 55. SingletonIterator
        // Iterator<String> singletonIterator = Collections.singletonIterator("singleton");
        // System.out.println("Singleton iterator next: " + singletonIterator.next()); // singleton

        // 56. SingletonSpliterator
        // Spliterator<String> singletonSpliterator = Collections.singletonSpliterator("singleton");
        // singletonSpliterator.forEachRemaining(System.out::println); // singleton

        // 57. SingletonList
        List<String> singletonList = Collections.singletonList("singleton");
        System.out.println("Singleton list: " + singletonList); // [singleton]

        // 58. SingletonMap
        Map<String, Integer> singletonMap = Collections.singletonMap("key", 1);
        System.out.println("Singleton map: " + singletonMap); // {key=1}

        // 59. NCopies
        List<String> nCopiesList = Collections.nCopies(5, "copy");
        System.out.println("NCopies list: " + nCopiesList); // [copy, copy, copy, copy, copy]

        // 60. ReverseOrder
        Comparator<Integer> reverseOrderComparator = Collections.reverseOrder();
        List<Integer> reverseOrderList = new ArrayList<>(list);
        reverseOrderList.sort(reverseOrderComparator);
        System.out.println("Reverse order list: " + reverseOrderList); // [8, 8, 8, 8, 8, 8]

        // 61. ReverseOrder with Comparator
        // Comparator<String> reverseOrderStrComparator = Collections.reverseOrder(Comparator.naturalOrder());
        // List<String> reverseOrderStrList = new ArrayList<>(strList);
        // reverseOrderStrList.sort(reverseOrderStrComparator);
        // System.out.println("Reverse order strList with comparator: " + reverseOrderStrList); // [cherry, banana, apple]

        // 62. Enumeration
        Enumeration<String> enumeration = Collections.enumeration(strList);
        List<String> enumList = new ArrayList<>();
        while (enumeration.hasMoreElements()) {
            enumList.add(enumeration.nextElement());
        }
        System.out.println("Enumeration list: " + enumList); // Original strList order

        // 63. List from Enumeration
        List<String> listFromEnum = Collections.list(enumeration);
        System.out.println("List from enumeration: " + listFromEnum); // []

        // 64. Frequency
        int frequency = Collections.frequency(list, 8);
        System.out.println("Frequency of 8 in list: " + frequency); // 6

        // 65. Disjoint
        boolean isDisjoint = Collections.disjoint(list, strList);
        System.out.println("Is list disjoint with strList: " + isDisjoint); // true

        // 66. AddAll
        List<Integer> addAllList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.addAll(addAllList, 4, 5, 6);
        System.out.println("AddAll list: " + addAllList); // [1, 2, 3, 4, 5, 6]

        // 67. NewSetFromMap
        Map<String, Boolean> mapForSet = new HashMap<>();
        Set<String> newSet = Collections.newSetFromMap(mapForSet);
        newSet.add("one");
        newSet.add("two");
        System.out.println("New set from map: " + newSet); // [one, two]

        // 68. AsLifoQueue
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Queue<Integer> lifoQueue = Collections.asLifoQueue(deque);
        lifoQueue.add(4);
        System.out.println("As LIFO queue: " + lifoQueue); // [4, 3, 2, 1]
    }
}
