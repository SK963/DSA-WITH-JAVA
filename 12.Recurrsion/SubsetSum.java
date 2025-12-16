import java.util.*;

public class SubsetSum {

    // Time :
    // Space : 
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        sum(arr , 0 , 0, ans);
        Collections.sort(ans);
        return ans;
    }

    public static void sum(int arr[] , int index , int sum , ArrayList<Integer>ans){
        if(index == arr.length){
            ans.add(sum);
            return;
        }

        sum(arr , index+1 , sum ,ans);
        sum(arr,index+1 , sum+arr[index], ans);

    }


    // iterative approach : failed
    public static ArrayList<Integer> subsetSumsI(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int sum = 0;
        for(int i = 0 ; i< arr.length ; i++){
            sum = 0;
            for(int j = i ; j<arr.length ;j++){
                sum += arr[j];
                ans.add(sum);
            }
        }

        Collections.sort(ans);
        return ans;
    }





    public static void main(String[] args) {

        System.out.println(subsetSums(new int[]{2,3}));//[0, 2, 3, 5]
        System.out.println(subsetSums(new int[]{1, 2, 1}));//[0, 1, 1, 2, 2, 3, 3, 4]
        System.out.println(subsetSums(new int[]{5, 6, 7})); //[0, 5, 6, 7, 11, 12, 13, 18]
        System.out.println(subsetSums(new int[]{10,89,34}));//0 10 34 44 89 99 123 133
        
    }
}
