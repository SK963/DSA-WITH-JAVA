import java.util.Comparator;
import java.util.Objects;
import java.util.function.Supplier;

public class ObjectsExample {
    
    public static void main(String[] args) 
	{
        Object obj1 = "hello";
        Object obj2 = "hello";
        Object obj3 = null;


		
        // equals
        System.out.println("Objects.equals(obj1, obj2): " + Objects.equals(obj1, obj2)); // true

        // deepEquals
        Object[] arr1 = {1, 2, 3};
        Object[] arr2 = {1, 2, 3};
        System.out.println("Objects.deepEquals(arr1, arr2): " + Objects.deepEquals(arr1, arr2)); // true

        // hashCode
        System.out.println("Objects.hashCode(obj1): " + Objects.hashCode(obj1)); // hash code of "hello"

        // hash
        System.out.println("Objects.hash(obj1, obj2, obj3): " + Objects.hash(obj1, obj2, obj3)); // combined hash code

        // toString
        System.out.println("Objects.toString(obj1): " + Objects.toString(obj1)); // "hello"
        System.out.println("Objects.toString(obj3, \"default\"): " + Objects.toString(obj3, "default")); // "default"

        // toIdentityString
        System.out.println("Objects.toIdentityString(obj1): " + Objects.toIdentityString(obj1)); // identity hash code

        // compare
        Comparator<String> comparator = String::compareTo;
        System.out.println("Objects.compare(\"a\", \"b\", comparator): " + Objects.compare("a", "b", comparator)); // -1

        // requireNonNull
        try {
            Objects.requireNonNull(obj3, "Object cannot be null");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // "Object cannot be null"
        }

        // isNull
        System.out.println("Objects.isNull(obj3): " + Objects.isNull(obj3)); // true

        // nonNull
        System.out.println("Objects.nonNull(obj1): " + Objects.nonNull(obj1)); // true

        // requireNonNullElse
        System.out.println("Objects.requireNonNullElse(obj3, obj1): " + Objects.requireNonNullElse(obj3, obj1)); // "hello"

        // requireNonNullElseGet
        Supplier<String> supplier = () -> "supplied";
        System.out.println("Objects.requireNonNullElseGet(obj3, supplier): " + Objects.requireNonNullElseGet(obj3, supplier)); // "supplied"

        // requireNonNull with Supplier
        try {
            Objects.requireNonNull(obj3, () -> "Custom message from supplier");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // "Custom message from supplier"
        }

        // checkIndex
        int[] array = {1, 2, 3};
        try {
            Objects.checkIndex(3, array.length);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // "Index 3 out of bounds for length 3"
        }

        // checkFromToIndex
        try {
            Objects.checkFromToIndex(1, 4, array.length);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // "Range [1, 4) out of bounds for length 3"
        }

        // checkFromIndexSize
        try {
            Objects.checkFromIndexSize(2, 2, array.length);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // "Range [2, 4) out of bounds for length 3"
        }
    }
}
