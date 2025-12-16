import java.util.*;

public class PrimeFactorizationUsingSieve {

    // Normal approach / School method
    // T : O(N)
    static List<Integer> findPrimeFactors(int N) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                ans.add(i);
            }
        }

        if (N != 1)
            ans.add(N);

        return ans;
    }

    static void sieve() {
    }

    // spf : smallest prime factor
    // T :O(logn)
    // S :O(n)

    static List<Integer> findPrimeFactors2(int N) {

        // storing spf using sieve : N
        int spf[] = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            spf[i] = i;
        }

        // N.loglogN
        for (int i = 2; i * i <= N + 1; i++) { 
            if (spf[i] == i) {
                for (int j = i * i; j < N + 1; j += i)
                    if (spf[j] == j)
                        spf[j] = i;

            }
        }

        // System.out.println(Arrays.toString(spf));

        List<Integer> ans = new ArrayList<>();
        while (N != 1) {
            ans.add(spf[N]);
            N /= spf[N];

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findPrimeFactors2(30)); // [2,3,5]
        System.out.println(findPrimeFactors(12246));
    }
}
