public class SearchInRotatedSortedArrayII {

    // T : O(n/2)
    public static boolean search(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low += 1;
                high -= 1;
            } else if (arr[low] <= arr[mid]) { // left part is sorted
                if (arr[low] <= x && x <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            } else { // right part is sorted
                if (arr[mid] <= x && x <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;

            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        System.out.println(search(new int[] { 1, 0, 1, 1, 1 }, 0));// edge cases
    }
}
