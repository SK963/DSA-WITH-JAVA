public class LangObjectExample {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // Creating two objects
        Object obj1 = new Object();
        Object obj2 = new Object();

        // getClass()
		System.out.println("Class of obj1: " + obj1.getClass());
        System.out.println("Class of obj1: " + obj1.getClass().getName());

        // hashCode()
        System.out.println("HashCode of obj1: " + obj1.hashCode());

        // equals()
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

        // toString()
        System.out.println("obj1 toString: " + obj1.toString());

        // clone() - Requires a class to implement Cloneable interface
        CloneableClass original = new CloneableClass(42);
        CloneableClass cloned = (CloneableClass) original.clone();
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        // notify() and wait()
        Object lock = new Object();
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting.");
                    lock.wait();
                    System.out.println("Thread is notified.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        Thread.sleep(1000); // Pause for a moment to ensure thread starts waiting

        synchronized (lock) {
            System.out.println("Main thread notifying.");
            lock.notify();
        }

        thread.join(); // Wait for the thread to finish
    }
}

class CloneableClass implements Cloneable {
    private int value;

    public CloneableClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneableClass{" + "value=" + value + '}';
    }
}
/*

Class of obj1: class java.lang.Object
Class of obj1: java.lang.Object
HashCode of obj1: 2016447921
obj1 equals obj2: false
obj1 toString: java.lang.Object@78308db1
Original: CloneableClass{value=42}
Cloned: CloneableClass{value=42}
Thread is waiting.
Main thread notifying.
Thread is notified.

*/