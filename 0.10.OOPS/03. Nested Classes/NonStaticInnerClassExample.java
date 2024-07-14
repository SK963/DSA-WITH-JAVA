
class OuterClass {

    private String outerField = "Outer Field";

    private String commonfield = "Common Outer Field";

    public void outerMethod() {
        System.out.println("Inside Outer Method");
    }

    public class InnerClass {
        private String innerField = "Inner Field";

        private String commonfield = "Common Inner Field";

        public void display() {
            // Accessing outer class members
            System.out.println("Outer Field: " + outerField);
            //Accessing outer class method
            outerMethod();

            // Accessing inner class members
            System.out.println("Inner Field: " + innerField);
            innerMethod();

            //Accessing Common Field
            System.out.println("Inner Common Field :" + commonfield);
            System.out.println("Outer Common Field :" + OuterClass.this.commonfield);
        }

        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

    
}

public class NonStaticInnerClassExample{
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerInstance = new OuterClass();

        // Creating an instance of the inner class
        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();

        // Calling the display method of the inner class
        innerInstance.display();
    }
    
}



/*
 Output :
 Outer Field: Outer Field
Inside Outer Method
Inner Field: Inner Field
Inner Method
Inner Common Field :Common Inner Field
Outer Common Field :Common Outer Field
,
 */ 
