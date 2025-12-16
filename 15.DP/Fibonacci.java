import java.util.*;

// creating a list of size n with all elements as -1 without loop
// ArrayList<Long> dp = new ArrayList<>(Collections.nCopies(n, -1));
import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {

    static final long MOD = 1000000007; //limiting the answer withing int limit

    static long topDown(int n) {
        ArrayList<Long> dp = new ArrayList<>(Collections.nCopies(n + 1, -1L));
        return fibtopDown(n, dp);
    }

    static long fibtopDown(int n, ArrayList<Long> dp) {
        if (n <= 1) return n;
        if (dp.get(n) != -1) return dp.get(n);
        dp.set(n, fibtopDown(n - 1, dp) + fibtopDown(n - 2, dp));
        return dp.get(n)%MOD;
    }

    static long bottomUp(int n) {
        if (n <= 1) return n;
        ArrayList<Long> dp = new ArrayList<>(Collections.nCopies(n + 1, -1L));
        dp.set(0, 0L);
        dp.set(1, 1L);
        for (int i = 2; i <= n; i++) {
            dp.set(i, (dp.get(i - 1) + dp.get(i - 2))%MOD);
        }
        return dp.get(n);
    }

    //space optimized bottom up
    static long bottomUpSpaceOptimized(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c%MOD;
    }

    public static void main(String[] args) {
        System.out.println(topDown(5));
        System.out.println(topDown(697));
        System.out.println(bottomUp(5));
        System.out.println(bottomUp(697));
    }
}