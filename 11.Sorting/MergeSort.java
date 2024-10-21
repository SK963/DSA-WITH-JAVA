
//algorithm :  dicvide till size is equals to 1 - mege merge
//approach : 
//implementation
import java.util.*;

public class MergeSort {

    // T : O(nlogn)
    // S : O(N)
    public static void mergeSort(int arr[]) {
        mergesort(arr, 0, arr.length-1);

    }

    private static void mergesort(int arr[], int start, int end) {
        if (start >= end) return;
        int mid = (start + end)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    private static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // storing elements in the temporary array in a sorted manner//

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

        // if elements on the right half are still left //
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
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
