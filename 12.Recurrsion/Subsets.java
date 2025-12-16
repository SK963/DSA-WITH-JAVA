import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsetsHelper(subsets, new ArrayList<>(), nums , 0);
        return subsets;
        
    }

    private static void generateSubsetsHelper(List<List<Integer>> result, List<Integer> tempList, int[] arr, int start) {
        result.add(new ArrayList<>(tempList));
        
        for (int i = start; i < arr.length; i++) {
            tempList.add(arr[i]);
            generateSubsetsHelper(result, tempList, arr, i + 1);
            tempList.remove(tempList.size() - 1); // backtrack
        }
    }


    public static void main(String[] args) {
        
        System.out.println(subsets(new int[]{1,2,2}));
        //[[], [1], [1, 2], [1, 2, 2], [1, 2], [2], [2, 2], [2]]

        System.out.println(subsets(new int[]{1,2,3}));
        //[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    }
    
}
