import java.util.Scanner;

class Example implements Runnable{
	
	public void run()
	{
		try{
		for(int i = 0 ; i< 3 ; i++)
		{
			System.out.println("Thread is running");
			Thread.sleep(2000);
		}
		}
		catch(Exception e)
			{
				System.out.println("Thread is interrupted.");
			}

		
	}
	
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Main thread is running");
		Example e = new Example();
		Thread t = new Thread(e);
		t.start();
		t.interrupt();
		System.out.println("Main thread ended");
	}
}
