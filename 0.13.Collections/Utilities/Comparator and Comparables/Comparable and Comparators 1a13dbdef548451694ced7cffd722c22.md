# Comparable and Comparators

REFERENCES

[Comparator (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

# Comparable (interface>):

the **`Comparable`** interface is used to impose a natural ordering on the objects of a class. By implementing the **`Comparable`** interface, a class defines its own comparison method, which allows instances of that class to be compared with one another. This is particularly useful for sorting and searching operations

- Structure :
    
    ```java
    javap java.lang.Comparable
    Compiled from "Comparable.java"
    public interface java.lang.Comparable<T> 
    {
      public abstract int compareTo(T);
    }
    ```
    

## Implementing Comparable Interface :

To make a class comparable, it needs to implement the **`Comparable`** interface and provide the **`compareTo()`** method implementation.

Example:

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor, getters, and setters

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
}
```

### Use :

- EXAMPLE  : Custom Sorting
    
    ```java
    import java.util.*;
    
    class Books implements Comparable<Books>
    {
    	public String name;
    	public Integer price;
    	
    	Books(String name,int price){
    		this.name=name;
    		this.price=price;
    	}
    
    	public int compareTo(Books b)
    	{
    		return Integer.compare(this.price,b.price);
    	}
    	
    	public String  toString(){
    		return "{ Name: " + name +" , Price: " + price +"}" ;
    		
    	}
    	
    	
    	
    }
    
    public class Main 
    {
        public static void main(String[] args) 
    		{
            List<Books> list = new ArrayList<>();
    		
            list.add(new Books("Java",500));
            list.add(new Books("Python",300));
            list.add(new Books("C++",400));
           
            System.out.println("Original Set: " + list);
    		Collections.sort(list);
    		System.out.println("Sorted Set :" + list);
    
         }
    }
    
    /*
    output
    Original Set: [{ Name: Java , Price: 500}, { Name: Python , Price: 300}, { Name: C++ , Price: 400}]
    Sorted Set :[{ Name: Python , Price: 300}, { Name: C++ , Price: 400}, { Name: Java , Price: 500}]
    */
    
    ```
    
- Example  :
    
    ```java
    import java.util.*;
    
    class Teacher implements Comparable<Teacher>
    {
        String name;
        int experience;
        int salary;
    
        Teacher(int experience , int salary , String name){
            this.experience = experience;
            this.salary = salary;
            this.name = name;
        }
    
    	// implementing compareto method for  defining sorting behaviour
        public int compareTo(Teacher t){
            if(this.experience > t.experience)
                return 1;
            else 
                return -1;
        }
    
        //overriding toString method of object class make the reference to print the desired output
        public String toString(){
            return "{ Name: " + name +" , Experience: " + experience + " , Salary: " + salary +"}" ;  
        }
    
    }
    
    public class Main
    {
        public static void main(String[] args) 
        {
    
            //Using Comparables
            Teacher t1 = new Teacher(6, 40000, "Kumar");
            Teacher t2 = new Teacher(7, 45000, "Gussain");
            Teacher t3 = new Teacher(8 , 300000 , "Prasad");
    
            List<Teacher> teacherlist = new ArrayList<>();
            teacherlist.add(t3);
            teacherlist.add(t2);
            teacherlist.add(t1);
    
            
            System.out.println("Original teachers list: "+ teacherlist);
    
            Collections.sort(teacherlist);
            System.out.println("sorted teachers list: "+ teacherlist);
           
        }
    }
    
    /*
    OUTPUT
    Original teachers list: [{ Name: Prasad , Experience: 8 , Salary: 300000}, { Name: Gussain , Experience: 7 , Salary: 45000}, { Name: Kumar , Experience: 6 , Salary: 40000}]
    sorted teachers list: [{ Name: Kumar , Experience: 6 , Salary: 40000}, { Name: Gussain , Experience: 7 , Salary: 45000}, { Name: Prasad , Experience: 8 , Salary: 300000}]
    
    */
    ```
    

# Comparator (interface):

## About:

The **`Comparator`** interface in Java is used to define custom comparison logic for objects that do not have a natural ordering or when you want to sort objects based on different criteria. Unlike the **`Comparable`** interface, which is typically implemented by the class itself to define its natural ordering, the **`Comparator`** interface allows you to define multiple comparison strategies for a class without modifying its source code.

- Structure :
    
    ```java
    javap java.util.Comparator
    Compiled from "Comparator.java"
    public interface java.util.Comparator<T> 
    {
    	
    	
    	
    	//Abstract Methods
      public abstract int compare(T, T);
      public abstract boolean equals(java.lang.Object);
      
      
      
      
      //default methods
      
      //Reversing a comparator
      public default java.util.Comparator<T> reversed(); 
      
      //Adding multiple Comparator Layers 
      public default java.util.Comparator<T> thenComparing(java.util.Comparator<? super T>);
      public default <U> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U>, java.util.Comparator<? super U>);
      public default <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U>);
      
      public default java.util.Comparator<T> thenComparingInt(java.util.function.ToIntFunction<? super T>);
      public default java.util.Comparator<T> thenComparingLong(java.util.function.ToLongFunction<? super T>);
      public default java.util.Comparator<T> thenComparingDouble(java.util.function.ToDoubleFunction<? super T>);
      
      
      //Static Methods
      //Comparable Returning Methods 
      public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder();
      public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder();
      
      
      public static <T, U extends java.lang.Comparable<? super U>> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U>);  
      
      //Comparator Returning Methods
      
    	  //Comparator conversion
    		  //null priority Changers
      public static <T> java.util.Comparator<T> nullsFirst(java.util.Comparator<? super T>);
      public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T>);
      
      public static <T, U> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U>, java.util.Comparator<? super U>);
      
    
      
      public static <T> java.util.Comparator<T> comparingInt(java.util.function.ToIntFunction<? super T>);
      public static <T> java.util.Comparator<T> comparingLong(java.util.function.ToLongFunction<? super T>);
      public static <T> java.util.Comparator<T> comparingDouble(java.util.function.ToDoubleFunction<? super T>);
    
    }
    ```
    

## Methods :

| Modifier and Type | Method and Description |
| --- | --- |
| boolean | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#equals-java.lang.Object-(https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html obj)Indicates whether some other object is "equal to" this comparator. |
| int | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#compare-T-T-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html o1, https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html o2)Compares its two arguments for order. |
| static methods |  |
| static <T,U extends https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html<? super U>>https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html<? super T,? extends U> keyExtractor)Accepts a function that extracts a https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html sort key from a type T, and returns a Comparator<T> that compares by that sort key. |
| static <T,U> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html<? super T,? extends U> keyExtractor, https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super U> keyComparator)Accepts a function that extracts a sort key from a type T, and returns a Comparator<T> that compares by that sort key using the specified https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html. |
| static <T> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparingInt-java.util.function.ToIntFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntFunction.html<? super T> keyExtractor)Accepts a function that extracts an int sort key from a type T, and returns a Comparator<T> that compares by that sort key. |
| static <T> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparingLong-java.util.function.ToLongFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongFunction.html<? super T> keyExtractor)Accepts a function that extracts a long sort key from a type T, and returns a Comparator<T> that compares by that sort key. |
| static <T> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparingDouble-java.util.function.ToDoubleFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleFunction.html<? super T> keyExtractor)Accepts a function that extracts a double sort key from a type T, and returns a Comparator<T> that compares by that sort key. |
| static <T extends https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html<? super T>>https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#naturalOrder--()Returns a comparator that compares https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html objects in natural order. |
| static <T extends https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html<? super T>>https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#reverseOrder--()Returns a comparator that imposes the reverse of the natural ordering. |
| static <T> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#nullsFirst-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super T> comparator)Returns a null-friendly comparator that considers null to be less than non-null. |
| static <T> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<T> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#nullsLast-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super T> comparator)Returns a null-friendly comparator that considers null to be greater than non-null. |
| default methods |  |
| default https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#reversed--()Returns a comparator that imposes the reverse ordering of this comparator. |
| default https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparing-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> other)Returns a lexicographic-order comparator with another comparator. |
| default <U extends https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html<? super U>>https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparing-java.util.function.Function-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html,? extends U> keyExtractor)Returns a lexicographic-order comparator with a function that extracts a Comparable sort key. |
| default <U> https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparing-java.util.function.Function-java.util.Comparator-(https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html,? extends U> keyExtractor, https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<? super U> keyComparator)Returns a lexicographic-order comparator with a function that extracts a key to be compared with the given Comparator. |
| default https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparingDouble-java.util.function.ToDoubleFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleFunction.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> keyExtractor)Returns a lexicographic-order comparator with a function that extracts a double sort key. |
| default https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparingInt-java.util.function.ToIntFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntFunction.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> keyExtractor)Returns a lexicographic-order comparator with a function that extracts a int sort key. |
| default https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html<https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> | https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparingLong-java.util.function.ToLongFunction-(https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongFunction.html<? super https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html> keyExtractor)Returns a lexicographic-order comparator with a function that extracts a long sort key. |

## Example :

- Example : Method Implementation
    
    ```java
    import java.util.*;
    import java.util.function.Function;
    
    class Book {
        String title;
        int price;
        double rating;
    
        Book(String title, int price, double rating) {
            this.title = title;
            this.price = price;
            this.rating = rating;
        }
    	public int getPrice() {
            return price;
        }
    
        public double getRating() {
            return rating;
        }
    
        @Override
        public String toString() {
            return "{Title: " + title + ", Price: " + price + ", Rating: " + rating + "}\n";
        }
    }
    
    public class Main {
        public static void main(String[] args) 
    	{
            List<Book> books = new ArrayList<>();
            books.add(new Book("Java Programming", 500, 4.5));
            books.add(new Book("Python Basics", 300, 4.8));
            books.add(new Book("C++ Primer",  400, 4.0));
    				books.add(new Book("Python Advanced", 300, 4.5));
            books.add(new Book("Data Structures Basics", 350, 4.2));
    				books.add(new Book("Data Structures Advanced", 350, 4.0));
            books.add(new Book("Algorithms I", 450, 4.7));
    				books.add(new Book("Algorithms II", 500, 4.7));
    
            // Basic comparison by price (comparingInt)
            Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);
            books.sort(byPrice);
            System.out.println("Sorted by price: \n" + books);
    
            // Reverse order () 
            Comparator<Book> byPriceReversed = byPrice.reversed();
            books.sort(byPriceReversed);
            System.out.println("Sorted by price (reversed): \n" + books);
    
            //  Then comparing by title
            Comparator<Book> byPriceThenTitle = byPrice.thenComparing(book -> book.title);
            books.sort(byPriceThenTitle);
            System.out.println("Sorted by price, then by title: \n" + books);
    
            // Comparing by rating, then by price
            Comparator<Book> byRatingThenPrice = Comparator.comparingDouble(Book::getRating).thenComparingInt(Book::getPrice);
            books.sort(byRatingThenPrice);
            System.out.println("Sorted by rating, then by price: \n" + books);
    
            // Comparing by title using a custom comparator
            Comparator<Book> bytitle = Comparator.comparing(book -> book.title, Comparator.nullsFirst(String::compareTo));
            books.sort(bytitle);
            System.out.println("Sorted by title (nulls first): \n" + books);
    
            //reverseOrder and NaturalOrder  works with classes that implements comparables i.e have a nautural ordering like Integers
            
    		
            // Comparing by multiple attributes
            Comparator<Book> byMultipleAttributes = Comparator.comparingInt(Book::getPrice)
                .thenComparingDouble(Book::getRating)
                .thenComparing(book -> book.title);
            books.sort(byMultipleAttributes);
            System.out.println("Sorted by price, then rating, then title: \n" + books);
        }
    }
    
    /* OUTPUT
    Sorted by price: 
    [{Title: Python Basics, Price: 300, Rating: 4.8}
    , {Title: Python Advanced, Price: 300, Rating: 4.5}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: Java Programming, Price: 500, Rating: 4.5}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    ]
    Sorted by price (reversed): 
    [{Title: Java Programming, Price: 500, Rating: 4.5}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    , {Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: Python Basics, Price: 300, Rating: 4.8}
    , {Title: Python Advanced, Price: 300, Rating: 4.5}
    ]
    Sorted by price, then by title: 
    [{Title: Python Advanced, Price: 300, Rating: 4.5}
    , {Title: Python Basics, Price: 300, Rating: 4.8}
    , {Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    , {Title: Java Programming, Price: 500, Rating: 4.5}
    ]
    Sorted by rating, then by price: 
    [{Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: Python Advanced, Price: 300, Rating: 4.5}
    , {Title: Java Programming, Price: 500, Rating: 4.5}
    , {Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    , {Title: Python Basics, Price: 300, Rating: 4.8}
    ]
    Sorted by title (nulls first): 
    [{Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: Java Programming, Price: 500, Rating: 4.5}
    , {Title: Python Advanced, Price: 300, Rating: 4.5}
    , {Title: Python Basics, Price: 300, Rating: 4.8}
    ]
    Sorted by price, then rating, then title: 
    [{Title: Python Advanced, Price: 300, Rating: 4.5}
    , {Title: Python Basics, Price: 300, Rating: 4.8}
    , {Title: Data Structures Advanced, Price: 350, Rating: 4.0}
    , {Title: Data Structures Basics, Price: 350, Rating: 4.2}
    , {Title: C++ Primer, Price: 400, Rating: 4.0}
    , {Title: Algorithms I, Price: 450, Rating: 4.7}
    , {Title: Java Programming, Price: 500, Rating: 4.5}
    , {Title: Algorithms II, Price: 500, Rating: 4.7}
    ]
    */
    ```
    
- Example : Custom Comperator Implementation
    
    ```java
    import java.util.*;
    
    // Custom Sorting
    
    class Student{
        int marks;
        int age;
        String name;
    
        Student(int marks , int age , String name){
            this.marks = marks;
            this.age = age;
            this.name = name;
        }
    
        public String toString(){
            return "{ Name: " + name +" , Age: " + age + " , Marks: " + marks +"}" ;  
        }
    
    }
    
    //comparator is used in the classes which we cannot access likr util classes and other classes
    //comparator creation
    class customcomparator implements Comparator<Student>{
    
        //age bases comparision
        public int compare(Student a , Student b){
            if(a.age > b.age){
                return 1;
            }
            else{
                return -1;
            }
        } 
    }
    
    public class Main
    {
        public static void main(String[] args) 
        {
            
            Student s1 = new Student(69, 22, "Kumar");
            Student s2 = new Student(72, 21, "Gussain");
            Student s3 = new Student(60 , 20 , "Prasad");
            System.out.println(s2);
    
    		ArrayList<Student> list  = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            
            System.out.println("Original list :" + list);
    
    		
            //Using Comparators
            // method 1
            //using a class (which implement the comparator  interface ) comparator
            customcomparator c1 = new customcomparator();
    
            // method 2
            // using a functional interface object (annonymous class )
    
            Comparator<Student> cp = new Comparator<>(){
    
                public int compare(Student a , Student b){
                    if(a.marks > b.marks)
                        return 1;
                    else
                        return -1;
                    
                }
            };
            
            //shorten formed 
            Comparator<Student> cp2 = (Student a , Student b) -> {
                    if(a.age > b.age)
                        return 1;
                    else
                        return -1;
    
                };
    
            Collections.sort(list , c1);
            System.out.println("Age Comparator :"+ list);
            
        
            Collections.sort(list , cp);
            System.out.println("Marks Comparator :"+ list);
            
            //direct substitution
            Collections.sort(list,(Student a , Student b)->{
                if(a.age > b.age)
                    return 1;
                else
                    return -1;
    
            });
            System.out.println("Age Comarator : "+ list);
           
        }
    }
    
    /*
    { Name: Gussain , Age: 21 , Marks: 72}
    Original list :[{ Name: Kumar , Age: 22 , Marks: 69}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Prasad , Age: 20 , Marks: 60}]
    Age Comparator :[{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Kumar , Age: 22 , Marks: 69}]
    Marks Comparator :[{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Kumar , Age: 22 , Marks: 69}, { Name: Gussain , Age: 21 , Marks: 72}]
    Age Comarator : [{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Kumar , Age: 22 , Marks: 69}]
    */
    ```