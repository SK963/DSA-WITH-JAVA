import java.util.Arrays;

public class FirstAndLastOccurence {
    public static int[] searchRange(int[] nums, int target) {

        int index[] = { -1, -1 };
        if (nums.length == 0) {
            return index;
        }

        int start = 0, end = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target)
                start = mid;
            else if (nums[mid] > target)
                end = mid;
            else {
                index[0] = index[1] = mid;
                break;

            }
        }

        int i = index[0];

        while (i < nums.length && nums[i] <= target) {
            index[1] = i;
            i++;
        }

        return index;

    }

    // using the concept of ceil /lower bound and upper bound
    public static int[] searchRange2(int arr[], int x) {
        int start = ceil(arr, x);
        if (start == -1 || arr[start] != x)
            return new int[] { -1, -1 };

        int end = upperBound(arr, x) - 1;
        return new int[] { start, end };
    }

    public static int ceil(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }

    public static int upperBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int ub = high + 1;

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


    // raw code : modified binary search 
    public static int[] searchRange3(int arr[], int x) {
        
        //first occurence
        int low = 0, high = arr.length - 1;
        int first = -1;
        
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        if(first == -1)return new int[]{-1,-1};
        
        //last occurence
        low = 0;
        high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return new int[] { first, last };

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange3(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));
        // System.out.println(ceil(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
    }

}
