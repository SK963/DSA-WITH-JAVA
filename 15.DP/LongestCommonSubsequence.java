// A Naive recursive implementation of LCS problem in java 

public class LongestCommonSubsequence { 

	// Returns length of LCS for X[0..m-1], Y[0..n-1] 
	int lcs(String X, String Y, int m, int n , int[][] result)
	{
		if (m == 0 || n == 0) 
			return 0; 

		if(result[m][n] != -1)
			return result[m][n];
		
		if (X.charAt(m - 1) == Y.charAt(n - 1)) 
			result[m][n] =  1 + lcs(X, Y, m - 1, n - 1 , result); 
		else
			result[m][n] =  max(lcs(X, Y, m, n - 1 , result),
					lcs(X, Y, m - 1, n , result )); 

		return result[m][n];
	} 

	// Utility function to get max of 2 integers 
	int max(int a, int b) { return (a > b) ? a : b; } 
	//or we can use Math.max(a,b)


	public static void main(String[] args) 
	{ 
		LongestCommonSubsequence lcs 
			= new LongestCommonSubsequence(); 
		String S1 = "ABCBDAB"; 
		String S2 = "BDCABA"; 
		int m = S1.length(); 
		int n = S2.length();
		
		int result[][] = new int[m+1][n+1];
		for(int i = 0 ; i<= m ; i++){
			for(int j = 0 ; j<= n ; j++){
				result[i][j] = -1;
			}
		}

		
		System.out.println("Length of LCS is"
						+ " " + lcs.lcs(S1, S2, m, n, result));

		
		for(int i = 0 ; i<= m ; i++){
			for(int j = 0 ; j<= n ; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	} 
}

