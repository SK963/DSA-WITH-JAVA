class MyThread extends Thread 
{
    public void run() 
	{
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try
			{
                Thread.sleep(1000); // Pause for 1 second
            } 
			catch (InterruptedException e) 
			{
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // Start the thread
    }
}
