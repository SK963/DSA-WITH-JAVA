import java.util.*;

public class Subsequences{
	// recursive 

	// public static List<List<Integer>> subsequence0(int nums[]){
	// 	printSubsequences(nums, 0, new ArrayList<>());
	// }
	
	
	public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path){
		
		
		if (index == arr.length)
		{
			if (path.size() > 0)
				System.out.println(path+", ");
		}
		
		else
		{
			
			// Subsequence without including
			// the element at current index
			printSubsequences(arr, index + 1, path);
			
			path.add(arr[index]);
			
			// Subsequence including the element
			// at current index
			printSubsequences(arr, index + 1, path);
			
			// Backtrack to remove the recently 
			// inserted element
			path.remove(path.size() - 1);
		}
		return;
	}


	// approach 1 : iterative 
	public static List<List<Integer>> subsequence(int[] nums) {

		List<List<Integer>> powerset = new ArrayList<>();
		powerset.add(new ArrayList<>());
		for(int i = 0 ; i< nums.length ; i++){
			for(int j = i ; j< nums.length ; j++){
				List<Integer> set = new ArrayList<>();
				for(int k = i  ; k <= j ; k++)
					set.add(nums[k]);
				
				powerset.add(set);
			}
		}

		return powerset;			
	}

	
	
	

	public static void main(String[] args)
	{
		
		printSubsequences(new int[]{1,2,3}, 0, new ArrayList<>());
		System.out.println(subsequence(new int[]{1,2,3}).toString());
		
	}
}


