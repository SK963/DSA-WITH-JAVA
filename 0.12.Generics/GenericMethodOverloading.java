import java.util.*;


public class GenericMethodOverloading{

    // Generic method to print a single element
    public static <T> void printElement(T element) {
        System.out.println("Printing single element: " + element);
    }

    // Overloaded generic method to print an array of elements
    public static <T> void printElement(T[] array) {
        System.out.print("Printing array elements: ");
        for (T element : array) {
            System.out.print(element +" ");
        }
		System.out.println();
    }

    // Overloaded generic method with a different type parameter
    public static <E> void printElement(List<E> list) {
        System.out.print("Printing list elements: ");
        for (E element : list) {
            System.out.print(element + " ");
        }
		
		System.out.println();
    }

    public static void main(String[] args) {
        // Calling the overloaded methods with different types of arguments
        printElement(10);                           // Calls the first method with Integer type
        printElement(3.14);                         // Calls the first method with Double type
        printElement("Hello, World!");             // Calls the first method with String type

        Integer[] intArray = {1, 2, 3, 4, 5};
        printElement(intArray);                    // Calls the second method with Integer array type

        List<String> stringList = Arrays.asList("apple", "banana", "orange");
        printElement(stringList);                  // Calls the third method with List<String> type
    }
}


//output
// Printing single element: 10
// Printing single element: 3.14
// Printing single element: Hello, World!
// Printing array elements: 1 2 3 4 5 
// Printing list elements: apple banana orange 
