public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int count = 0;
        int max = 0;
        while(i< nums.length){
            if(nums[i] == 1) count++;
            if(nums[i]!= 1 || i == nums.length -1){
                max = Integer.max(max, count);
                count = 0;
            }
            i++;
        }

        return max;
        
    }
    


    public static void main(String[] args) {

        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
