
public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;


        while(i < nums.length){

            while(i < nums.length && nums[j] == nums[i] ){
                i++;
            }

            if(i < nums.length ){
                j++;
                nums[j] = nums[i];
            }
            i++;
        }



        return ++j;
        


    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.print("nums : ");
        for(int i = 0 ; i < len ; i++){
            System.out.print(nums[i] + " ");
        }
    }


}


