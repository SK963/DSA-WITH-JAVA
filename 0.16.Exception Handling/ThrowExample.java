

public class ThrowExample {
    
		public void a() throws Exception{
			b();
		}
		public void b() throws Exception{
			int num1 = 9;
			int num2 = 0;

			int result = num1 / num2;
			System.out.println(result);
		}

		public static void main(String[] args){
			ThrowExample obj = new ThrowExample();
			try{
				obj.a();
			}
			catch(Exception e){
				System.out.println("error "+ e) ;
			}
		}
	
		
    
}
