interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class MyClass implements B 
{
    @Override
    public void methodA() {
        System.out.println("Implementing methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementing methodB");
    }
}


public class ImplementingInterface {


    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
    
    
}
