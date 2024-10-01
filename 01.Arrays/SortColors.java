
// one-pass algorithm using only constant extra space
// Dutch National flag algorithm. 

import java.util.Arrays;

public class SortColors {

    
    // approach1 : keeping the count of each
    // T : O(2N)  , S : O(1)
    public static void sortColors1(int[] arr) {

        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else
                count2++;
        }

        for (int i = 0; i < count0; i++)
            arr[i] = 0;

        for (int i = count0; i < count0 + count1; i++)
            arr[i] = 1;

        for (int i = count0 + count1; i < arr.length; i++)
            arr[i] = 2;

    }



    // approcah 2 : three pointers || Dutch National flag algorithm. 
    // T : O(N)  , S : O(1)
    public static void sortColors2(int arr[]){
        int low = 0 , mid = 0 , high = arr.length-1;

        while(mid<= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low ++ ; mid++;
            }
            else if(arr[mid] ==  1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }


    }



    public static void main(String[] args) {

        int arr[] = { 2,0,1 };
        sortColors2(arr);
        System.out.println(Arrays.toString(arr));

    }

}
