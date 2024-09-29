import java.util.*;


// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).
public class LongestSubbarrayWithSumK {

// --------------------------------------------------------
    // approach1 :  generate all subarrays and then check the sums and the get max  length subbarray
    // complexity : T : O(n^3) S :O(1)
    public static int lenOfLongSubarr1(int[] arr , int K) {
        
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum ==K) max = Integer.max(max, j-i+1);
            }
        }

        return max;
        
    }
// ----------------------------------------------------------
    // approach 2 using two loops : T : O(n^2) S: O(1) 
    public static int lenOfLongSubarr2(int[] arr , int K) {
            
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum ==K) max = Integer.max(max, j-i+1);
            }
        }

        return max;
        
    }
// -----------------------------------------------------------

    // approach 3 : Hashmaps  (works for both positive numbers)
    // complexity :  T : O(n*logn) , S : O(n)
    public static int lenOfLongSubarr3(int arr[]  , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;

        for(int i = 0 ; i< arr.length; i++){
            sum += arr[i];

            if(sum == k)
                max = Integer.max(max, i+1);

            int rem = sum-k;
            if(map.get(rem) != null) 
                max = Integer.max(max, i- map.get(rem));

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }


        return max;
    }

    

// -------------------------------------------------------------
// approach4 : Two pointers [works only for positive integers (in array)]
    // T : O(2n) , S : O(1)
    public static int lenOfLongSubarr4(int arr[], int K) {
        int n = arr.length; // size of the array.

        int i = 0, j = 0; // 2 pointers
        long sum = arr[0];
        int maxLen = 0;
        while (j < n) {
            // if sum > k , reduce the subarray from i 
            // until sum becomes less or equal to k:
            while (i <= j && sum > K) {
                sum -= arr[i];
                i++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == K) {
                maxLen = Integer.max(maxLen, j - i + 1);
            }

            // Move forward thw j pointer:
            j++;
            if (j < n) sum += arr[j];
        }

        return maxLen;
    }


// --------------------------------------------------------------

    public static void main(String[] args) {
        
        System.out.println(lenOfLongSubarr4(new int[]{10, 5, 2, 7, 1, 9}, 15)); //co : 4
        System.out.println(lenOfLongSubarr4(new int[]{-1, 2, 3}, 6)); //co : 0
        System.out.println(lenOfLongSubarr3(new int[]{-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6}, 15)); //co : 5
        System.out.println(lenOfLongSubarr3(new int[]{-14 ,10, -15, 17 ,4, 18, 3, -18, -7, -4, -8, 8, -8}, 12)); //co : 8
    
    }
    
}
