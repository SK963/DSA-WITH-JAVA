import java.util.Vector;
import java.util.Enumeration;
import java.util.ListIterator;

public class VectorExample {
    public static void main(String[] args)
	{
        // 1. Creating Vectors
        Vector<String> vector1 = new Vector<>(); // Default constructor
		System.out.println(vector1.capacity());
        Vector<String> vector2 = new Vector<>(11); // Initial capacity
		System.out.println(vector2.capacity());
        Vector<String> vector3 = new Vector<>(10, 5); // Initial capacity and capacity increment
		System.out.println(vector3.capacity());
		
        // 2. Adding Elements
        vector1.addElement("Apple");
        vector1.add("Banana");
        vector1.add(1, "Orange"); // Inserting at index 1

        Vector<String> vector4 = new Vector<>();
        vector4.add("Grapes");
        vector4.add("Pineapple");
        vector1.addAll(vector4); // Adding all elements from another collection

        System.out.println("Vector1 elements: " + vector1);

        // 3. Accessing Elements
        System.out.println("Element at index 1: " + vector1.elementAt(1));
        System.out.println("First element: " + vector1.firstElement());
        System.out.println("Last element: " + vector1.lastElement());

        // 4. Removing Elements
        vector1.removeElementAt(2); // Remove element at index 2
        vector1.removeElement("Pineapple"); // Remove specific element
        vector1.remove(1); // Remove element at index 1
        System.out.println("Vector1 after removals: " + vector1);

        vector1.removeAllElements(); // Remove all elements
        System.out.println("Vector1 after removeAllElements: " + vector1);

        // 5. Other Methods
        System.out.println("Vector1 size: " + vector1.size());
        System.out.println("Vector1 is empty: " + vector1.isEmpty());
        vector1.add("Apple");
        vector1.add("Banana");
        System.out.println("Vector1 contains 'Banana': " + vector1.contains("Banana"));
        System.out.println("Index of 'Apple': " + vector1.indexOf("Apple"));

        Object[] array = vector1.toArray();
        System.out.println("Array from Vector1: " + java.util.Arrays.toString(array));

        @SuppressWarnings("unchecked")
        Vector<String> vectorClone = (Vector<String>) vector1.clone();
        System.out.println("Cloned Vector: " + vectorClone);

        // Additional methods: Enumeration, ListIterator
        Enumeration<String> enumeration = vector1.elements();
        System.out.print("Elements using Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = vector1.listIterator();
        System.out.print("Elements using ListIterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
    }
}
