public class MinimumInSortedArray {

    public static int findMin(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid;

        }

        return arr[start];
    }

    public static int findMin2(int arr[]) {

        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;

            // search space is already sorted
            // then arr[low] will always be
            
            // the minimum in that search space:
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                ans = Math.min(ans, arr[low]);

                // Eliminate left half:
                low = mid + 1;

            } else { // if right part is sorted:

                // keep the minimum:
                ans = Math.min(ans, arr[mid]);

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] { 3, 4, 5, 1, 2 }));

    }

}
