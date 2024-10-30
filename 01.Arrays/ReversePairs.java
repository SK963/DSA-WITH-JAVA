import java.util.*;

public class ReversePairs {

    public static int reversePairs(int arr[]){
        int count = 0;

        for(int i = 0 ; i<arr.length ;i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] > 2*arr[j])count++;
            }
        }

        return count;


    }
  
    
    // approach2 :  tweeked merge sort
    // T : O(2N*logN) (nlong for countpairs )
    // S : O(N)
    public static int reversePairs2(int[] arr) {
        return mergeSort(arr, 0, arr.length-1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); //Modification
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }


    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (arr[i] > (long)2 * arr[right])) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;  

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        System.out.println(reversePairs2(new int[]{1,3,2,3,1}));
        //2 : {[1,4],[3,4]}
        System.out.println(reversePairs2(new int[]{2,4,3,5,1}));
        //3 : {[1,4],[2,4],[3,4]}
        System.out.println(reversePairs2(new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647}));
        //0
        
    }
    
}
