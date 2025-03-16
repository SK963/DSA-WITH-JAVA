public class  ImplementLowerBound {

    // index such that arr[index] >= k and index is the smallest
    static int findFloor(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;
        int lb = arr.length; // hypothetical index

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] >= k) {
                lb = mid;
                high = mid - 1;
            } else
                low = mid + 1;

        }

        return lb;
    }

    public static void main(String[] args) {

        System.out.println(findFloor(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 10, 11 }, 9));
        System.out.println(findFloor(new int[] { 1, 2, 8, 10, 11, 12, 19 }, 0));
        System.out.println(findFloor(new int[] { 1, 2, 8, 10, 11, 12, 19 }, 5));

    }

}
