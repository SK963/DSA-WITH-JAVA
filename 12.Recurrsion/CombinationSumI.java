import java.util.*;


public class CombinationSumI {

    // static List<List<Integer>> ans = new ArrayList<>(); 


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(candidates, target ,0   , new ArrayList<>() ,  ans);
        return ans;
        
    }


    public static void sum(int candidates[] , int target , int index , List<Integer> soln ,List<List<Integer>> ans){
        if(index == candidates.length){
            if(target == 0) ans.add(new ArrayList<>(soln));
            return;
        }
        
        if(candidates[index] <= target){
            soln.add(candidates[index]);
            sum(candidates, target - candidates[index], index, soln , ans);   //take 
            soln.remove(soln.size()-1);
        }
        sum(candidates, target, ++index , soln, ans);     // not take    

    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(combinationSum(new int[]{2,3,5}, 8));
        System.out.println(combinationSum(new int[]{10,1,2,7,6,1,5}, 8));
    }
    
}
