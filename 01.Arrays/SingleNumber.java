public class SingleNumber {


    // approach 1 : searching T : O(n^2) S : O(1)

    public static int singleNumber1(int nums[]){
        for(int i = 0 ;i < nums.length; i++){
            int num = nums[i];
            int flag = 0;
            for(int j = 0; j<nums.length ; j++)
                if(num == nums[j] ) flag ++;
                
            if(flag == 1)
                return nums[i];
            
            
        }

        return -1;
    }


    // aapproach 2 : xor / Bitwise manupulation : T: O(n) S : O(1)
    public static int singleNumber2(int[] nums) {

        int xor = nums[0];
        for(int i = 1; i<nums.length; i++)
            xor =  xor ^nums[i];
        
        return xor;
    }


    public static void main(String[] args) {

        System.out.println(singleNumber1(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber1(new int[]{2,2,1}));
        
    }
    
}
