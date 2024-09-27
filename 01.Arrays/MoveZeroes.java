import java.util.Arrays;

public class MoveZeroes {

    // T : O(N) , S :O(1)
    public static void moveZeroes(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            // If current element is not zero, we swap arr[i] with arr[j] 
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {


        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{1,0});
        moveZeroes(new int[]{1,0,0});
        
    }
    
}
