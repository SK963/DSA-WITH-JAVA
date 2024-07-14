
/*
A class without a name, used to create a single instance, 
often used for implementing interfaces or abstract classes 
with s

 */


 
interface Car{
    void drive();
    void anotherfunction();
}

abstract class Animal {
    abstract void makeSound();
    abstract void anotherfunction();
}

@FunctionalInterface
interface functional{
    void method();
    // void anotherfunction(); uncommenting this line throw error 
}


public class AnonymousClassExample{
    public static void main(String[] args) {
        //implementing interface
        Car obj = new Car(){
            public void drive(){
                System.out.println("Driving...");
            }

            public void anotherfunction(){
                System.out.println("another function implementation");
            }
        };
        obj.drive();

        // lamda expression impementaion
        functional obj2 = () -> System.out.println("inside the functional interface mehtod");
        obj2.method();

        
        
        //extending  class
        Animal myAnimal = new Animal() {
            void makeSound() {
                System.out.println("Animal is making a sound");
            }
            void anotherfunction(){
                System.out.println("another function implementation");
            }
        };
        myAnimal.makeSound();

        //Lamda Expression is not allowed for abstract classes
        // Animal cat = () -> System.out.println("Cat is making sound");

    }
    
}
