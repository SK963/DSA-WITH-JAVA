import java.util.*;

public class NextPermutation {

    // approach 1 : gererate all permutation and return the next one
    // T : // T: O(N! x N) recurssion for genrating all permutations +
    // O(N)(searching)
    public static void nextPermutation1(Integer[] nums) {
        List<List<Integer>> permuatations = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        recpermute(nums, freq, ds, permuatations);
        List<Integer> current = Arrays.asList(nums);

        // System.out.println(permuatations.toString());
        // System.out.println(current.toString());

        int i = 1;
        for (List<Integer> ls : permuatations) {
            if (!ls.equals(current))
                i++;
            else
                break;
        }

        System.out.println(permuatations.get(i).toString());

    }

    private static void recpermute(Integer[] nums, boolean freq[], List<Integer> ds,
            List<List<Integer>> permuatations) {
        if (ds.size() == nums.length) {
            permuatations.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recpermute(nums, freq, ds, permuatations);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    // -----------------------------------------------------------------------------------------
    // approach 2 :
    public static void nextPermutation2(int[] nums) {
        // 1. finding the break point (wher i < i+1)
        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            Arrays.sort(nums);
            return ;
        }

        // 2.Find the next greater element and swap it with arr[ind]:
        for (int i = nums.length - 1; i > ind; i--) {
            if (nums[ind] < nums[i]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }

        }

        // 3. sort the rest of the array from index to the end of the array
        Arrays.sort(nums, ind + 1, nums.length);
        

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 3, 2, 1 };
        int arr3[] = { 2, 1, 5, 4, 3, 0, 0 };
        nextPermutation2(arr1);
        System.out.println(Arrays.toString(arr1));
        nextPermutation2(arr2);
        System.out.println(Arrays.toString(arr2));
        nextPermutation2(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}