abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
    public void fetch() {
        System.out.println("Dog is fetching!");
    }
}

interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("MyClass method");
    }
    public void specificMethod() {
        System.out.println("Specific method");
    }
}

public class InterfaceReferenceUse {
    public static void main(String[] args) 
	{
        // Abstract class reference limitation
        Animal animal = new Dog();
        animal.sound(); // OK
        animal.sleep(); // OK
        // animal.fetch(); // Compilation error
        
        // Requires casting to access subclass-specific methods
        ((Dog) animal).fetch(); // OK, but casting required

        // Interface reference limitation
        MyInterface myInterface = new MyClass();
        myInterface.myMethod(); // OK
        // myInterface.specificMethod(); // Compilation error
        
        // Requires casting to access implementing class-specific methods
        ((MyClass) myInterface).specificMethod(); // OK, but casting required
    }
}

/* OUTPUT
Woof!
This animal is sleeping.
Dog is fetching!
MyClass method
Specific method
*/