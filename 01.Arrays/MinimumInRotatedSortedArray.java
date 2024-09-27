public class MinimumInRotatedSortedArray {
    public  static int findMin(int[] nums) 
    {
        int start  = 0 ;
        int end = nums.length-1;

        int mid = (start + end )/2;

        while(start < end){
            if(nums[mid]  > nums[end]){
                start = mid+1;
                mid = (start + end )/2;
            }
            else{
                end = mid;
                mid = (start + end)/2;
            }

        }
         return nums[start];
        


    }





    public static void main(String[] args) {

        int nums1[] = {3,4,5,1,2};
        int nums2[] = {4,5,6,7,0,1,2};
        int nums3[] = {11,13,15,17};

        System.out.println(findMin(nums1)); //1
        System.out.println(findMin(nums2)); //0
        System.out.println(findMin(nums3)); //11

    }
}
