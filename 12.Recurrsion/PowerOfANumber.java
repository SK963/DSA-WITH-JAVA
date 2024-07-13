
public class PowerOfANumber 
{
	public  int power(int a , int b){

		int mid = 0  , result  = 0 , finalresult = 0;
		if (b == 1)
			return a;
		else{
				 mid = b/2;
				result = power(a,mid);
				finalresult = result * result;
				if(b%2 == 0){
					return finalresult;
				}
				else
					return a *finalresult;
		}
	}

	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;

		PowerOfANumber pwn  = new PowerOfANumber();
		System.out.println(pwn.power(a,b)); 
		
	}

}
