import java.util.Arrays;

public class ShortestJobFirst {

    static int solve(int bt[]) {
        int st = 0;
        Arrays.sort(bt);
        int wt = 0;

        for (int i = 0; i < bt.length; i++) {
            wt += st;
            st += bt[i];

        }
        

        return (wt / bt.length);

    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] { 1, 2, 3, 4 }));

    }
}