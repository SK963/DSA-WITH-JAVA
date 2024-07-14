class OuterClass {

    private String outerField = "Outer Field";

    public void outerMethod() {
    

        System.out.println("Outer Method" ); 
        

        // Local inner class
        class LocalInnerClass {
            private String innerField = "Inner Field";

            public void display() {

                // Accessing inner class members
                System.out.println("Inner Field: " + innerField);
                innerMethod();

                // Accessing outer class members
                System.out.println("Outer Field: " + outerField);
                outerMethod(); // This will cause a stack overflow if called recursively

                
            }

            public void innerMethod() {
                System.out.println("Inner Method");
            }
        }

        // Creating an instance of the local inner class
        LocalInnerClass localInnerInstance = new LocalInnerClass();
        // Calling the display method of the local inner class
        localInnerInstance.display();
    }

    
}


public class LocalInnerClassExample{
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerInstance = new OuterClass();
        // Calling the outer method which contains the local inner class
        outerInstance.outerMethod();
    }
}

/* recursive
Outer Method
Inner Field: Inner Field
Inner Method
Outer Field: Outer Field
Outer Method
Inner Field: Inner Field
Inner Method
Outer Field: Outer Field
Outer Method
Inner Field: Inner Field
Inner Method
Outer Field: Outer Field
Outer Method
 */