import java.util.*;

public class SingleNumbersII {


    // expected 
    // T : O(n)   S :O(1)

    public static int singleNumber(int[] nums) {
        int num = 0;

        for(int i =0 ; i< 32 ; i++){
            int count = 0;
            // check the ith bit and add it in a count var
            for(int j = 0 ; j<nums.length ; j++){
                if((nums[j]&(1<<i)) != 0){
                    count++;
                }

            }
            if(count % 3 != 0)num += (1<<i);
        }

        return num;
        
    }


    // T: O(nlogn)
    public static int singleNumber2(int nums[]){

        Arrays.sort(nums);//nlogn
        int i  = 1;

        while(i<nums.length){     //n/3       

            if(nums[i] != nums[i-1])return nums[i-1];
            else i += 3;

        }

        return nums[nums.length-1];

    }

    public static int singleNumber3(int nums[]){
        int ones = 0;
        int twos = 0;

        for(int i = 0; i< nums.length ; i++){
            ones = (ones^nums[i])&(~twos);
            twos = (twos^nums[i])&(~ones);
        }

        return ones;

    }



    public static void main(String[] args) {
        System.out.println(singleNumber3(new int[]{2,2,3,2})); //3
        System.out.println(singleNumber3(new int[]{4,4,4,6,7,7,7})); //6
        System.out.println(singleNumber3(new int[]{4,4,4,6,6,6,7})); //7
        System.out.println(singleNumber3(new int[]{4,6,6,6,7,7,7})); //4

    }
    
}
