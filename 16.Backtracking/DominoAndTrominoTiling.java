
public class DominoAndTrominoTiling{
    public int numTilings(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (2* dp[i-1] + dp[i-3])%MOD;
        }

        return (int) dp[n];
    }

    public static void main(String[] args) {
        DominoAndTrominoTiling solution = new DominoAndTrominoTiling();
        System.out.println("Input: 1, Output: " + solution.numTilings(1));  // Output: 1
        System.out.println("Input: 2, Output: " + solution.numTilings(2));  // Output: 2
        System.out.println("Input: 3, Output: " + solution.numTilings(3));  // Output: 5
        System.out.println("Input: 4, Output: " + solution.numTilings(4));  // Output: 11
        System.out.println("Input: 5, Output: " + solution.numTilings(5));  // Output: 24
        System.out.println("Input: 6, Output: " + solution.numTilings(6));  // Output: 53
        System.out.println("Input: 7, Output: " + solution.numTilings(7));  // Output: 117
        System.out.println("Input: 8, Output: " + solution.numTilings(8));  // Output: 258
        System.out.println("Input: 9, Output: " + solution.numTilings(9));  // Output: 569
        System.out.println("Input: 30, Output: " + solution.numTilings(30)); //Ouptut : 312342182 
    }
}


/*
 class Solution {
    public int numTilings(int n) 
    {

        int noOfWays = domino(n);
        noOfWays += tromino(n);
        return noOfWays;
    }


    public int domino(int n){
        if(n<= 3)
            return n;
        else return domino(n-1) + domino(n-2);
    }

    public int tromino(int n){
        if (n<=2){
            return 0;
        }
        else if(n == 3){
            return 2;
        }
        else {
            return (tromino(n-1) * 2 )+ (int)Math.pow(2,n-3);
        }
        
    }
}
 */