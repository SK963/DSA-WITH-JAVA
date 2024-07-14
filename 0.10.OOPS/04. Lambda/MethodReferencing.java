
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class MethodReferencing {
    public static void main(String[] args) {
        
        
        //Reference to a Static Method
        Function<String, Integer> parseIntFunction = Integer::parseInt;
        Integer number = parseIntFunction.apply("123");
        System.out.println(number); // Output: 123
        
        //Reference to an Instance Method of a Particular Object
        String str = "Hello, World!";
        Supplier<Integer> lengthSupplier = str::length;
        System.out.println(lengthSupplier.get()); // Output: 13
        
        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<Integer> lengths = names.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());
        System.out.println(lengths); // Output: [5, 3, 7]

    
        //Reference to a Constructor
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> names2 = listSupplier.get();
        names2.add("Alice");
        names2.add("Bob");
        System.out.println(names2); // Output: [Alice, Bob]
    
    }
}

/*
 123
13
[5, 3, 7]
[Alice, Bob]
 */