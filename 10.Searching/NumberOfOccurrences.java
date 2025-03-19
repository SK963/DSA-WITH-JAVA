public class NumberOfOccurrences {
    static int countFreq(int[] arr, int x) {
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

        if(first == -1)return 0;
        
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

        return  last-first+1 ;
    }

    public static void main(String[] args) {
        System.out.println(countFreq(new int[]{1, 1, 2, 2, 2, 2, 3}, 2));
    }
    
}
