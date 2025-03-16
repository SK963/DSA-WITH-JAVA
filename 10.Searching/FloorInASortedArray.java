public class FloorInASortedArray {

    static int findFloor(int[] arr, int x) {
        int low = 0; 
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2 ;
            if(arr[mid] <= x){
                ans = mid;
                low = mid+1;
                
            }
            else high = mid-1;
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findFloor(new int[]{1, 2, 8, 10, 11, 12, 19}, 0)); //-1
        System.out.println(findFloor(new int[]{1, 2, 8, 10, 11, 12, 19}, 5)); //1 -> arr[1]<=2
        System.out.println(findFloor(new int[]{1, 2, 8}, 1));//0 
    }
    
}
