class MyException extends Exception{
	public MyException(){}
	public MyException(String s){
		super(s); //passing message to parent class
	}
	
}

public class CustomeException {
    
		public static void main(String[] args){
			int num1 = 6;
			int num2 = -2 ;
			try{
			if(num2 < 0){
				Exception e = new MyException("cannot divide by negative number");
				throw e;
				
			}
			else{
				int result = num1/num2;
				System.out.println(result);
			}
			}
			catch(Exception e){
				System.out.println("Enter a valid number :"+e);
			}
			
			

			
		}

	// output
	// Enter a valid number :java.lang.ArithmeticException: cannot divide by negative number

	
    
}
