import java.util.*;
// idea & intution : 
//pick a pivot element(which will be same ) put it at its correct position
// repeat for the left unsorted array and right usorted arr of that pivot element pos


// T : O(n*logn)
// S : O(1)
public class QuickSort {


    public static void quickSort(int arr[]){
        quicksort(arr, 0 , arr.length-1);

    }
    

    private static void quicksort(int arr[] ,  int low , int high){
        if(low < high ){
            int partition = partition(arr , low , high);
            quicksort(arr, low , partition-1);
            quicksort(arr ,  partition+1 , high);
        }
        else return;

    }

    private static int partition(int arr[]  , int low , int high){
        int pivot = arr[low];
        int i = low , j = high;
        while(j>i){
            // finding first element which is greater
            while(arr[i] <= pivot && i<= high-1)i++;
            //finding first element which is lesser
            while(arr[j] > pivot && j>= low+1) j--;
            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }

        }

        //putting the pivot at its righ postition
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }


    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}
