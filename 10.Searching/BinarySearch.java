public class BinarySearch {

    // iterative approach
    // T : O(logn)(base:2)
    public static int binarySearch(int arr[], int num) {

        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] > num)
                high = mid - 1;
            else if (arr[mid] < num)
                low = mid + 1;
            else
                return mid;

        }

        return -1;
    }

    // recursive approach
    // T :

    public static int binarySearch2(int arr[], int num) {

        int ind = RBS(arr, num, 0, arr.length - 1);
        return ind;

    }

    static int RBS(int arr[], int target, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return RBS(arr, target, low, mid - 1);
        else
            return RBS(arr, target, mid + 1, high);

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8));
        System.out.println(binarySearch2(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8));
    }

}
