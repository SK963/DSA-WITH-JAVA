import java.util.*;

public class PrimeFactors {
    
    // school method 
    // T : O(sqrt(n))
    public static int[] AllPrimeFactors(int N) {

        if (N == 1)
            return new int[] {};
        Set<Integer> set = new LinkedHashSet<>();

        int i = 2;
        while (i*i <= N) {
            if (N % i == 0) {
                set.add(i);
                N /= i;
            } else i++;

        }

        if (N != 1) set.add(N);
        
        i = 0;
        int ans[] = new int[set.size()];
        for (Integer num : set)ans[i++] = num;
        
        return ans;
        
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(AllPrimeFactors(36)));
        System.out.println(Arrays.toString(AllPrimeFactors(43)));
        System.out.println(Arrays.toString(AllPrimeFactors(34)));
        System.out.println(Arrays.toString(AllPrimeFactors(4)));
        System.out.println(Arrays.toString(AllPrimeFactors(2)));

    }
}