public class CountTotalSetBits {

// Function to return sum of count of set bits in the integers from 1 to n.

        // T : O(nlogn)
        public static int countSetBits2(int n) {

            int cnt = 0;
            for (int i = 1; i <= n; i++) {
    
                int temp = i;
                while (temp > 0) {
                    temp = (temp & (temp - 1));
                    cnt++;
                }
            }
    
            return cnt;
        }





    //approach :  recursion  + bitwise operation
    //T : O(logn) 
    public static int countSetBits(int n) {

        if (n == 0)
            return 0;
        int x = largestPowerOf2(n);
        int bitsUpTo2x = x * (1 << (x - 1));
        int msbFrom2xToN = n - (1 << x) + 1;
        int rest = countSetBits(n - (1 << x));

        return bitsUpTo2x + msbFrom2xToN + rest;

    }

    private static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;

    }



    public static void main(String[] args) {
        System.out.println(countSetBits(4));// 5
        System.out.println(countSetBits2(4));// 5
    }

}
