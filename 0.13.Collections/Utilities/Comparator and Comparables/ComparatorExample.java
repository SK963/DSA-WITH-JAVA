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

public class ComparatorExample {
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

        // 1. Basic comparison by price (comparingInt)
        Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);
        books.sort(byPrice);
        System.out.println("Sorted by price: \n" + books);


        // 2. Reverse order () 
        Comparator<Book> byPriceReversed = byPrice.reversed();
        books.sort(byPriceReversed);
        System.out.println("Sorted by price (reversed): \n" + books);

        // 3. Then comparing by title
        Comparator<Book> byPriceThenTitle = byPrice.thenComparing(book -> book.title);
        books.sort(byPriceThenTitle);
        System.out.println("Sorted by price, then by title: \n" + books);

        // 4. Comparing by rating, then by price
        Comparator<Book> byRatingThenPrice = Comparator.comparingDouble(Book::getRating).thenComparingInt(Book::getPrice);
        books.sort(byRatingThenPrice);
        System.out.println("Sorted by rating, then by price: \n" + books);

        // 5. Comparing by title using a custom comparator
        Comparator<Book> bytitle = Comparator.comparing(book -> book.title, Comparator.nullsFirst(String::compareTo));
        books.sort(bytitle);
        System.out.println("Sorted by title (nulls first): \n" + books);

        //reverseOrder and NaturalOrder  works with classes that implements comparables i.e have a nautural ordering like Integers
        
		
        // 7. Comparing by multiple attributes
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