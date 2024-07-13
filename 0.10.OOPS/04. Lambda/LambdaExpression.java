// Functional interface with a single abstract method
@FunctionalInterface
interface MyInterface {
    void myMethod();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda expression implementing the abstract method of MyInterface
        MyInterface myInterface = () -> System.out.println("Hello Lambda!");

        // Calling the method using the lambda expression
        myInterface.myMethod();
    }
}