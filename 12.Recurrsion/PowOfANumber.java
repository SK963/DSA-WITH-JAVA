
public class PowOfANumber {

	//Brtue force (recurssive): T :O(N) , S :O(1)
	public static double  myPow(double x , int n){

		if(n < 0){
			double temp = myPow(x, Math.abs(n));
			return 1D/temp;
		}
		else{
			if(n == 0){
				return 1;
			}
			return x * myPow(x, n-1);
		}
		
	}
	
	//Brute force (iterative) : T :O(N) , S :O(1) 
	// Time limit exceeded for edge case : -2147483648 & 2147483648
	public static double  myPow2(double x , int n){

		long absN = n;
		if(absN<0)absN *= -1;

		double result = 1D;

		for(int i = 0; i < absN; i++)
			result *= x;
		

		if(n < 0)result = (double) 1/ (double)result;
		return result;
		
	}

	//int cause problem for edge case : -2147483648 so convert n to long
	static class Solution {
		public double myPow(double x, long n) {
			if(n<0) return 1/myPow(x, Math.abs(n));
			else{
				if(n == 0) return 1;
				double temp = myPow(x, n/2);
				if(n % 2 == 0) return temp * temp;
				else return x * temp * temp;
			}
			
		}
	}
	
	// iterative : T :O(logN) , S :O(1)
	public static double myPow3(double x, int n) {
		double ans = 1.0;
		long nn = n;

		if (nn < 0) nn *= -1;

		while (nn > 0) {
		  if (nn % 2 == 1) {
			ans = ans * x;
			nn = nn - 1;
		  } else {
			x = x * x;
			nn = nn / 2;
		  }
		}

		if (n < 0) ans = 1D / ans;
		return ans;

	  }



	  // another way : using logical and shift  operator
	  // T :O(logN) , S :O(1)
	  public static double myPow4(double x, int n) {

		if(n < 0){
			n = -n;
			x = 1 / x;
		}
		
		double pow = 1;
		
		while(n != 0){
			if((n & 1) != 0){ //checke if n is odd or not 
				pow *= x;  //if odd then multiply x with pow
			} 
				
			x *= x;
			n >>>= 1; //divides n = n/2; (>>> is used to handle negative numbers) 
			
		}
		
		return pow;
	}
	

	
	public static void main(String[] args) {
		
		System.out.println(myPow3(2D,2)); //4.0
		System.out.println(myPow3(2D,10)); //1024.00000
		System.out.println(myPow3(2.1D,3));//9.26100
		System.out.println(myPow3(2D,-2));  // 0.25
		System.out.println(myPow3(0.00001D,2147483647));  // 0.0
		System.out.println(myPow3(2D,-2147483648));  // 0.0 
		
	}

}
