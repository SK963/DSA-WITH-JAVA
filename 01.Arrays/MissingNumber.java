import java.util.*;

public class MissingNumber {

    // approach 1  Linear search : T : O(n^2) S : O(1)
    public static int missingNumber1(int nums[]){
        
        for(int i = 0 ; i<= nums.length ; i++){
            boolean flag = false;
            for(int j = 0 ;j< nums.length ; j++){
                if(nums[j] == i){
                    flag  = true;
                    break;
                }
            }
            if(!flag)
                return i;
            
        }
        return -1;
    }

    // approach 2 :  Hashing / set  : T : O(2N) : S : O(N)
    public static int missingNumber2(int nums[]){
        Set<Integer> sorted = new TreeSet<>();
        for(int num : nums)
            sorted.add(num);
        
        Iterator<Integer> it = sorted.iterator();
        int i = 0;
        while(it.hasNext()){
            if(it.next() != i){
                return i;
            }
            i++;
                
        }
        

        return -1;
    }

    // approach 3 :  using a math proerty : T : O(N) , S: O(1)
    public static int missingNumber3(int[] nums) {
        int sum = (nums.length * (nums.length+1))/2;
        for(int i = 0 ; i< nums.length ; i++){
            sum -= nums[i];
        }
        return sum;
        
    }

    // approach 4 :XOR 
    public static int missingNumber4(int[] nums){
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor2 = xor2 ^ nums[i]; // XOR of array elements
            xor1 = xor1 ^ i; //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ nums.length; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }


    public static void main(String[] args) {
        System.out.println(missingNumber4(new int[]{3,0,1}));
        System.out.println(missingNumber4(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
