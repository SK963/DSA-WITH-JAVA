
class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
        }
    }
}


public class NonStaticInnerClassExample {

    class Address0 {
        String city;
        String state;
        int Pincode;

        public void details0() {
            System.out.println("inside Address0-> details0() ");
        }
    }


    public static void main(String[] args) {

        //Ex 1
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();

        //Ex2
        NonStaticInnerClassExample ex1 = new NonStaticInnerClassExample();
        NonStaticInnerClassExample.Address0 a1 = ex1.new Address0();
        a1.details0();

       
    }
}
