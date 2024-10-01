import java.util.*;
public class TwoSum {
  
    // approach 1 :  Two loops
    // T : O(n^2) , S : T(1)
    public static int[] twoSum1(int[] nums, int target) {

        int result[] = new int[2];

        for(int i = 0 ; i< nums.length; i++){
            for(int j = i+1 ; j< nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                    

                }
            }
        }

        return result;
        
    }

    // approach 2 : using hasing 
    // T : O(n*logn)(ordered map) O(n^2)(unordered)   S : O(N) 
    public static int[] twoSum2(int arr[] , int target){
        Integer j = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer i;
        for(i = 0 ; i< arr.length ; i++){
            
            j = map.get(target - arr[i]);
            if(j != null && i != j ) 
                break;
            
            map.put(arr[i] , i);
            
        }
        return new int[]{j,i};
    }

    


    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(twoSum2(new int[]{2,7,1,4,8,9,10},9)));   //[0, 1]
        System.out.println(Arrays.toString(twoSum2(new int[]{3,2,4},6)));  //[1, 2]
        System.out.println(Arrays.toString(twoSum2(new int[]{3,3},6)));    //[0, 1]
        
    }
    
}
