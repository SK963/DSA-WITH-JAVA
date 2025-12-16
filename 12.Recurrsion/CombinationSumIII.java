import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {


    public static List<List<Integer>> combinationSum3(int depth, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(0, depth , target , 1 , new ArrayList<>(), ans);

        return ans;

        
    }

    static void sum(int currdepth , int depth , int target , int start , List<Integer>soln , List<List<Integer>> ans){
        if(currdepth == depth){
            if(target == 0)
                ans.add(new ArrayList<>(soln));
            return;
        }


        for(int i = start ; i<= 9 ; i++){
            if(i > target) break;

            soln.add(i);
            sum(currdepth+1,depth, target -i, i+1, soln, ans);
            soln.remove(soln.size()-1);
        }

    }




    public static void main(String[] args) {
        
        System.out.println(combinationSum3(3, 7));
        System.out.println(combinationSum3(3, 9));
        System.out.println(combinationSum3(4, 1));
    }
    
}
