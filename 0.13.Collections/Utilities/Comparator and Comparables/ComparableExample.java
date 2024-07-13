import java.util.*;

//there are three ways of implementing default comparision order of objects 
//01. implementing comparable interface
//02. using comparator class default comparators
//
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

public class ComparableExample
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

        
        System.out.println("Original teahers list: "+ teacherlist);

        Collections.sort(teacherlist);
        System.out.println("sorted teahers list: "+ teacherlist);
       
    }
}


/*
Original teahers list: [{ Name: Prasad , Experience: 8 , Salary: 300000}, { Name: Gussain , Experience: 7 , Salary: 45000}, { Name: Kumar , Experience: 6 , Salary: 40000}]
sorted teahers list: [{ Name: Kumar , Experience: 6 , Salary: 40000}, { Name: Gussain , Experience: 7 , Salary: 45000}, { Name: Prasad , Experience: 8 , Salary: 300000}]

*/