import java.util.*;

public class SubsetsII {

    // modified subsetI code : 
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
        HashSet<List<Integer>> ans = new HashSet<>();
        subset(nums , 0 , new ArrayList<>(), ans);
        return new ArrayList<>(ans); // adds extra time and space 
        
    }

    
    
    static void subset(int arr[] , int index , List<Integer>soln , HashSet<List<Integer>> ans){
        if(index == arr.length){
            ArrayList<Integer> ps = new ArrayList<>(soln);
            Collections.sort(ps);
            ans.add(ps);
            return;
        }

        soln.add(arr[index]);
        subset(arr , index+1 , soln ,ans);
        soln.remove(soln.size()-1);
        subset(arr,index+1 , soln, ans);

    }


    // modifies recurrsion approach : 

    // approach 2 : fresh recurrsion approach 
    public static List<List<Integer>> subsetII(int arr[]){
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(arr);
        subsetIIhelper(0 , arr , new ArrayList<>() , ans);
        return ans;
    }


    static void subsetIIhelper(int index, int[] arr, List<Integer>soln , List<List<Integer>> ans){
        if(index == arr.length){
            List<Integer> ps = new ArrayList<>(soln);
            Collections.sort(ps);
            ans.add(ps);
            return;
        }
        
        for(int i  = index ; i< arr.length ; i++){
            if((i > index) && (arr[i] == arr[i-1]))continue;

            soln.add(arr[i]);
            subsetIIhelper(i+1 , arr , soln , ans); 
            soln.remove(soln.size()-1);
        }



    public static void main(String[] args) {

        System.out.println(subsetsWithDup(new int[]{1,2,2}).toString());
        // [[1, 2, 2], [1], [2, 2], [2], [], [1, 2]]
        System.out.println(subsetsWithDup(new int[]{1,2,3}).toString());
        // [[1], [1, 2, 3], [2], [], [1, 2], [2, 3], [3], [1, 3]]
        System.out.println(subsetsWithDup(new int[]{4,4,4,1,4}).toString());
        // [[1, 4, 4], [1], [4, 4], [], [4, 4, 4], [4], [1, 4, 4, 4, 4], [1, 4], [1, 4, 4, 4], [4, 4, 4, 4]]
    }
    
}
