import java.util.*;


public class SubarrayWithGivenXOR {


    // approach 1 : 2 loops 
    public static int subarrayCount(int[] arr, int target) {

        List<List<Integer>> xorlist = new ArrayList<>();

        int count =0;

        for(int i = 0 ; i< arr.length; i++){
            int xorsum =arr[i];
            if(arr[i] == target){
                count++;
                xorlist.add(List.of(arr[i]));

            } 
            for(int j = i+1 ; j<arr.length;j++){
                if((xorsum ^= arr[j]) == target){
                    count++;
                    List<Integer> temp = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        temp.add(arr[k]);
                    }
                    xorlist.add(temp);
                }

            }
        }

        System.out.println("xorlist : " + xorlist.toString());
        return count;

    }

    // approach 2 : using hasmap and
    public static int subarrayCount2(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int xorsum= 0;
        map.put(xorsum,1);

        for(int i = 0 ; i< arr.length; i++ ){

            xorsum = xorsum^arr[i];
            int req = xorsum^target;
            if(map.containsKey(req)) count += map.get(req);
            map.put(xorsum, map.getOrDefault(xorsum, 0)+1);
            
        }
        

        return count;

        
    }


    public static void main(String[] args) {

        System.out.println(subarrayCount2(new int[]{4, 2, 2, 6, 4} , 6));
        //output: 4
        System.out.println(subarrayCount2(new int[]{5, 6, 7, 8, 9} , 5));
        //2
        
    }
    
}
