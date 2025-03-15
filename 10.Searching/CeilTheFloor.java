import java.util.Arrays;

public class CeilTheFloor {

    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        return new int[] { floor(arr, x), ceil(arr, x) };

    }

    public static int ceil(int arr[], int x) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>= x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        

        return ans == - 1 ?-1: arr[ans];
    }

    public static int floor(int arr[], int x) {
        

        int low = 0; 
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= x){
                low = mid+1;
                ans = mid;
            }
            else high = mid-1;
        }
        

        return ans ==  - 1 ? -1: arr[ans];

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getFloorAndCeil(7, new int[] { 5, 6, 8, 9, 6, 5, 5, 6 })));
        // [6,8]
        System.out.println(Arrays.toString(getFloorAndCeil(10, new int[] { 5, 6, 8, 8, 6, 5, 5, 6 })));
        // [8,-1]

    }
}
