import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
		int num  = 0;
		Scanner sc = new Scanner(System.in);
		

		
        try {
			num = sc.nextInt();
			//sc.close(); //way 1
		}
		catch(Exception e){
			System.out.println("please enter a number");
			// sc.close();  //way 1
		}
		finally{
			sc.close();  //way 2
			System.out.println("Resource closed");
		}

		System.out.println(num);
		
    }
}

//input : not a integer
//output :
// please enter a number
// Resource closed
// 0
