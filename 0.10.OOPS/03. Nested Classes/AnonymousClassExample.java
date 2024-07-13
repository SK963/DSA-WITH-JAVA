
/*
A class without a name, used to create a single instance, 
often used for implementing interfaces or abstract classes 
with single abstract  method

 */


 
interface Car{
    void drive();
}

abstract class Animal {
    abstract void makeSound();
}


public class AnonymousClassExample{
    public static void main(String[] args) {
        
        Car obj = new Car(){
            public void drive(){
                System.out.println("Driving...");
            }
        };
        obj.drive();


        Animal myAnimal = new Animal() {
            void makeSound() {
                System.out.println("Animal is making a sound");
            }
        };
        myAnimal.makeSound();

    }
    
}
