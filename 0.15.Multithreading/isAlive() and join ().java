import java.util.Scanner;


class printing implements Runnable{
	public void run(){
		System.out.println("Thread started");

		try{
		for(int i = 0 ; i< 10 ; i++)
			{
				System.out.println("tick tock bitch");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
			{
				System.out.println("Some problem occured");
				System.out.println(e);
			}

		System.out.println("Thread ended");
		
	
	}
	
}

public class Main {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Main thread Started");

		// printing p = new printing();

		Thread t = new Thread(new printing());
		System.out.println(t.isAlive()); //false
		t.start();
		System.out.println(t.isAlive());//false
		// t.join();

		System.out.println("Main thread ended");	 
	}
}
