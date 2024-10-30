import java.util.*;

public class LongestConsecutiveSequence {


    // approach 1 : sort and check the longest consecutive elements 
    // T : (nlogn + n) :Sorting: nlongn , 
    // S : O(1)
    public static int longestSuccessiveElements1(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        int tempcount = 1;
        System.out.println(Arrays.toString(arr));
        for(int i  = 0 ; i< arr.length-1 ; i++){
            if(arr[i+1] - arr[i] == 1 ){
                tempcount++;
            }
            else if(arr[i+1] - arr[i] == 0){
                tempcount += 0;
            }
            else{
                 count = Integer.max(tempcount, count);
                 tempcount = 1;
            }
        }

        count = Integer.max(count, tempcount);
        
        return count;

    }

    // approach 2 : using set data structure
    // T : O(N) + O(2*N) ~ O(3*N)
    // S : O(N) //set
    public static int longestSuccessiveElements2(int arr[]) {

        Set<Integer> set = new HashSet<>();
        for(int a : arr)
            set.add(a);
        
            int longest = 1;
            for (int it : set) {
                // if 'it' is a starting number
                if (!set.contains(it - 1)) {
                    // find consecutive numbers
                    int cnt = 1;
                    int x = it;
                    while (set.contains(x + 1)) {
                        x = x + 1;
                        cnt = cnt + 1;
                    }
                    longest = Math.max(longest, cnt);
                }
            }
            return longest;
        

    }



    public static void main(String[] args) {
        System.out.println(longestSuccessiveElements2(new int[]{5, 8, 3, 2, 1, 4}));//5
        System.out.println(longestSuccessiveElements2(new int[]{5 ,4 ,3}));//3
        System.out.println(longestSuccessiveElements2(new int[]{15,6,2,1,16,4,2,29,9,12,8,5,14,21,8,12,17,16,6,26,3}));//6
        
    }
}
