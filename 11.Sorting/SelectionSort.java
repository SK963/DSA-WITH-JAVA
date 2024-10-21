import java.util.*;

public class SelectionSort {


    // T : O(N^2)  ET :(N^2/2 + N/2)
    //S : O(1) ES : 2 extra variables
    // approach  : find minimum/maximum and swap with first poistion of unsorted array portion 
    //the ussorted array reduced by 1 position
    public static void selectionSort(int arr[]){

        for(int i = 0 ; i<arr.length-1 ; i++){
            int mini = i;
            for(int j = i ; j < arr.length ; j++){
                if(arr[j]<arr[mini])mini = j; 
                //changing the < with > implements decending order
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini]= temp;
            System.out.println(Arrays.toString(arr));
        }

    }





    public static void main(String[] args) {
        int arr[] = {5,4,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
