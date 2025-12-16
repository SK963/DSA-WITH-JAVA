import java.util.*;

public class SingleNumberIII {

    public static int[] singleNumber(int nums[]) {
        int ans[] = new int[2];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] ^ nums[i - 1]) != 0) {
                ans[j] = nums[i - 1];
                j++;
            } else
                i++;
        }

        if (j < 2)
            ans[j] = nums[nums.length - 1];

        return ans;

    }


    // T : O(n) + O(n)
    public static int[] singleNumber2(int nums[]){
        int ans[] = new int[2];

        int xor = 0;

        for(int i : nums){
            xor = (xor^i);
        }


        xor = xor^(xor&(xor-1));

        for(int i : nums){
            if((i&xor)==0)ans[0] = (ans[0]^i);
            else ans[1] = (ans[1]^i);
        }

        return ans;


    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(singleNumber2(new int[] { 1, 2, 1, 3, 2, 5 })));  //[3,5]

    }

}
