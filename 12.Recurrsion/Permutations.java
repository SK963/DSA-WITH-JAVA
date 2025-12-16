import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // approach 1 : recurrsive
    // T:  N! x N
    // S:  O(N!*N) (N! : permutations) (N:size of each array)
    public static List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> permuatations = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        recpermute(nums, freq, ds, permuatations);
        
        return permuatations;
        
    }



    private static void recpermute(int []nums , boolean freq[] ,  List<Integer> ds , List<List<Integer>> permuatations){
        if(ds.size() == nums.length){
            permuatations.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0 ; i< nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recpermute(nums, freq, ds, permuatations);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(permute1(new int[]{1,2,3}).toString());
        System.out.println(permute1(new int[]{0,1}).toString());
    }
    
}
