/*
 A local inner class is defined within a method.
  It is local to the block of code in which it is defined.
*/


class OuterClass {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}

public class LocalInnerClassExample {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.outerMethod();
    }
}

