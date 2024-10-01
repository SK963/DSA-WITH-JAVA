import java.util.*;

public class MajorityElement {

    // approach : using hashing to store the count 
    // T : O(n) + O(nlogn)(ordered/sorted map) -> O(n^2)(unordered) , S : O(1) (exactly to the count of unique elements)
    public static int majorityElement(int[] arr) {
        int majcount = 0 , num = arr[0];
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i = 0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else  map.put(arr[i], 1);
            if(majcount < map.get(arr[i])){
                num = arr[i];
                majcount = map.get(arr[i]);
            }
            


        }
        
        if(majcount > Math.floor(arr.length/2))
            return num;

        return -1;
    }


    // approach2 : Moore's Voting algorithm
    // step 1: apply voting alog 
    // step 2 : verify 
    // T : O(n) S: O(1)
    public static int majorityElement2(int[] arr) {

        //size of the given array:
        int n = arr.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;


    }
        



    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[] {3,2,3})); //3
        System.out.println(majorityElement2(new int[]{2,2,1,1,1,2,2}));  //2
        System.out.println(majorityElement2(new int[]{6,5,5})); //5
    }
    
}
