import java.util.*;

class Student {
    int marks;
    int age;
    String name;

    Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "{ Name: " + name + " , Age: " + age + " , Marks: " + marks + "}";
    }
}

//implementing comparator in a separate class
class customcomparator implements Comparator<Student> {
    // age based comparison
    public int compare(Student a, Student b) {
        return Integer.compare(a.age, b.age); // return -1 (a is less), 0 (equal), 1 (a is greater)
    }
}

public class CustomComparatorExample {
    public static void main(String[] args) {
        Student s1 = new Student(69, 22, "Kumar");
        Student s2 = new Student(72, 21, "Gussain");
        Student s3 = new Student(60, 20, "Prasad");

        // Using Comparators

        //Method 1
        // Age Comparator (c1): using the class which implements the comparator interface
        customcomparator c1 = new customcomparator();

        // Method 2
        // Marks Comparator (c2):  implementation as a using anonymous class
        Comparator<Student> c2 = new Comparator<>() {
            public int compare(Student a, Student b) {
                return Integer.compare(a.marks, b.marks);
            }
        };

        // Method 3
        // Age Comparator as lambda (c3): Using lambda Expression for the implementation of the comparator interface
        Comparator<Student> c3 = (Student a, Student b) -> Integer.compare(a.age, b.age);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Original list: " + list);

        Collections.sort(list, c1);
        System.out.println("Age Comparator: " + list);

        Collections.sort(list, c2);
        System.out.println("Marks Comparator: " + list);

        Collections.sort(list, c3);
        System.out.println("Age Comparator as lambda: " + list);

        //Method 4 :  direct substitution of the lambda expression in place of its reference in the function itself
        Collections.sort(list, (Student x, Student y) ->  Integer.compare(x.marks, y.marks));

        System.out.println("Marks Comparator as lambda: " + list);
    }
}

/*
Output
Original list: [{ Name: Kumar , Age: 22 , Marks: 69}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Prasad , Age: 20 , Marks: 60}]
Age Comparator: [{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Kumar , Age: 22 , Marks: 69}]
Marks Comparator: [{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Kumar , Age: 22 , Marks: 69}, { Name: Gussain , Age: 21 , Marks: 72}]
Age Comparator as lambda: [{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Gussain , Age: 21 , Marks: 72}, { Name: Kumar , Age: 22 , Marks: 69}]
Marks Comparator as lambda: [{ Name: Prasad , Age: 20 , Marks: 60}, { Name: Kumar , Age: 22 , Marks: 69}, { Name: Gussain , Age: 21 , Marks: 72}]

 */
