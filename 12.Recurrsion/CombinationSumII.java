import java.util.*;

public class CombinationSumII{
    // static List<List<Integer>> ans = new ArrayList<>(); 



    // approach 1 : modified combinatiosum1 code
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet();
        sum(candidates, target ,0   , new ArrayList<>() ,  ans);
        return new ArrayList(ans);
        
    }


    public static void sum(int candidates[] , int target , int index , List<Integer> soln ,HashSet<List<Integer>> ans){
        if(index == candidates.length){
            
            if(target == 0){
                ArrayList<Integer> ps = new ArrayList<>(soln);
                Collections.sort(ps);
                 ans.add(new ArrayList<>(ps));
            }
            return;
        }
        
        if(candidates[index] <= target){
            soln.add(candidates[index]);
            sum(candidates, target - candidates[index], index + 1, soln , ans);   //take 
            soln.remove(soln.size()-1);
        }
        sum(candidates, target, index + 1 , soln, ans);     // not take    

    }


    // approach 2 : fresh recurrsion approach 
    public static List<List<Integer>> combinationSumI(int candidates[] , int target){
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(candidates);
        sumI(0,target , candidates , new ArrayList<>() , ans);
        return ans;
    }


    static void sumI(int index, int target , int[] candidates, List<Integer>soln , List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(soln));
            return;
        }
        
        for(int i  = index ; i< candidates.length ; i++){
            if((i > index) && (candidates[i] == candidates[i-1]))continue;
            if(candidates[i]> target)break;

            soln.add(candidates[i]);
            sumI(i+1 ,target-candidates[i], candidates , soln , ans); 
            soln.remove(soln.size()-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(combinationSumI(new int[]{1,1,1,2,2}, 4));
        System.out.println(combinationSumI(new int[]{2,3,5}, 8));
        System.out.println(combinationSumI(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(combinationSumI(new int[]{2,5,2,1,2}, 5));
        System.out.println(combinationSumI(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30));
        
        // [[7]]
        // [[3, 5]]
        // [[1, 2, 5], [1, 1, 6], [2, 6], [1, 7]]
        // [[1, 2, 2], [5]]
        
    }
}