import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Original list: " + list);
        
        // Get ListIterator from ArrayList
        ListIterator<String> iterator = list.listIterator();

        // Forward traversal
        System.out.print("Forward traversal: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
            System.out.print("(nextIndex: " + iterator.nextIndex() + ", previousIndex: " + iterator.previousIndex() + ") ");
        }
        System.out.println();

        // Backward traversal
        System.out.print("Backward traversal: ");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.print(element + " ");
            System.out.print("(nextIndex: " + iterator.nextIndex() + ", previousIndex: " + iterator.previousIndex() + ") ");
        }
        System.out.println();

        // Modify list using ListIterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove();
            } else if (element.equals("Orange")) {
                iterator.add("Grape");
            }
        }

        // Print modified list
        System.out.print("Modified list: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
    }
}

/*
Original list: [Apple, Banana, Orange]
Forward traversal: Apple (nextIndex: 1, previousIndex: 0) Banana (nextIndex: 2, previousIndex: 1) Orange (nextIndex: 3, previousIndex: 2) 
Backward traversal: Orange (nextIndex: 2, previousIndex: 1) Banana (nextIndex: 1, previousIndex: 0) Apple (nextIndex: 0, previousIndex: -1) 
Modified list: Apple Orange Grape 
*/
