import java.util.*;

public class FourSum {


    // using three loops with a hashset
    public static List<List<Integer>> fourSum1(int arr[] , int target){
        int n = arr.length; // size of the array
        Set<List<Integer>> st = new HashSet<>();

        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    // taking bigger data type
                    // to avoid integer overflow:
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    long fourth = target - sum;
                    if (hashset.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int) fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    // put the kth element into the hashset:
                    hashset.add((long) arr[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
        

    }


    public static List<List<Integer>> fourSum2(int arr[] ,int target){
        int n = arr.length; 
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i] ;
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        ans.add(List.of(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    }
                    else if (sum < target) k++;
                    else l--; //sum > target
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fourSum1(new int[]{1,0,-1,0,-2,2}, 0));
        //output [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        System.out.println(fourSum1(new int[]{2,2,2,2,2}, 8));
        // output : [[2,2,2,2]]
        System.out.println(fourSum1(new int[]{0,0,0,0}, 0));
        // output : [[0,0,0,0]]
        System.out.println(fourSum1(new int[]{-3,-1,0,2,4,5}, 0));
        //output : [[-3,-1,0,4]]
        System.out.println(fourSum1(new int[]{-1,0,1,2,-1,-4}, -1));
        // output  : [[-4,0,1,2],[-1,-1,0,1]]
        System.out.println(fourSum1(new int[]{-3,-1,0,2,4,5}, 2));
        // output : [[-3,-1,2,4]]
        System.out.println(fourSum1(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
        // output : []

    }
    
}
