
import java.util.*;

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).
public class LargestSubarrayWith0Sum {

    public static int maxLength1(int arr[]){

        int count = 0;
        for(int i = 0; i <arr.length ;i++){
            int sum = arr[i];
            for(int j = i+1 ; j< arr.length ; j++){
                sum += arr[j];
                if(sum == 0) count = Integer.max(count , j-i+1);

            }
        }

        return count;

    }

    public static int maxLength2(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        int pre = 0;
        int len = 0;
        for(int i = 0 ; i< arr.length; i++){
            pre += arr[i];
            if(pre == 0){
                len = i+1;
            }
            if(map.containsKey(pre)){
                len = Integer.max(len, i-map.get(pre));
            }
            else map.put(pre,i);
        }

        return len;

    }


    public static void main(String[] args) {

        System.out.println(maxLength2(new int[]{15,-2,2,-8,1,7,10,23})); //5
        System.out.println(maxLength2(new int[]{2,10,4})); //0
        System.out.println(maxLength2(new int[]{1, 0, -4, 3, 1, 0})); //5
        
    }
    
}
