import java.util.*;

public class SubarraySumEqualK {


//-----------------------------------------------------------
    // double loops 
    // T : O(n^2) : S :O(1)
    public static int subarraySum1(int arr[] , int target){
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i< n ; i++){
            int sum = 0;
            for(int j = i ; j< n ; j++){
                sum += arr[j];
                if(sum == target)count++;
                
            }
        }

        return count;
    }

    // single loop with prefix sum
    // T : O(N) or O(N*logN) (for sorted and unsorted map)
    // S : O(N)
    public static int subarraySum2(int[] arr, int target) {

        // a hashmap of prefix sums and theri occurence while moving the array
        Map <Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefix = 0;
        int count = 0; // count of the subarrays with target sum
        for(int i = 0 ; i<arr.length; i++){
            prefix += arr[i];
            count += map.getOrDefault(prefix - target, 0);
            map.put(prefix , map.getOrDefault(prefix, 0) + 1);
            

        }

        return count;

        

    }



    public static void main(String[] args) {
        System.out.println(subarraySum2(new int[]{1,1,1}, 2));//2
        System.out.println(subarraySum2(new int[]{1,2,3}, 3));//2
        System.out.println(subarraySum2(new int[]{1,2,1,2,1}, 3));//4
        System.out.println(subarraySum2(new int[]{-1,-1,1}, 0));//1
        System.out.println(subarraySum2(new int[]{1}, 0));//0
        System.out.println(subarraySum2(new int[]{1,2,3,-3,1,1,1,4,2,-3}, 3));//8


    }
    
}
