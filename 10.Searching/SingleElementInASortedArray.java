public class SingleElementInASortedArray {

    public static int singleNonDuplicate(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        if(high == 0)return arr[0];
        if(arr[low] != arr[low+1]) return arr[0];
        if(arr[high] != arr[high -1]) return arr[high];

        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            
            if((arr[mid] != arr[mid - 1]) && (arr[mid] != arr[mid + 1]))break;

            if (mid % 2 != 0) {
                if (arr[mid] != arr[mid - 1])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] != arr[mid + 1])
                    high = mid;
                else
                    low = mid;
            }

        }
        return arr[mid];

    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 })); // 2
        System.out.println(singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 })); // 10

    }
}