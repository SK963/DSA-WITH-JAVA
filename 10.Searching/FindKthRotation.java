import java.util.Arrays;
import java.util.List;

public class FindKthRotation {

    // approach : searciing maximum
    public static int findKRotation(List<Integer> arr) {

        int low = 0;
        int high = arr.size() - 1;

        int ans = high;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr.get(low) <= arr.get(mid)) {
                ans = (arr.get(ans) <= arr.get(mid)) ? mid : ans;
                low = mid + 1;
            } else {
                ans = (arr.get(ans) <= arr.get(low)) ? low : ans;
                high = mid - 1;

            }
        }

        return (ans == arr.size() - 1) ? 0 : ans + 1;

    }

    // approach : searching mininmum
    public static int findKRotation2(List<Integer> arr) {
        int low = 0, high = arr.size() - 1;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            // search space is already sorted
            // then arr[low] will always be

            // the minimum in that search space:
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < arr.get(ans))
                    ans = low;
                break;
            }

            // if left part is sorted:
            if (arr.get(low) <= arr.get(mid)) {
                // keep the minimum:
                ans = (arr.get(ans) <= arr.get(low)) ? ans : low;
                // Eliminate left half:
                low = mid + 1;

            } else { // if right part is sorted:

                // keep the minimum:
                ans = (arr.get(ans) <= arr.get(mid)) ? ans : mid;

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findKRotation2(Arrays.asList(5, 1, 2, 3, 4))); // 1
        System.out.println(findKRotation2(Arrays.asList(1, 2, 3, 4, 5))); // 0
        System.out.println(findKRotation2(Arrays.asList(6, 7, 8, 1, 2, 3, 4, 5)));// 3
    }

}
