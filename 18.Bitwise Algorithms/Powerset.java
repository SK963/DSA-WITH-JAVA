import java.util.ArrayList;
import java.util.List;

public class Powerset {


    // T :O((2^n)*n)

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int subsets = 1<<nums.length;

        for(int i = 0 ; i< subsets ; i++){
            List<Integer>pans = new ArrayList<>();
            for(int j = 0 ; j < nums.length ; j++){
                if(((i & (1 << j)) != 0))pans.add(nums[j]);
            }
            ans.add(pans);
        }

        return ans;




    }


    public static void main(String[] args) {
        
        System.out.println(subsets(new int[]{1,2,3}).toString());
    }
    
}
