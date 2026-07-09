import java.util.*;

public class KthLargest {


    // maxheap :  // T : O(n + klogn)  , S : O(n)
    public static int findKthLargest(int[] arr, int k) {

        // max heap
       
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : arr){
            pq.add(n);
        }

        int n = k;
        while(k-- > 1)pq.remove();
        return pq.remove();
        
    }

    // Quickselect : O(n^2). Ω(n)
    public static int findKthLargest2(int arr[] , int k ){
        int targetIndex = arr.length - k;
        return quickSelect(arr, 0, arr.length - 1, targetIndex);
    }

    public static int findKthSmallest(int arr[] , int k ){
        int targetIndex = k-1;
        return quickSelect(arr, 0, arr.length - 1, targetIndex);
    }

    private static int quickSelect(int[] arr, int l, int r, int k) {


        
        // System.out.println(Arrays.toString(arr));

        int pivot = arr[r];
        int p = l;

        // Partition
        for (int i = l; i < r; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, p);
                p++;
            }
        }

        

        // Place pivot in correct position
        swap(arr, p, r);

        // Recurse
        if (p > k) return quickSelect(arr, l, p - 1, k);
        else if (p < k) return quickSelect(arr, p + 1, r, k);
        else return arr[p];
        
    }

    private static void swap(int arr[] ,  int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,6,4}, 2));
        System.out.println(findKthLargest2(new int[]{3,2,1,6,5,4}, 2));
        System.out.println(findKthSmallest(new int[]{3,2,1,6,5,4}, 2));
        System.out.println(findKthSmallest(new int[]{10, 5, 4, 3, 48, 6, 2, 33, 53, 10}, 4));
    }
    
}
