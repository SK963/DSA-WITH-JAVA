import java.util.Arrays;

public class BubbleSort{
    public  void sort(int arr[]){
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




    public static void main(String[] args) {
        
        
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        new BubbleSort().sort(arr);

        System.out.println(Arrays.toString(arr));


        
    }
}