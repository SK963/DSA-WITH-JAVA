


public class CoinChangeProblem {

	
	static int countways(int coins[] , int n , int sum){
		int table[] = new int[sum+1];
		table[0] = 1;

		for(int i = 0 ; i< n ; i++){
			for(int j = coins[i] ; j<= sum ; j++){
				table[j] += table[j-coins[i]];
			}
		}

		System.out.print("the table arrary looks like: ");
		for(int i = 0 ; i< table.length ; i++)
			System.out.print(table[i]+ " ");

		System.out.println();
		
		return table[sum];
	}



	public static void main(String[] args) 
	{ 
		int coins[] = {2,3,5,6};
		int n = coins.length;
		int sum = 10;
		
		System.out.println("the number of ways of getting the sum 4 :" + CoinChangeProblem.countways(coins,n,sum));
		
		
	} 
}

