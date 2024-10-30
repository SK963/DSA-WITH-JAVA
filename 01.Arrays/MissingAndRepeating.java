import java.util.*;

public class MissingAndRepeating {

    // using hashmap or hasharray
    // T : O(n) 
    // S : O(n)
    public static int[] findTwoElement1(int arr[]) {
        
        int missing = arr[0];
        int repeating = arr[0];

        Map<Integer,Integer> map =  new HashMap<>();
        
   
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);           
        }

        for(int i = 1 ; i<= arr.length ;i++){
            if(map.containsKey(i)){
                Integer count = map.get(i);
                if(count == 2) repeating = i;
            }else missing = i;
        }

        return new int[]{repeating,missing};
        
    }


    // approach : Mathematical equations 
    // T : O(n)
    // S : O(1)
    public static int[] findTwoElement3(int arr[]) {
        long n = arr.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int)x, (int)y};

    }


    // approach :  XOR operations



    public static void main(String[] args) {

        System.out.println(Arrays.toString(findTwoElement3(new int[]{2,2})));
        // [2 , 1] : repeating no , missing number
        System.out.println(Arrays.toString(findTwoElement3(new int[]{1,3,3})));
        // [3 , 2]
        System.out.println(Arrays.toString(findTwoElement3(new int[]{8,6,2,3,1,5,7,4,10,1})));
        //[1 ,9]
        System.out.println(Arrays.toString(findTwoElement3(new int[]{1,1,2,3,4})));
        //[1,5]

        
    }
    
}
