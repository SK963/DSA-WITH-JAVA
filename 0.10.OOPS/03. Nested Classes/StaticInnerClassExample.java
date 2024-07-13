

class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}


public class StaticInnerClassExample {

    // Static inner class
    static class Address{
        String city;
        String state;
        int Pincode;

        public void details() {
            System.out.println("The Address detail of the person : ");
        }
    }


    

    public static void main(String[] args) {

        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();

        // StaticNestedClass nestedObject2 = new StaticNestedClass(); // uscommenting this line throw error 


         // Creating an instance of static nested class inside the outer class directly
        Address a1 = new Address();
        a1.details();

        //Creeting an instance of static inner class with class name
         StaticInnerClassExample.Address a2 = new StaticInnerClassExample.Address();
         a2.details();


    }
    
}
