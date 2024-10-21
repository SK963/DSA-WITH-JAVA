import java.util.*;

public class MajorityElementII {

    // approach 1 :  using loop 
    public static List<Integer> majorityElement1(int arr[]){

        Set <Integer> set = new HashSet<>();
        int floor = arr.length/3;
        for(int i  = 0 ; i< arr.length ; i++){
            if(!set.contains(arr[i])){
                int count = 1;
                for(int j = i+1 ; (j< arr.length) && (count<=floor); j++){
                    if(arr[j] ==arr[i])count++;
                }

                if(count > floor) set.add(arr[i]);
            }
        }

        return new ArrayList<>(set);
    }

    // approach 2 : using hasmaps / hashing 
    // T : O(N) or O(N.longN) : S : O(N) 
    public static List<Integer> majorityElement2(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

     

        int req = arr.length/3;
        List<Integer> ans = new ArrayList<>();
        for( Map.Entry<Integer, Integer> element :map.entrySet()){
            if(element.getValue() > req) ans.add(element.getKey());

        }
        return ans;
        


        
    }

    // approach 3 :  using hashmaps and a modified approach
     // T : O(N) : S : O(N) 
    public static List<Integer> majorityElement3(int[] arr) {
        int req = arr.length/3;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i< arr.length; i++){
            if(!set.contains(arr[i])){
                int freq = map.getOrDefault(arr[i], 0);
                map.put(arr[i], freq+1);
                if(map.get(arr[i]) > req) set.add(arr[i]);
                if(set.size() == 2)break;
                
            }
        }
    
        return new ArrayList<>(set);

        
    }


    // approach 4 : Moore's Voting algorithm
    public static List<Integer> majorityElement4(int arr[]){

        // moore algo
        int cnt1 = 0 ; int el1 = -1;
        int cnt2 = 0 ; int el2 = -1;
        for(int i = 0 ; i<arr.length ;i++){
            if(cnt1 == 0 && arr[i] != el2){
                el1 = arr[i];cnt1++;
            }
            else if(cnt2 == 0 && arr[i] != el1){
                el2 = arr[i];cnt2++;
            }
            else if(arr[i] ==  el1) cnt1++;
            else if(arr[i] ==  el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        int req = arr.length/3;


        // checking the potential elements count
        int el1cnt = 0 , el2cnt =0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==el1)el1cnt++;
            else if(arr[i]==el2)el2cnt++;

        }

        List<Integer> ans = new ArrayList<>();
        if(el1cnt > req) ans.add(el1);
        if(el2cnt > req) ans.add(el2);

        return ans;

    }
    

    public static void main(String[] args) {
        System.out.println(majorityElement4(new int[]{3,2,3}).toString()); //[3]
        System.out.println(majorityElement4(new int[]{1}).toString()); //[1]
        System.out.println(majorityElement4(new int[]{1,2}).toString()); //[1,2]

    }
}
