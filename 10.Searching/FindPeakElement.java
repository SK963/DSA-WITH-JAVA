public class FindPeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int low = 1;
        int high = n - 2;

        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                break;
            else if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else if(arr[mid] > arr[mid+1])high = mid-1;
            else low = mid+1;

        }

        return mid;

    }

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
        System.out.println(findPeakElement(new int[] { 3, 4, 3, 2, 1 }));

    }

}
