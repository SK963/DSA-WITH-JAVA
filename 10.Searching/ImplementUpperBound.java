public class ImplementUpperBound {

    public static int upperBound(int[] arr, int x, int n) {

        int low = 0;
        int high = arr.length - 1;
        int ub = high+1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ub = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ub;
    }

    public static void main(String[] args) {
        System.out.println(upperBound(new int[] { 1, 2, 5, 6, 10 }, 10, 0));
        System.out.println(upperBound(new int[] { 1, 4, 7, 8, 10 }, 4, 0));

    }

}
