import java.util.*;

public class MinimumSwapsToSort{

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Create an array of pairs where each pair contains an element and its index
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        
        // Sort the array based on the elements
        Arrays.sort(arr, Comparator.comparingInt(pair -> pair.value));
        
        // To keep track of visited elements
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        
        int swaps = 0;
        
        // Traverse array elements
        for (int i = 0; i < n; i++) {
            // If element is already visited or it is already in the correct position
            if (visited[i] || arr[i].index == i) {
                continue;
            }
            
            // Find out the number of nodes in this cycle
            int cycle_size = 0;
            int j = i;
            
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j].index;
                cycle_size++;
            }
            
            // Update swap count by adding current cycle size - 1
            if (cycle_size > 1) {
                swaps += (cycle_size - 1);
            }
        }
        
        return swaps;
    }

    



    public static void main(String[] args) {
        int[] nums1 = {2, 8, 5, 4};
        int[] nums2 = {10, 19, 6, 3, 5};
        int[] nums3 = {7, 16, 14, 17, 6, 9, 5, 3, 18};

        System.out.println(minSwaps(nums1)); // Output: 1
        System.out.println(minSwaps(nums2)); // Output: 2
        System.out.println(minSwaps(nums3)); // Output: 5
    }
}
