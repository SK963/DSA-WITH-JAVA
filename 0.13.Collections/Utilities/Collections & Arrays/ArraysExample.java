import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class ArraysExample {

    public static void main(String[] args) {
        // Primitive array
        int[] intArray = {3, 1, 4, 1, 5, 9};
        // Object array
        String[] strArray = {"banana", "apple", "cherry"};

        // 1. sort
        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray)); // [1, 1, 3, 4, 5, 9]

        // 2. sorting with comparator
        Arrays.sort(strArray, Comparator.reverseOrder());
        System.out.println("Sorted strArray with comparator: " + Arrays.toString(strArray)); // [cherry, banana, apple]

        // 3. parallelsort
        Arrays.parallelSort(intArray);
        System.out.println("Parallel sorted intArray: " + Arrays.toString(intArray)); 
        // [1, 1, 3, 4, 5, 9]

        // 4. parallelsort on a object array which extends comparable
        Arrays.parallelSort(strArray);
        System.out.println("Parallel sorted strArray: " + Arrays.toString(strArray)); 
        // [apple, banana, cherry]

        // 5. parallelsort with comparator
        Arrays.parallelSort(strArray, Comparator.reverseOrder());
        System.out.println("Parallel sorted strArray with comparator: " + Arrays.toString(strArray)); 
        // [cherry, banana, apple]

        // 6. parallelprefix
        Arrays.parallelPrefix(intArray, Integer::sum);
        System.out.println("Parallel prefix intArray: " + Arrays.toString(intArray));
         // [1, 2, 5, 9, 14, 23]

        // 7. BinarySearch
        int index = Arrays.binarySearch(intArray, 9);
        System.out.println("Index of 9 in intArray: " + index); // 3

        // 8. Equals
        boolean areEqual = Arrays.equals(intArray, new int[]{1, 2, 5, 9, 14, 23});
        System.out.println("intArray equals [1, 2, 5, 9, 14, 23]: " + areEqual);
         // true

        // 9. Equals with Comparator
        boolean areEqualWithComparator = Arrays.equals(strArray, new String[]{"cherry", "banana", "apple"}, Comparator.naturalOrder());
        System.out.println("strArray equals [cherry, banana, apple] with comparator: " + areEqualWithComparator); 
        // false

        // 10. Fill
        Arrays.fill(intArray, 7);
        System.out.println("Filled intArray: " + Arrays.toString(intArray)); 
        // [7, 7, 7, 7, 7, 7]

        // 11. copyOf
        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied intArray: " + Arrays.toString(copiedArray)); 
        // [7, 7, 7, 7, 7, 7]

        // 12. copyOfRange
        int[] copiedRangeArray = Arrays.copyOfRange(intArray, 1, 4);
        System.out.println("Copied range of intArray: " + Arrays.toString(copiedRangeArray)); 
        // [7, 7, 7]

        // 13. asList
        List<String> strList = Arrays.asList(strArray);
        System.out.println("List from strArray: " + strList);
         // [cherry, banana, apple]

        // 14. hashCode
        int hashCode = Arrays.hashCode(intArray);
        System.out.println("Hash code of intArray: " + hashCode);

        // 15. deepHashCode
        int deepHashCode = Arrays.deepHashCode(new Object[]{intArray});
        System.out.println("Deep hash code of intArray: " + deepHashCode);

        // 16. deepEquals
        boolean deepEquals = Arrays.deepEquals(new Object[]{intArray}, new Object[]{new int[]{7, 7, 7, 7, 7, 7}});
        System.out.println("Deep equals of intArray: " + deepEquals); // true

        // 17. deepEquals0 (internal use)
        // boolean deepEquals0 = Arrays.deepEquals0(intArray, new int[]{7, 7, 7, 7, 7, 7});
        // System.out.println("Deep equals0 of intArray: " + deepEquals0);

        // 18. toString
        String intArrayString = Arrays.toString(intArray);
        System.out.println("String representation of intArray: " + intArrayString);
         // [7, 7, 7, 7, 7, 7]

        // 19. deepToString
        String deepToString = Arrays.deepToString(new Object[]{intArray});
        System.out.println("Deep string representation of intArray: " + deepToString);
         // [[7, 7, 7, 7, 7, 7]]

        // 20. setAll and parallelSetAll
        Arrays.setAll(intArray, i -> i * 2);
        System.out.println("Set all intArray: " + Arrays.toString(intArray)); 
        // [0, 2, 4, 6, 8, 10]

        Arrays.parallelSetAll(intArray, i -> i * 3);
        System.out.println("Parallel set all intArray: " + Arrays.toString(intArray)); 
        // [0, 3, 6, 9, 12, 15]

        // 21. Spliterator
        Spliterator<String> spliterator = Arrays.spliterator(strArray);
        System.out.println("Spliterator of strArray: " + spliterator.estimateSize()); 
        // 3

        // 22. stream
        Stream<String> stream = Arrays.stream(strArray);
        System.out.println("Stream of strArray: " + stream.count()); 
        // 3

        // 23. compare
        int compareResult = Arrays.compare(intArray, new int[]{0, 3, 6, 9, 12, 15});
        System.out.println("Compare intArray: " + compareResult); 
        // 0

        // 24. compare (range)
        int compareRangeResult = Arrays.compare(intArray, 0, 3, new int[]{0, 3, 6, 9, 12, 15}, 0, 3);
        System.out.println("Compare range of intArray: " + compareRangeResult); 
        // 0

        // 25. compareUnsigned
        byte[] byteArray = {1, 2, 3};
        byte[] byteArray2 = {1, 2, 4};
        int compareUnsignedResult = Arrays.compareUnsigned(byteArray, byteArray2);
        System.out.println("Compare unsigned byteArray: " + compareUnsignedResult); 
        // -1

        // 26. compare object arrays with comparable implementation or comparator
        Integer[] intObjArray1 = {1, 2, 3};
        Integer[] intObjArray2 = {1, 2, 4};
        int compareObjArrayResult = Arrays.compare(intObjArray1, intObjArray2, Comparator.naturalOrder());
        System.out.println("Compare object arrays: " + compareObjArrayResult); // -1

        // 27. mismatch
        int mismatchIndex = Arrays.mismatch(intArray, new int[]{0, 3, 6, 9, 12, 13});
        System.out.println("Mismatch index in intArray: " + mismatchIndex); 
        // 5

        // 28. mismatch object array with comparator
        String[] strArray2 = {"apple", "banana", "date"};
        int mismatchObjArrayIndex = Arrays.mismatch(strArray, strArray2, Comparator.naturalOrder());
        System.out.println("Mismatch index in strArray: " + mismatchObjArrayIndex); 
        // 2
    }
}
