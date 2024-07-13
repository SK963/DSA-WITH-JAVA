
/* 
an abstract class is a class that cannot be instantiated on its own 
and contain abstract methods (methods without a body). 
Abstract classes are used to provide a common base for multiple related classes.
abstract classes may contains any non abstract methods too
*/



abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    public abstract void sound();
    
    // Non-abstract method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // This would cause a compilation error

        // Creating reference variables of type Animal
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Using the reference variables
        myDog.sound(); // Outputs: Woof!
        myDog.sleep(); // Outputs: This animal is sleeping.
        
        myCat.sound(); // Outputs: Meow!
        myCat.sleep(); // Outputs: This animal is sleeping.
    }
}

/*
Woof!
This animal is sleeping.
Meow!
This animal is sleeping.
*/