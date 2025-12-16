import java.util.*;

public class AllDivisorOfANumber {

    public static void print_divisors(int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans.add(i);
                ans.add(n / i);
            }
        }

        Collections.sort(ans);
        String a = ans.toString();

        System.out.println(a.substring(1, a.length() - 1).replaceAll(",", ""));

    }

    public static void main(String[] args) {

        print_divisors(20);

    }

}
