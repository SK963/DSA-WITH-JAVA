enum Status{
	Running, Failed , Pending , Success;
}


public class ConditionalsWithEnums{
	public static void main(String args[]){

		Status s = Status.Success;

		
		if(s == Status.Running)
			System.out.println("All good");
		else if(s == Status.Failed)
			System.out.println("Try Again");
		else if(s == Status.Pending)
			System.out.println("Please Wait");
		else
			System.out.println("Done");



		switch(s)
			{
				case Running:
					System.out.println("All good");
					break;
				case Failed :
					System.out.println("Try Again");
					break;
				case Pending:
					System.out.println("Please Wait");
					break;
				default:
					System.out.println("Done");
					break;
			}


		
		
	}
}