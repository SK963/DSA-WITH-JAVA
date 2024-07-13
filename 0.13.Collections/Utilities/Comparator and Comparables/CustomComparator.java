import java.util.*;

// Custom Sorting


class Student
{
    int marks;
    int age;
    String name;

    Student(int marks , int age , String name)
    {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "{ Name: " + name +" , Age: " + age + " , Marks: " + marks +"}" ;  
    }


}


//comparator is used in the classes which we cannot access liked util classes and other classes
//comparator creation
class customcomparator implements Comparator<Student>
{

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



public class CustomComparator
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