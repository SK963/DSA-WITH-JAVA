import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BurstBallons {
   public static int maxCoins(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for (int n : nums) {
            num.add(n);
        }
        
        AtomicInteger sum = new AtomicInteger(0);
        burst(num, sum);
        return sum.get();
    }

    public static void burst(List<Integer> num, AtomicInteger sum) {
        if (num.isEmpty()) return;

        int mid = (num.size() % 2 == 0) ? (num.size() / 2) - 1 : (num.size() / 2);
        
        int current = num.get(mid);
        int prev = (mid - 1 >= 0) ? num.get(mid - 1) : 1;
        int next = (mid + 1 < num.size()) ? num.get(mid + 1) : 1;

        sum.addAndGet(current * prev * next);
        num.remove(mid);

        burst(num, sum); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{3, 1, 5, 8})); // Expected output: correct balloon bursting sum
    }


    
}
