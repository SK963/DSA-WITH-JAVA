class Library implements Runnable {

	String res1 = "Java";
	String res2 =  "Cpp";
	String res3 = "Python";
	public void run(){
	String name = Thread.currentThread().getName();
	if(name.equals("STUDENT-1")){
	try{
		Thread.sleep(3000);
		synchronized(res1){
			System.out.println("Student 1 has acc "+ res1);
			Thread.sleep(3000);
			synchronized(res2){
				System.out.println("Student 1 has acc "+ res2);
				Thread.sleep(3000);
				synchronized(res2){
					System.out.println("Student 1 has acc "+ res3);
					Thread.sleep(3000);
				}
			}
		}
	}
	catch(Exception e){
		
		System.out.println("encounterd problem : " + e);
	}}
	else{
		try{
		Thread.sleep(3000);
		synchronized(res1){
			System.out.println("Student 2 has acq "+ res1);
			Thread.sleep(3000);
			synchronized(res2){
				System.out.println("Student 2 has acq "+ res2);
				Thread.sleep(3000);
				synchronized(res3){
					System.out.println("Student 2 has acq "+ res3);
					Thread.sleep(3000);
				}
			}
		}
	}
	catch(Exception e){
		
		System.out.println("encounterd problem : " + e);
	}
		
	}
	
	}
	
}



public class DeadLock {
    public static void main(String[] args){
		Library lib = new Library();
		Thread t1 = new Thread(lib);
		Thread t2 = new Thread(lib);

		t1.setName("STUDENT-1");
		t2.setName("STUDENT-2");
		
		t1.start();
		t2.start();

	}
	
}