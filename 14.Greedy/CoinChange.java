import java.util.*;

public class CoinChange {

    public static int minCoins(int coins[], int sum) {

        List<Integer> denoms = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (coins[i] <= sum) {
                sum -= coins[i];
                denoms.add(coins[i]);
            }
        }

        System.out.println(denoms.toString());
        return denoms.size();

    }

    public static void main(String[] args) {
        System.out.println(minCoins(new int[] { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 }, 49));

    }

}
