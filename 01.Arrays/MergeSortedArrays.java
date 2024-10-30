import java.util.*;

public class MergeSortedArrays {
    
    // approach 1 : 
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length - arr2.length; // orginal arr1 length without merging 
        int n = arr2.length;
        if(arr1.length == 0 || arr2.length==0) return ;

        int k = m;
        for(int i = 0 , j = 0  ; i< arr1.length && j<n ; i++){

            if(i<m && arr1[i] > arr2[j]){

                //move all the elements by 1 from i to  k
                for(int l = k ; l> i ; l--){
                    arr1[l] = arr1[l-1];
                }
                // increment k one space is used
                k++;

                //replace arr1[i] with arr[j] & increment j;
                arr1[i] = arr2[j++];
                m++; // now arr1 size increases by 1 

            }

            if(i >= m &&  j<n){
                arr1[i] = arr2[j++];

            }

        }


        System.out.println(Arrays.toString(arr1));



        
    }


    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        merge(arr1, arr2);
        // [1, 2, 2, 3, 5, 6]
        merge(new int[]{2,0}, new int[]{1});
        // [1, 2]
        merge(new int[]{1}, new int[]{});
        //[1]
        merge(new int[]{0}, new int[]{1});
        // [1]
        merge(new int[]{-1,0,0,3,3,3,0,0,0}, new int[]{1,2,2});
        //[-1,0,0,1,2,2,3,3,3]

    }
}
