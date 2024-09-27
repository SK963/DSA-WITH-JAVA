import java.util.Arrays;

public class LargestElement {

    // T : O(nlogn)
    public static int Largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    // T : O(n)
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] >  max) max = arr[i];
        }

        return max;
    }



    public static void main(String[] args) {
        int arr[] = {2,5,6,1,6,2,8,10,45,1,56};

        System.out.println("largest element in arr1 : " + largest(arr));
        System.out.println("largest element in arr1 : " + Largest(arr));
        
    }
    
}
