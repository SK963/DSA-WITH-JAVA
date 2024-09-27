public class CheckSortedAndRotated {


    public static boolean check(int nums[]){
        int min ;
        int i =0;
        min = nums[i];
        while(i < nums.length && nums[i] <= nums[i+1]){
            i++;
        }

        i++;

        while( i < nums.length){
            if(nums[i] > min) 
                return false;
            if(i != nums.length-1){
                if(nums[i] > nums[i+1])
                    return false;
            }
            i++;

        }

        return true;
    }





    public static void main(String[] args) {
        int nums1[] = {3,4,5,1,2};
        System.out.println(check(nums1));

        int nums2[] = {2,1,3,4};
        System.out.println(check(nums2));


        int nums3[] = {3,6,10,1,8,9,9,8,9};
        System.out.println(check(nums3));

       int nums4[] =  {5,5,6,6,6,9,1,2};
       System.out.println(check(nums4));

       int nums5[]=  {3,1,2,2,4};
       System.out.println(check(nums5));


       int nums6[] = {2,4,1,3};
       System.out.println(check(nums6));

    }
    
}


/*
true
false
false
true
false
false
 */