public class ObjectExample implements Cloneable {
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Object is being garbage collected");
        } finally {
            super.finalize();
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ObjectExample mainObject = new ObjectExample();
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        // getClass() method
        System.out.println("Class of obj1: " + obj1.getClass());
        
        // hashCode() method
        System.out.println("Hash code of obj1: " + obj1.hashCode());
        System.out.println("Hash code of obj2: " + obj2.hashCode());
        
        // equals() method
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
        System.out.println("obj1 equals obj1: " + obj1.equals(obj1));
        
        // toString() method
        System.out.println("String representation of obj1: " + obj1.toString());
        
        // clone() method
        try {
            ObjectExample clonedObject = (ObjectExample) mainObject.clone();
            System.out.println("Cloned object: " + clonedObject.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // notify() and wait() methods
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1 is waiting.");
                    lock.wait();
                    System.out.println("Thread 1 resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is notifying.");
                lock.notify();
            }
        });

        t1.start();
        try {
            Thread.sleep(100); // Ensuring t1 gets the lock and goes into wait state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        
        // notifyAll() method
        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 3 is waiting.");
                    lock.wait();
                    System.out.println("Thread 3 resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 4 is waiting.");
                    lock.wait();
                    System.out.println("Thread 4 resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t3.start();
        t4.start();

        new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(100); // Ensuring t3 and t4 go into wait state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Notifying all waiting threads.");
                lock.notifyAll();
            }
        }).start();

        // wait() method with timeout
        new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting with timeout.");
                    lock.wait(1000); // Wait for 1 second
                    System.out.println("Thread resumed after wait with timeout");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Suggest garbage collection
        ObjectExample obj = new ObjectExample();
        obj = null;
        System.gc(); // Suggesting garbage collection
        
        // Pause main thread to allow other threads to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
