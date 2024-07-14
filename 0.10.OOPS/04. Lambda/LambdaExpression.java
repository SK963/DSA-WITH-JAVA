// Functional interface with a single abstract method
@FunctionalInterface
interface MyInterface {
    void myMethod();
}

public class LambdaExpression {
    public static void main(String[] args) {

        // usual implementation using anonymous class
        MyInterface obj = new MyInterface(){
            public void myMethod(){
                System.out.println("inside the mymethod of the functional interface");
            }
        };
        obj.myMethod();

        // Lambda expression implementing the abstract method of MyInterface
        MyInterface myInterface = () -> System.out.println("inside the mymethod of the functional interface");

        // Calling the method using the lambda expression
        myInterface.myMethod();
    }
}

/*
output :
inside the mymethod of the functional interface
inside the mymethod of the functional interface

 */