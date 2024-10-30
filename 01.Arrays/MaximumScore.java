import java.util.*;

public class MaximumScore {

    public static int pairWithMaxSum(List<Integer> nums) {
        int i =0 , j = i+1;
        int maxsum = 0;

        for(i = 0  ; i< nums.size(); i++){
            for(j = i+2 ; j< nums.size() ; j++){
                int small = Integer.MAX_VALUE , second_small = Integer.MAX_VALUE;
                for (int k = i; k < j ; k++)
                    small = Math.min(small,nums.get(k));
                
                for (int k = i ;k < j ; k++)
                    if (nums.get(i) < second_small && nums.get(k) != small)
                        second_small = nums.get(k);
                
                if(small == second_small)
                    second_small = 0;

                maxsum = Integer.max(maxsum, small + second_small);
                System.out.println("the maxsum "+ maxsum +" "+ (small+second_small));

            }
        }

        return maxsum;

    }


    public static void main(String[] args) {
         System.out.println(pairWithMaxSum(Arrays.asList(4, 3, 1, 5, 6)));
    }
    
}
