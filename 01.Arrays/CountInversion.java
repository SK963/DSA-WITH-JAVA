import java.util.*;

public class CountInversion {

    // approach1 : Brute comparision
    // T : O(N^2) , S : O(1)
    static int inversionCount(int arr[]) {
        int count = 0;


        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[i]>arr[j])count++;
            }
            
        }

        return count;
        
    }

    // approach2 :  tweeked merge sort
    // T : O(N*logN)  
    // S : O(N)
    static int inversionCount2(int arr[]){

        
        int count = mergesort(arr, 0, arr.length-1 );
        return count;

    }


    private static int mergesort(int arr[], int start, int end) {
        int count = 0;
        if (start >= end) return count ;
        int mid = (start + end)/2;
        count += mergesort(arr, start, mid);
        count += mergesort(arr, mid + 1, end);
        count += merge(arr, start, mid, end);

        return count;


    }

    private static int merge(int arr[], int low, int mid, int high) {
        int count =0;
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
                count += mid-left+1;
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

        return count;

    }


    public static void main(String[] args) {

        System.out.println(inversionCount2(new int[]{2, 4, 1, 3, 5}));
        //3 {[2,1],[4,1],[4,3]}
        System.out.println(inversionCount2(new int[]{24, 18, 38, 43, 14, 40, 1, 54}));
        //12 : {[24,18][18,14],[24,14],[38,14],[43,14],[43,40],[43,1],[40,1],[38,1],[24,1],[18,1],[14,1]}
        
    }
    
}
