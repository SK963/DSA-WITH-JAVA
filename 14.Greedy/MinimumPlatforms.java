import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinimumPlatforms {

    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        int time[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            time[i][0] = arr[i];
            time[i][1] = dep[i];
        }

        Arrays.sort(time, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            else
                return Integer.compare(a[1], b[1]);
        });
        System.out.println(Arrays.deepToString(time));

        
        PriorityQueue<Integer> last = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int narr = time[i][0];
            int ndep = time[i][1];

            if (!last.isEmpty()) {
                if (last.peek() < narr)
                    last.poll();
                last.add(ndep);

            } else
                last.add(ndep);

        }

        return last.size();

    }

    public static void main(String[] args) {
        System.out.println(findPlatform(new int[] { 900, 940, 950, 1100, 1500, 1800 },
                new int[] { 910, 1200, 1120, 1130, 1900, 2000 }));// 3
        System.out.println(findPlatform(new int[] { 900, 935, 1100 }, new int[] { 1200, 1240, 1130 })); // 3
        System.out.println(
                findPlatform(new int[] { 1114, 825, 357, 1415, 54 }, new int[] { 11740, 1110, 2238, 1535, 2323 })); // 4
        System.out.println(findPlatform(new int[] { 626, 504, 256, 1133, 1232, 920, 1851, 524, 1353, 1723 },
                new int[] { 1102, 1829, 638, 1853, 1853, 1128, 2138, 2241, 1609, 2048 })); // 5

    }
}