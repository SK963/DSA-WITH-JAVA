import java.util.*;

public class ReplaceElementsByItsRankInTheArray {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    static int[] replaceWithRank(int arr[]) {
        // code here
        int N = arr.length;
        int ans[] = new int[N];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int i = 0; i < N; i++) {
            pq.add(new Pair(arr[i], i));
        }

        int rank = 0;

        int prev = Integer.MIN_VALUE;

        while (!pq.isEmpty()) {
            Pair me = pq.remove();
            int num = me.value;
            int ind = me.index;

            if (prev == Integer.MIN_VALUE || prev != num) {
                rank++;
            }

            ans[ind] = rank;
            prev = num;

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceWithRank(new int[] { 100, 5, 70, 2 })));
    }

}
