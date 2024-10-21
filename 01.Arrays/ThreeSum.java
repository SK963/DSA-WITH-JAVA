import java.util.*;

public class ThreeSum {

// --------------------------------------------------------------------------------------
    // approach 1: Three lops
    // T :O(n^3) : S : two* size of triplets (1 for set of list and 1 for arraylist of list)
    public static List<List<Integer>> threeSum1(int[] arr) {

        
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        // check all possible triplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }

        
        return new ArrayList<>(set);
        
    }

// ------------------------------------------------------

    // approach 2 : 2 Loops & hashset
    // T : O(n^2)   S : O(N) +  2*size of triplets for set of lists and arraylist
    public static List<List<Integer>> threeSum2( int[] arr) {
        Set<List<Integer>> set = new HashSet<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // return the set as a arraylist
        return new ArrayList<>(set);
      
    }
// ---------------------------------------------------------------------
    // approach 3 : array sorting + single loop with 2-3 pointers
    // T : nlongn (sort) + O(n^2) 
    // S : O(number of triplets)

    public static List<List<Integer>> threeSum3(int arr[]){
        List<List<Integer>> set = new ArrayList<>();

        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0 ;i < n ; i++){
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i+1;
            int k = n-1;
            
            while(j<k){             
                int sum = arr[i]+arr[j]+arr[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else{
                    set.add(List.of(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while(j<k && arr[j] == arr[j-1] )j++;
                    while(j<k && arr[k] == arr[k+1] )k--;
                    
                }
            }
            
        }

       
        

        return set;


    }






    public static void main(String[] args) {
        System.out.println(threeSum3(new int[]{-1,0,1,2,-1,-4}).toString()); //[[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum3(new int[]{0,1,1}).toString()); //[]
        System.out.println(threeSum3(new int[]{0,0,0}).toString()); //[[0,0,0]]
        System.out.println(threeSum3(new int[]{-1,0,1,0}).toString()); // [[-1,0,1]]
        System.out.println(threeSum3(new int[]{-2,0,1,1,2}).toString()); // [[-2,0,2],[-2,1,1]]
        
    }
    
}
