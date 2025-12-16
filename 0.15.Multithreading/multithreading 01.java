public class Main {
    public static void main(String[] args) {
        // Get the current thread name
		String name = Thread.currentThread().getName();
		System.out.println("name of the current thread: "+ name);

		// priority of a thread
		System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());
		
        Thread mt = Thread.currentThread();
        System.out.println("Main Thread Name: " + mt.getName());
		
		// changing the name of the main thread

		mt.setName("Main Thread");
		System.out.println("Main Thread Name: " + mt.getName());

		//changing the priority of the main thread
		mt.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main Thread Priority: " + mt.getPriority());
		
			
		
    }
}
