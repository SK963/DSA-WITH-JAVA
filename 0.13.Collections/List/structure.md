# LIST

REFERENCE

[List (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)

# Hierarchy

![Collection-Framework-1.png](LIST%20e90574522f8f40e6917b75439a6ad43a/Collection-Framework-1.png)

### Class Hierarcy :

java.lang.[**Object](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Object.html)** 

- java.util.[**AbstractCollection**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/AbstractCollection.html)<E> (implements java.util.[Collection](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Collection.html)<E>)
    1. java.util.[**AbstractList**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/AbstractList.html)<E> (implements java.util.[List](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/List.html)<E>)
        - java.util.[**AbstractSequentialList**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/AbstractSequentialList.html)<E>
            - java.util.[**LinkedList**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/LinkedList.html)<E> (implements java.lang.[Cloneable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Cloneable.html), java.util.[Deque](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Deque.html)<E>, java.util.[List](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/List.html)<E>, java.io.[Serializable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/io/Serializable.html))
        - java.util.[**ArrayList**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/ArrayList.html)<E> (implements java.lang.[Cloneable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Cloneable.html), java.util.[List](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/List.html)<E>, java.util.[RandomAccess](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/RandomAccess.html), java.io.[Serializable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/io/Serializable.html))
        - java.util.[**Vector**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Vector.html)<E> (implements java.lang.[Cloneable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Cloneable.html), java.util.[List](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/List.html)<E>, java.util.[RandomAccess](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/RandomAccess.html), java.io.[Serializable](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/io/Serializable.html))
            - java.util.[**Stack**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Stack.html)<E>

### Interface Hierarchy

- java.lang.[**Iterable**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Iterable.html)<T>
    - java.util.[**Collection**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Collection.html)<E>
        - java.util.[**List**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/List.html)<E>

# List : (Interface)

### About :

- some common features of List Interface :
- Duplicated allowed :
- Insertion order must be preserved :
- implemented  classes : ArrayList , Vector , Stack(uses vector ) are the implemented class :

### Signature : List (Interface)

```java
 javap java.util.List
Compiled from "List.java"
public interface java.util.List<E> 
extends java.util.Collection<E> 
{

	//Collection method 
	//size and empty
  public abstract int size();
  public abstract boolean isEmpty();
  
  //insertion
  public abstract boolean add(E);
  public abstract void add(int, E);
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract boolean addAll(int, java.util.Collection<? extends E>);
  
  //deletion
  public abstract E remove(int);
  public abstract boolean remove(java.lang.Object); 
  public abstract boolean removeAll(java.util.Collection<?>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public abstract void clear();
  
  //extract
  public abstract E get(int);
  //modify
  public abstract E set(int, E);
  //replace 
  public default void replaceAll(java.util.function.UnaryOperator<E>);
  
  
  //search, check & Comparision
  public abstract int indexOf(java.lang.Object);
  public abstract int lastIndexOf(java.lang.Object);
  public abstract boolean contains(java.lang.Object);
  public abstract boolean containsAll(java.util.Collection<?>);
  public abstract boolean equals(java.lang.Object);
  
	
  //sorting 
  public default void sort(java.util.Comparator<? super E>);
 
	 
  
  public abstract int hashCode();
  
  //traversing
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.ListIterator<E> listIterator();
  public abstract java.util.ListIterator<E> listIterator(int);
  public default java.util.Spliterator<E> spliterator();
  
  //conversion
  public abstract java.lang.Object[] toArray();
  public abstract <T> T[] toArray(T[]);
 
  
  //sublist
  public abstract java.util.List<E> subList(int, int);
  
	//creating immutable lists and immutable copy of List type
  public static <E> java.util.List<E> of();
  public static <E> java.util.List<E> of(E);
  public static <E> java.util.List<E> of(E, E);
  public static <E> java.util.List<E> of(E...);
  public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>);

  
}
```

### Signature : AbstractCollection (abstract class)

```java
javap java.util.AbstractCollection
Compiled from "AbstractCollection.java"
public abstract class java.util.AbstractCollection<E> implements java.util.Collection<E> {
  protected java.util.AbstractCollection();
  public abstract java.util.Iterator<E> iterator();
  public abstract int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public boolean containsAll(java.util.Collection<?>);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public void clear();
  public java.lang.String toString();
}
```

### Signature : AbstractList (abstract class)

```java
javap  java.util.AbstractList
Compiled from "AbstractList.java"
public abstract class java.util.AbstractList<E> 
extends java.util.AbstractCollection<E>
implements java.util.List<E> 
{

  protected transient int modCount;
  protected java.util.AbstractList();

  public boolean add(E);
  public abstract E get(int);
  public E set(int, E);
  public void add(int, E);
  public E remove(int);
  public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  public void clear();
  public boolean addAll(int, java.util.Collection<? extends E>);
  
  public java.util.Iterator<E> iterator();
  public java.util.ListIterator<E> listIterator();
  public java.util.ListIterator<E> listIterator(int);
  
  public java.util.List<E> subList(int, int);
  
  public boolean equals(java.lang.Object);
  public int hashCode();
	
	static void subListRangeCheck(int, int, int);
  protected void removeRange(int, int);
}
```

### Example :

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Create a new ArrayList
        List<String> fruits = new ArrayList<>();
        
        // Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Cherry"); // Insert "Cherry" at index 1
        fruits.addAll(Arrays.asList("Date", "Elderberry")); // Add multiple elements

        System.out.println("List after additions: " + fruits);
		
		fruits.addAll(1, Arrays.asList("Date", "Elderberry", "Fig"));
		System.out.println(fruits);
        
        // Size and Empty check
        System.out.println("Size of list: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());
        
        // Access elements
        System.out.println("Element at index 2: " + fruits.get(2));
        
        // Modify elements
        fruits.set(2, "Blueberry"); // Replace element at index 2
        System.out.println("List after modification: " + fruits);
        
        // Search, Check & Comparison
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Last index of 'Date': " + fruits.lastIndexOf("Date"));
        System.out.println("Does list contain 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Does list contain all elements of ['Apple', 'Date']? " + fruits.containsAll(Arrays.asList("Apple", "Date")));
        System.out.println("List equals another list? " + fruits.equals(Arrays.asList("Apple", "Cherry", "Blueberry", "Date", "Elderberry")));
        
        // Deletion
		System.out.println(fruits);
        fruits.remove(1); // Remove element at index 1
        fruits.remove("Date"); // Remove element by value
        System.out.println("List after removals: " + fruits);
        
        fruits.addAll(Arrays.asList("Fig", "Grape", "Honeydew" , "Apple" , "Blueberry"));
        System.out.println("List after adding more fruits: " + fruits);

        fruits.removeAll(Arrays.asList("Apple", "Blueberry")); // Remove all specified elements
        System.out.println("List after removeAll: " + fruits);
        
        fruits.retainAll(Arrays.asList("Elderberry", "Fig")); // Retain only specified elements
        System.out.println("List after retainAll: " + fruits);
        
        // Sorting
        fruits.addAll(Arrays.asList("Apple", "Cherry", "Banana"));
        fruits.sort(Comparator.naturalOrder()); // Sort elements
        System.out.println("List after sorting: " + fruits);
        
        // Replace all
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        fruits.replaceAll(toUpperCase); // Replace all elements with their uppercase versions
        System.out.println("List after replaceAll: " + fruits);
        
        // Traversing using for each loop
        System.out.print("Traversing list using for each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Traversing using list iterator
        System.out.print("Traversing list using listIterator: ");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

		// Get a ListIterator starting at a specific index (2)
        ListIterator<String> lit = fruits.listIterator(2);

        System.out.print ("Using ListIterator starting at index 2: ");
        // Iterate through the list starting at index 2
        while (lit.hasNext()) {
            System.out.print(lit.next() +" ");
        }
		System.out.println();

        // Reverse the list using ListIterator
        System.out.print("Reversing and printing the list: ");
        ListIterator<String> reverseIterator = fruits.listIterator(fruits.size());
        while (reverseIterator.hasPrevious()) {
            System.out.print(reverseIterator.previous() + " ");
        }
		System.out.println();

        
    

        // Sublist
        List<String> subList = fruits.subList(1, 3);
        System.out.println("Sublist (index 1 to 3): " + subList);

        // toArray() - Convert the list to an Object array
        Object[] fruitsArray = fruits.toArray();
        System.out.println("Array (toArray()): " + Arrays.toString(fruitsArray));

        // toArray(T[]) - Convert the list to a String array
        String[] fruitsStringArray = fruits.toArray(new String[0]);
        System.out.println("Array (toArray(T[])): " + Arrays.toString(fruitsStringArray));

        // copyOf(Collection<? extends E>) - Create an unmodifiable copy of the list
        List<String> unmodifiableFruits = List.copyOf(fruits);
        System.out.println("Unmodifiable list (copyOf): " + unmodifiableFruits);

        // Attempt to modify the unmodifiable list (will throw UnsupportedOperationException)
        try {
            unmodifiableFruits.add("Date");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the unmodifiable list: " + e.getMessage());
        }

		//immutable list  using List.of() methods
		// Create an empty list using List.of()
        List<String> emptyList = List.of();
        System.out.println("Empty list: " + emptyList);

        // Create a list with a single element using List.of(E)
        List<String> singleElementList = List.of("Apple");
        System.out.println("Single element list: " + singleElementList);

        // Create a list with two elements using List.of(E, E)
        List<String> twoElementList = List.of("Apple", "Banana");
        System.out.println("Two element list: " + twoElementList);

        // Create a list with multiple elements using List.of(E...)
        List<String> multipleElementList = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");
        System.out.println("Multiple element list: " + multipleElementList);

        // Attempt to modify the immutable list (will throw UnsupportedOperationException)
        try {
            multipleElementList.add("Fig");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable list: " + e.getMessage());
        }

		
        // Clear list
        fruits.clear();
        System.out.println("List after clear: " + fruits);

		
    }
}

/*
List after additions: [Apple, Cherry, Banana, Date, Elderberry]
[Apple, Date, Elderberry, Fig, Cherry, Banana, Date, Elderberry]
Size of list: 8
Is list empty? false
Element at index 2: Elderberry
List after modification: [Apple, Date, Blueberry, Fig, Cherry, Banana, Date, Elderberry]
Index of 'Banana': 5
Last index of 'Date': 6
Does list contain 'Apple'? true
Does list contain all elements of ['Apple', 'Date']? true
List equals another list? false
[Apple, Date, Blueberry, Fig, Cherry, Banana, Date, Elderberry]
List after removals: [Apple, Blueberry, Fig, Cherry, Banana, Elderberry]
List after adding more fruits: [Apple, Blueberry, Fig, Cherry, Banana, Elderberry, Fig, Grape, Honeydew, Apple, Blueberry]
List after removeAll: [Fig, Cherry, Banana, Elderberry, Fig, Grape, Honeydew]
List after retainAll: [Fig, Elderberry, Fig]
List after sorting: [Apple, Banana, Cherry, Elderberry, Fig, Fig]
List after replaceAll: [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Traversing list using for each: APPLE BANANA CHERRY ELDERBERRY FIG FIG 
Traversing list using listIterator: APPLE BANANA CHERRY ELDERBERRY FIG FIG 
Using ListIterator starting at index 2: CHERRY ELDERBERRY FIG FIG 
Reversing and printing the list: FIG FIG ELDERBERRY CHERRY BANANA APPLE 
Sublist (index 1 to 3): [BANANA, CHERRY]
Array (toArray()): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Array (toArray(T[])): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Unmodifiable list (copyOf): [APPLE, BANANA, CHERRY, ELDERBERRY, FIG, FIG]
Cannot modify the unmodifiable list: null
Empty list: []
Single element list: [Apple]
Two element list: [Apple, Banana]
Multiple element list: [Apple, Banana, Cherry, Date, Elderberry]
Cannot modify the immutable list: null
List after clear: []

*/
```

# ArrayList : (class)

- [java.lang.Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
    - [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)<E>
        - [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)<E>
            - java.util.ArrayList<E>

### About :

ArrayList is a part of the Java Collections Framework and is a resizable array implementation of the List interface. It provides dynamic resizing, allowing elements to be added and removed dynamically, and it maintains the insertion order of elements. 

- **Resizable Array**: ArrayList dynamically resizes itself when elements are added or removed.
- **Random Access**: Elements can be accessed directly using their index, providing constant-time access.
- **Insertion Order**: It maintains the order of elements in which they are inserted.
- **Duplicates**: ArrayList allows duplicate elements.
- **Performance**: While ArrayList provides fast access to elements, insertion and deletion in the middle of the list can be slower compared to other data structures like LinkedList.
- **Initial Capacity**: You can specify an initial capacity for ArrayList to avoid frequent resizing, which can improve performance if you have an estimate of the number of elements to be stored.
- Heterogeneous objects : different data type elements are allowed to be stored in this ds.
    - EXAMPLE  : Storing Hetrogeneous elements
        
        ```java
        import java.util.*;
        
        public class Main{
        	public static void main(String[] args)
        	{
        		// ArrayList<Object> list = new ArrayList<>();
        		//or
        		ArrayList list = new ArrayList();
        		list.add("Hello");   // String
        		list.add(42);        // Integer
        		list.add(3.14);      // Double
        		list.add(true);      // Boolean
        		list.add(null);      // Null
        	
        		//using loop
        		for (Object element : list) 
        		{
        		    System.out.print(element+" "); 
        		}
        		System.out.println();
        		
        		// using iterator for accessing whole list
        		Iterator it = list.iterator();
        		while(it.hasNext())
        			{
        				System.out.print(it.next()+" ");
        			}
        	}
        }
        
        //OUTPUT
        //Hello 42 3.14 true null 
        //Hello 42 3.14 true null 
        ```
        

### Signature: ArrayList

```java
javap  java.util.ArrayList
Compiled from "ArrayList.java"
public class java.util.ArrayList<E> 
extends java.util.AbstractList<E> 
implements java.util.List<E>, 
java.util.RandomAccess, 
java.lang.Cloneable, 
java.io.Serializable 
{
  
  //CONSTRUCTORS
  public java.util.ArrayList();  //ArrayList with default initial capacity
  public java.util.ArrayList(int); // ArrayList with defined initial capacity
  public java.util.ArrayList(java.util.Collection<? extends E>); //ArrayList from a collection of another type
  
  //size, Capacity and empty
  public int size();
  public void trimToSize();
  public void ensureCapacity(int);
  public boolean isEmpty();
  
  //insertion
  public boolean add(E);
  public void add(int, E);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  
  //Extract 
  public E get(int);
  
  //Modify
  public E set(int, E);
  
  //Replace 
  public void replaceAll(java.util.function.UnaryOperator<E>);
  
  //delete 
  public E remove(int);
  public boolean remove(java.lang.Object);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public void clear();
  public boolean removeIf(java.util.function.Predicate<? super E>);
  
  
  //search , presence 
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  
  
  //traversing
  public java.util.ListIterator<E> listIterator(int);
  public java.util.ListIterator<E> listIterator();
  public java.util.Iterator<E> iterator();
  public void forEach(java.util.function.Consumer<? super E>);
  public java.util.Spliterator<E> spliterator();
  
  //Comparision
  public boolean equals(java.lang.Object);
  
  
  //sublist
  public java.util.List<E> subList(int, int);
  
  //sorting
  public void sort(java.util.Comparator<? super E>);
 
  
  //Array Conversion
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  
  
  //Immutable Arraylist Copy
  public java.lang.Object clone();
  
  public int hashCode();
  
  //non pubplic members
  transient java.lang.Object[] elementData;
  protected void removeRange(int, int);
  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
  int lastIndexOfRange(java.lang.Object, int, int);
  boolean removeIf(java.util.function.Predicate<? super E>, int, int);
  int indexOfRange(java.lang.Object, int, int);
  boolean equalsRange(java.util.List<?>, int, int);
  int hashCodeRange(int, int);
  void checkInvariants();
  static {};
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
 
  
}
```

### Methods :

| Constructor | Description | Syntax | Example | Expected Outcome |
| --- | --- | --- | --- | --- |
| ArrayList() | Constructs an empty list with an initial capacity of 10. | ArrayList<E>() | ArrayList<String> list = new ArrayList<>(); | Creates an empty ArrayList with an initial capacity of 10. |
| ArrayList(int initialCapacity) | Constructs an empty list with the specified initial capacity. | ArrayList<E>(int initialCapacity) | ArrayList<Integer> list = new ArrayList<>(20); | Creates an empty ArrayList with the specified initial capacity. |
| ArrayList(Collection<? extends E> c) | Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator. | ArrayList<E>(Collection<? extends E> c) | List<String> list = new ArrayList<>(Set.of("apple", "banana")); | Creates an ArrayList containing the elements from the specified collection. |

| Modifier and Type | Method and Description |
| --- | --- |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#add-E-(https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html e)Appends the specified element to the end of this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#add-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html element)Inserts the specified element at the specified position in this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#addAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> c)Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#addAll-int-java.util.Collection-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> c)Inserts all of the elements in the specified collection into this list, starting at the specified position. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#clear--()Removes all of the elements from this list. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#clone--()Returns a shallow copy of this ArrayList instance. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#contains-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns true if this list contains the specified element. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#ensureCapacity-int-(int minCapacity)Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#forEach-java.util.function.Consumer-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> action)Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#get-int-(int index)Returns the element at the specified position in this list. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#indexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#lastIndexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#isEmpty--()Returns true if this list contains no elements. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#iterator--()Returns an iterator over the elements in this list in proper sequence. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#listIterator--()Returns a list iterator over the elements in this list (in proper sequence). |
| https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#listIterator-int-(int index)Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-int-(int index)Removes the element at the specified position in this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Removes the first occurrence of the specified element from this list, if it is present. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#removeAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<?> c)Removes from this list all of its elements that are contained in the specified collection. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#removeIf-java.util.function.Predicate-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> filter)Removes all of the elements of this collection that satisfy the given predicate. |
| protected void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#removeRange-int-int-(int fromIndex, int toIndex)Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#set-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html element)Replaces the element at the specified position in this list with the specified element. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#replaceAll-java.util.function.UnaryOperator-(https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> operator)Replaces each element of this list with the result of applying the operator to that element. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#retainAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<?> c)Retains only the elements in this list that are contained in the specified collection. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--()Returns the number of elements in this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#sort-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> c)Sorts this list according to the order induced by the specified https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#spliterator--()Creates a https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding and fail-fast https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html over the elements in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/List.html<https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#subList-int-int-(int fromIndex, int toIndex)Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html[] | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#toArray--()Returns an array containing all of the elements in this list in proper sequence (from first to last element). |
| <T> T[] | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#toArray-T:A-(T[] a)Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#trimToSize--()Trims the capacity of this ArrayList instance to be the list's current size. |

### Example:

```java

```

# LinkedList: (class)

- [java.lang.Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
    - [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)<E>
        - [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)<E>
            - [java.util.AbstractSequentialList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractSequentialList.html)<E>
                - java.util.LinkedList<E>

### About :

`LinkedList` is a doubly-linked list implementation of the `List` and `Deque` interfaces. It is part of the Java Collections Framework and allows for efficient insertion and deletion.

**Features:**

- **Doubly Linked List:** Each element points to the next and previous elements.
- **Efficient Insertions/Deletions:** Insertion and deletion are efficient at both the beginning and end of the list. But Insertion in the middle requires massive shift, which reduces the performance
- **Non-Synchronized:** Not thread-safe by default, but can be synchronized explicitly.
- Preferred when frequent insertions and deletions are needed.
- It is less efficient for accessing elements by index compared to `ArrayList`.

### Signature : AbstractSequentialList (Abstract Class)

```java
javap java.util.AbstractSequentialList
Compiled from "AbstractSequentialList.java"
public abstract class java.util.AbstractSequentialList<E> 
extends java.util.AbstractList<E> 
{
	//non abstract methods
  protected java.util.AbstractSequentialList();
  public E get(int);
  public E set(int, E);
  public void add(int, E);
  public E remove(int);
  public boolean addAll(int, java.util.Collection<? extends E>);
  public java.util.Iterator<E> iterator();
  
  //abstract method
  public abstract java.util.ListIterator<E> listIterator(int);
}
```

### Signature LinkedList (Class) :

```java
javap java.util.LinkedList
Compiled from "LinkedList.java"
public class java.util.LinkedList<E> 
extends java.util.AbstractSequentialList<E> 
implements java.util.List<E>, 
java.util.Deque<E>, 
java.lang.Cloneable, 
java.io.Serializable 
{
  transient int size;
  transient java.util.LinkedList$Node<E> first;
  transient java.util.LinkedList$Node<E> last;
  
  //Constructor
  public java.util.LinkedList();
  public java.util.LinkedList(java.util.Collection<? extends E>);
  
  //Insertion
  public boolean add(E);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  public void addFirst(E);
  public void addLast(E);
  public void push(E);
  
  void linkLast(E);
  void linkBefore(E, java.util.LinkedList$Node<E>);
  E unlink(java.util.LinkedList$Node<E>);
  
  public E getFirst();
  public E getLast();
  public E removeFirst();
  public E removeLast();
  
  
  
  public boolean contains(java.lang.Object);
  public int size();
  
  
  public boolean remove(java.lang.Object);
  
  
  
  public void clear();
  public E get(int);
  public E set(int, E);
  
  public void add(int, E);
  public E remove(int);
  
  java.util.LinkedList$Node<E> node(int);
  public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  public E peek();
  public E element();
  public E poll();
  public E remove();
  public boolean offer(E);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E peekFirst();
  public E peekLast();
  public E pollFirst();
  public E pollLast();
  
  public E pop();
  
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
  
  public java.util.ListIterator<E> listIterator(int);
  public java.util.Iterator<E> descendingIterator();
  public java.util.Spliterator<E> spliterator();
  public java.lang.Object clone();
  
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  
}
```

### Methods :

Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

| Modifier and Type | Method and Description |
| --- | --- |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#add-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Appends the specified element to the end of this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#add-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html element)Inserts the specified element at the specified position in this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html> c)Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addAll-int-java.util.Collection-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html> c)Inserts all of the elements in the specified collection into this list, starting at the specified position. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addFirst-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Inserts the specified element at the beginning of this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addLast-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Appends the specified element to the end of this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#clear--()Removes all of the elements from this list. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#clone--()Returns a shallow copy of this LinkedList. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#contains-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns true if this list contains the specified element. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#descendingIterator--()Returns an iterator over the elements in this deque in reverse sequential order. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#element--()Retrieves, but does not remove, the head (first element) of this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#get-int-(int index)Returns the element at the specified position in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#getFirst--()Returns the first element in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#getLast--()Returns the last element in this list. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#indexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#lastIndexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#listIterator-int-(int index)Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offer-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Adds the specified element as the tail (last element) of this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offerFirst-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Inserts the specified element at the front of this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offerLast-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Inserts the specified element at the end of this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peek--()Retrieves, but does not remove, the head (first element) of this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peekFirst--()Retrieves, but does not remove, the first element of this list, or returns null if this list is empty. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peekLast--()Retrieves, but does not remove, the last element of this list, or returns null if this list is empty. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#poll--()Retrieves and removes the head (first element) of this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pollFirst--()Retrieves and removes the first element of this list, or returns null if this list is empty. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pollLast--()Retrieves and removes the last element of this list, or returns null if this list is empty. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pop--()Pops an element from the stack represented by this list. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#push-E-(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html e)Pushes an element onto the stack represented by this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove--()Retrieves and removes the head (first element) of this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove-int-(int index)Removes the element at the specified position in this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Removes the first occurrence of the specified element from this list, if it is present. |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeFirst--()Removes and returns the first element from this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeFirstOccurrence-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Removes the first occurrence of the specified element in this list (when traversing the list from head to tail). |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeLast--()Removes and returns the last element from this list. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeLastOccurrence-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Removes the last occurrence of the specified element in this list (when traversing the list from head to tail). |
| https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#set-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html element)Replaces the element at the specified position in this list with the specified element. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#size--()Returns the number of elements in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html> | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#spliterator--()Creates a https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding and fail-fast https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html over the elements in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html[] | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#toArray--()Returns an array containing all of the elements in this list in proper sequence (from first to last element). |
| <T> T[] | https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#toArray-T:A-(T[] a)Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. |

### Example

```java

```

# Vector (class)

- [java.lang.Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
    - [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)<E>
        - [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)<E>
            - [java.util.Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)<E>

### About :

`Vector` is a synchronized, resizable array implementation of the `List` interface. It is part of the Java Collections Framework but is considered legacy and not often used in new code.

- **Dynamic Size:** Similar to `ArrayList`, but synchronized .
- **Thread-Safe:** All methods are synchronized .
- **Legacy Class:** Replaced by the more flexible and less synchronized `ArrayList`.
- Preferred in a multi-threaded environment where thread safety is required .
- It is generally recommended to use `ArrayList` or `CopyOnWriteArrayList` for better performance .

### Signature

```java

javap java.util.Vector
Compiled from "Vector.java"
public class java.util.Vector<E> 
extends java.util.AbstractList<E> 
implements java.util.List<E>, 
java.util.RandomAccess, 
java.lang.Cloneable, 
java.io.Serializable 
{

  protected java.lang.Object[] elementData;
  protected int elementCount;
  protected int capacityIncrement;
  
  public java.util.Vector(int, int);
  public java.util.Vector(int);
  public java.util.Vector();
  public java.util.Vector(java.util.Collection<? extends E>);
  
  public synchronized void copyInto(java.lang.Object[]);
  public synchronized void trimToSize();
  public synchronized void ensureCapacity(int);
  public synchronized void setSize(int);
  public synchronized int capacity();
  public synchronized int size();
  public synchronized boolean isEmpty();
  public java.util.Enumeration<E> elements();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  public synchronized int indexOf(java.lang.Object, int);
  public synchronized int lastIndexOf(java.lang.Object);
  public synchronized int lastIndexOf(java.lang.Object, int);
  public synchronized E elementAt(int);
  public synchronized E firstElement();
  public synchronized E lastElement();
  public synchronized void setElementAt(E, int);
  public synchronized void removeElementAt(int);
  public synchronized void insertElementAt(E, int);
  public synchronized void addElement(E);
  public synchronized boolean removeElement(java.lang.Object);
  public synchronized void removeAllElements();
  public synchronized java.lang.Object clone();
  public synchronized java.lang.Object[] toArray();
  public synchronized <T> T[] toArray(T[]);
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
  public synchronized E get(int);
  public synchronized E set(int, E);
  public synchronized boolean add(E);
  public boolean remove(java.lang.Object);
  public void add(int, E);
  public synchronized E remove(int);
  public void clear();
  public synchronized boolean containsAll(java.util.Collection<?>);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public boolean removeIf(java.util.function.Predicate<? super E>);
  public synchronized boolean addAll(int, java.util.Collection<? extends E>);
  public synchronized boolean equals(java.lang.Object);
  public synchronized int hashCode();
  public synchronized java.lang.String toString();
  public synchronized java.util.List<E> subList(int, int);
  protected synchronized void removeRange(int, int);
  public synchronized java.util.ListIterator<E> listIterator(int);
  public synchronized java.util.ListIterator<E> listIterator();
  public synchronized java.util.Iterator<E> iterator();
  public synchronized void forEach(java.util.function.Consumer<? super E>);
  public synchronized void replaceAll(java.util.function.UnaryOperator<E>);
  public synchronized void sort(java.util.Comparator<? super E>);
  public java.util.Spliterator<E> spliterator();
  void checkInvariants();
}
```

### Methods :

| Modifier and Type | Method and Description |
| --- | --- |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#add-E-(https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html e)Appends the specified element to the end of this Vector. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#add-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html element)Inserts the specified element at the specified position in this Vector. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#addAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> c)Appends all of the elements in the specified Collection to the end of this Vector, in the order that they are returned by the specified Collection's Iterator. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#addAll-int-java.util.Collection-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<? extends https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> c)Inserts all of the elements in the specified Collection into this Vector at the specified position. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#addElement-E-(https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html obj)Adds the specified component to the end of this vector, increasing its size by one. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#capacity--()Returns the current capacity of this vector. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#clear--()Removes all of the elements from this Vector. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#clone--()Returns a clone of this vector. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#contains-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns true if this vector contains the specified element. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#containsAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<?> c)Returns true if this Vector contains all of the elements in the specified Collection. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#copyInto-java.lang.Object:A-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html[] anArray)Copies the components of this vector into the specified array. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#elementAt-int-(int index)Returns the component at the specified index. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#elements--()Returns an enumeration of the components of this vector.  |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#ensureCapacity-int-(int minCapacity)Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.  |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#equals-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Compares the specified Object with this Vector for equality. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#firstElement--()Returns the first component (the item at index 0) of this vector. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#forEach-java.util.function.Consumer-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> action)Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#get-int-(int index)Returns the element at the specified position in this Vector. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#hashCode--()Returns the hash code value for this Vector. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#indexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the first occurrence of the specified element in this vector, or -1 if this vector does not contain the element. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#indexOf-java.lang.Object-int-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o, int index)Returns the index of the first occurrence of the specified element in this vector, searching forwards from index, or returns -1 if the element is not found. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#insertElementAt-E-int-(https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html obj, int index)Inserts the specified object as a component in this vector at the specified index. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#isEmpty--()Tests if this vector has no components. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#iterator--()Returns an iterator over the elements in this list in proper sequence. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#lastElement--()Returns the last component of the vector. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#lastIndexOf-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the index of the last occurrence of the specified element in this vector, or -1 if this vector does not contain the element. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#lastIndexOf-java.lang.Object-int-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o, int index)Returns the index of the last occurrence of the specified element in this vector, searching backwards from index, or returns -1 if the element is not found. |
| https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#listIterator--()Returns a list iterator over the elements in this list (in proper sequence). |
| https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#listIterator-int-(int index)Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#remove-int-(int index)Removes the element at the specified position in this Vector. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#remove-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<?> c)Removes from this Vector all of its elements that are contained in the specified Collection. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeAllElements--()Removes all components from this vector and sets its size to zero. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeElement-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html obj)Removes the first (lowest-indexed) occurrence of the argument from this vector. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeElementAt-int-(int index)Deletes the component at the specified index. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeIf-java.util.function.Predicate-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> filter)Removes all of the elements of this collection that satisfy the given predicate. |
| protected void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeRange-int-int-(int fromIndex, int toIndex)Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#replaceAll-java.util.function.UnaryOperator-(https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> operator)Replaces each element of this list with the result of applying the operator to that element. |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#retainAll-java.util.Collection-(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html<?> c)Retains only the elements in this Vector that are contained in the specified Collection. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#set-int-E-(int index, https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html element)Replaces the element at the specified position in this Vector with the specified element. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#setElementAt-E-int-(https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html obj, int index)Sets the component at the specified index of this vector to be the specified object. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#setSize-int-(int newSize)Sets the size of this vector. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#size--()Returns the number of components in this vector. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#sort-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> c)Sorts this list according to the order induced by the specified https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#spliterator--()Creates a https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding and fail-fast https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html over the elements in this list. |
| https://docs.oracle.com/javase/8/docs/api/java/util/List.html<https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#subList-int-int-(int fromIndex, int toIndex)Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html[] | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#toArray--()Returns an array containing all of the elements in this Vector in the correct order. |
| <T> T[] | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#toArray-T:A-(T[] a)Returns an array containing all of the elements in this Vector in the correct order; the runtime type of the returned array is that of the specified array. |
| https://docs.oracle.com/javase/8/docs/api/java/lang/String.html | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#toString--()Returns a string representation of this Vector, containing the String representation of each element. |
| void | https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#trimToSize--()Trims the capacity of this vector to be the vector's current size. |

### Example

```java

```

# Stack (class)

- [java.lang.Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
    - [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)<E>
        - [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)<E>
            - [java.util.Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)<E>
                - java.util.Stack<E>

### About :

`Stack` is a subclass of `Vector` and represents a last-in, first-out (LIFO) stack of objects. It is part of the Java Collections Framework but considered legacy .

- **LIFO Order:** Elements are added and removed from the top of the stack.
- **Thread-Safe:** Inherits synchronization from `Vector`.
- **Legacy Class:** Replaced by `Deque` for a more complete stack and queue implementation.
- Preferred when LIFO behavior is needed.
- It is generally recommended to use `Deque` instead for stack operations.

### Signature :

```java
javap java.util.Stack
Compiled from "Stack.java"
public class java.util.Stack<E>
extends java.util.Vector<E>
{
	//constructors
  public java.util.Stack();
  
  //basic operation
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  
  //search
  public synchronized int search(java.lang.Object);
}
```

### Methods :

| Modifier and Type | Method and Description |
| --- | --- |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#empty--()Tests if this stack is empty. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html | https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#peek--()Looks at the object at the top of this stack without removing it from the stack. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html | https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#pop--()Removes the object at the top of this stack and returns that object as the value of this function. |
| https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html | https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#push-E-(https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html item)Pushes an item onto the top of this stack. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#search-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html o)Returns the 1-based position where an object is on this stack. |

### Example

```java

```

