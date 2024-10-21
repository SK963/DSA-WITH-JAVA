import java.util.Arrays;

public class BubbleSort{

    // {10,9,8,7,6,5,4,4,3,2,1}
    // brute way of comparision vise swapping :
    public static  void sort(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1 ;j< arr.length  ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }



    // -----------------------------------------------------------------------
    // idea :  one swapping of  all adjent element through comparision
    // puts the maximum element at its righ position and the unsorted array gets smaller 
    
    //approach 1 : straight way
    // {10,9,8,7,6,5,4,4,3,2,1}

    public static  void bubblesort(int arr[]){
        // int count = 0;
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ;j< arr.length- 1-i  ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                // System.out.println(Arrays.toString(arr) + "count : " + ++count); //visualise every step
            }
            // System.out.println(Arrays.toString(arr)); //changes  at every iteration 
        }
    }


    // T : O(N^2)       ET : (N^2/2 + N/2)
    // S : O(1)
    //approach2 : reverse way
    public static void bubbleSort(int arr[]){
        for(int i = arr.length -1; i >=0 ; i--){
            for(int j = 0 ; j<= i-1 ; j++ ){
                //swap if not ordered
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
    }


    //optimize bubble sort  : in case of no swaps in the previous iteration mens it is sorted so  loop break 
    public static void bubbleSortOptimized(int arr[]){
        for(int i = arr.length -1; i >=0 ; i--){
            int swaps = 0;
            for(int j = 0 ; j<= i-1 ; j++ ){
                //swap if not ordered
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = 1;
                }
            }
            if(swaps == 0){ // if there are no swaps on first iteration then break
                break;
            }
        }
    }



    public static void main(String[] args) {
        
        
        int arr[] = {10,9,8,7,6,5,4,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}