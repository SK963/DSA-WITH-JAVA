interface MyInterface {

    // Abstract method (implicitly public) - static and final 
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
        privateMethod(); // Calling private method
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

class MyClass implements MyInterface {

    // Implementation of the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }
}

public class InterfaceMethodsTypes {
    public static void main(String[] args) 
    {
        MyClass myClass = new MyClass();

        // Calling the abstract method
        myClass.abstractMethod();

        // Calling the default method
        myClass.defaultMethod();

        // Calling the static method  using the interface name
        MyInterface.staticMethod();

        // MyClass.staticMethod(); // static methods are not inherited
    }
}
