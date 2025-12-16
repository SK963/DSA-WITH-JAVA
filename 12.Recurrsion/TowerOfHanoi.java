import java.util.*;

public class TowerOfHanoi {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int disk = sc.nextInt();
		toh(disk , 'A' , 'C' , 'B');

		sc.close();

		
		
	}

	public static void toh(int n , char from  , char to , char aux){

		if(n== 0)
			return;
			
		
		toh(n-1 , from , aux , to);
		System.out.println("move disk "+ n + " from " + from + " to " + to);
		toh(n-1, aux , to , from);
	}
}

//sample input
//3

//sample output
// move disk 1 from A to C
// move disk 2 from A to B
// move disk 1 from C to B
// move disk 3 from A to C
// move disk 1 from B to A
// move disk 2 from B to C
// move disk 1 from A to C
