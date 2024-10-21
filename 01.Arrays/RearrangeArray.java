import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray{

    // T : O(n)  , S :O(n)
    public static  int[] rearrangeArray1(int[] arr) {

        int ans[] = new int[arr.length];
        int pos = 0 , neg = 1;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }

                     
        }
        return ans;
       
        
    
    }
    
    // T : 2N / O(N) , S : O(N)
    public static  int[] rearrangeArray2(int[] arr) {

        // two arrays for the positives and negatives
        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();

        for(int i = 0 ;  i< arr.length ; i++){
            if(arr[i] > 0)
                pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        //modifing the original arr
        int common =  Integer.min(pos.size(), neg.size());
        for(int i = 0 ; i< common; i ++){
            arr[2*i] = pos.get(i);
            arr[(2*i)+1] =  neg.get(i);

        }

        // if the size of positives and negatives are different in the orignal arr
        for(int i = common ; i < Integer.max(pos.size(), neg.size()) ; i++ ){
            if(pos.get(i)!= null) arr[i] = pos.get(i);
            else neg.get(i);
        }

        return arr;

    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray2(new int[]{3,1,-2,-5,2,-4}))); //3,-2,1,-5,2,-4
        System.out.println(Arrays.toString(rearrangeArray2(new int[]{-1,1}))); //[1,-1]
        System.out.println(Arrays.toString(rearrangeArray2(new int[]{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31}))); //index out of bound
        // [28, -41, 22, -8, 46, -37, 35, -9, 18, -6, 19, -26, 15, -37, 14, -10, 31, -9]
    }
}