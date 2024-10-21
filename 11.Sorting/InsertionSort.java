import java.util.*;
public class InsertionSort {

    // idea : inserting elements at its correct position 
    //implementation :  
    // i>element and iterate from start to that position to find its correct position
    // ii> than swap that element while it does not reach there
    
    

    // T : O(N^2)  : ET : (N^2 + N/2) : 
    //Best Case : O(N) :  in case of no greater element at left internal loops does not run
    // 
    public static void insertionSort(int arr[]){

        int count = 0;
        for(int i = 1 ; i< arr.length ; i++){
            for(int j = i ; j> 0 && arr[j-1] > arr[j] ; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.println(Arrays.toString(arr) + "count : " + ++count); //inspect
            }
        }

    }


    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
