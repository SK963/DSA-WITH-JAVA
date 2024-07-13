import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFastExample {
    public static void main(String[] args) 
    {
        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
		
		//Normal.loop 
		System.out.println("ArrayList: ");
		for(int i = 0 ; i < arrayList.size() ; i++){
			System.out.println(arrayList.get(i));
			// arrayList.add("Grapes"); // will run infinite times 
		}

		//fail fast due to concurrent modification on iterators and foreach loop 
		//iterator
		System.out.println("ArrayList: ");
		Iterator<String> it = arrayList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			// arrayList.add("Grapes") // gives error of concurrent modification exception
		}
		

		//for each loop
        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
			// arrayList.add("Grapes"); //will give error of concurent modification exception
		
        }

		

		//achieving fail safe 
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Modifying the list while iterating
            list.add("Date");
        }

		 System.out.println("\nFinal list: " + list);
		
		
       
    }
}

/*OUTPUT

ArrayList: 
Apple
Banana
Cherry
ArrayList: 
Apple
Banana
Cherry
ArrayList:
Apple
Banana
Cherry
Apple
Banana
Cherry

Final list: [Apple, Banana, Cherry, Date, Date, Date]
*/