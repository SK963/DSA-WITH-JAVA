import java.util.*;

public class TryCatchExample {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = 0;

		try{
			result = num1/num2;
			//the statements after the error throwing statement will not be executed
			System.out.println("in try block");
		}
		catch(Exception e){
			System.out.println("Something went wrong..."+ e);
		}

		System.out.println(result);

		sc.close();
	}
}

//input 1
//6
//2
// output
// in try block
// 3



//input 2
// 6
// 0
// output
// Something went wrong...java.lang.ArithmeticException: / by zero
// 0
