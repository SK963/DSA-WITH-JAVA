// topics : Array , Divide and Conquer , Dynamic Programming
public class MaximumSubarraySum {

    // approach 1  : generate all subarray and then find the sum of each subarray and get the max 
    public static int maxSubArray1(int[] nums) {

        // Time Complexity: O(N3), where N = size of the array.
        // Reason: We are using three nested loops, each running approximately N times.
        // Space Complexity: O(1) as we are not using any extra space.

        if(nums.length == 1)
            return nums[0];

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i ; j< nums.length; j++){
                int start = i; 
                int end = j;
                int sumvalue = 0;

                for(int k = start ; k <= end ; k++){
                    sumvalue += nums[k];
                    
                    
                }
                max = Math.max(max , sumvalue);   
            }
        }


        return max;
    }
    
    //approach  2 : removing the 3 rd loop
    public static int maxSubArray2(int[] nums) {
        int maxi = Integer.MIN_VALUE; 
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxi = Math.max(maxi, sum); 
            }
        }

        return maxi;
    }

    //approach 2 : using a single loop with khadane's algo
    public static int maxSubArray3(int[] nums) {
        int max = Integer.MIN_VALUE; // maximum sum
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
    


    public static void main(String[] args) {
        
        System.out.println(maxSubArray3(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray3(new int[]{5,4,-1,7,8}));


    }
    
}
