import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class MethodReferencingRealExamples {

    public static void main(String[] args) {

        //1. Sorting a List
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice"); 
        names.add("bob");
        Collections.sort(names); //default natural sorting order
        System.out.println("Default sorting : "+ names);
        //Output : [Alice, Charlie, bob]

        Collections.sort(names, String::compareToIgnoreCase);
        System.out.println(names); 
        // Output: [Alice, bob, Charlie]



    
        //2.Using Streams

        // Using map with method reference
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println(upperCaseNames); 
        // Output: [ALICE, BOB, CHARLIE]

        //3. Using forEach with method reference
        names.forEach(System.out::println);
         //Output : Alice
                //  bob
              //    Charlie
    

        // 4.Combining Method References with Predicates
        // Predicate method reference
        names.add("");
        System.out.println("name list :" +  names);
        Predicate<String> nonEmptyStringPredicate = String::isEmpty;

        // Filter and collect non-empty strings
        List<String> nonEmptyNames = names.stream()
                                          .filter(nonEmptyStringPredicate.negate())
                                          .collect(Collectors.toList());
        
        System.out.println(nonEmptyNames); 
        // Output: [Alice, bob, Charlie]


    
    }
    
}

/*
 Ouput :
 Default sorting : [Alice, Charlie, bob]
[Alice, bob, Charlie]
[ALICE, BOB, CHARLIE]
Alice
bob
Charlie
name list :[Alice, bob, Charlie, ]
[Alice, bob, Charlie]

 */
