enum Status{
	Running, Failed , Pending , Success;
}


public class EnumExample{
	public static void main(String args[]){
		//creating a single instance of enum
		Status s = Status.Running;
		//printing the value of enum
		System.out.println(s);
		//printing the int value of a enum 
		System.out.println(s.ordinal());
		

		// creating a array of all enum named constants

		Status[] arr = Status.values();

		System.out.println("the array of all enum named constants");
		for(Status ss : arr)
			System.out.println(ss + ":" + ss.ordinal());

		


		
		
	}
}