public class JumpGameII {

    // recurrsion / dp
    public static int jump(int[] nums) {
        return jumphelp(nums, 0, 0);

    }

    static int jumphelp(int nums[], int ind, int jumps) {

        if (ind >= nums.length - 1)
            return jumps;

        int min = Integer.MIN_VALUE;
        for (int i = ind; i < nums[ind]; i++) {
            min = Integer.min(min, jumphelp(nums, ind + i, jumps + 1));

        }
        return min;

    }

    // approach : greedy

    public static int jump2(int nums[]) {
        int jumps = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;

        while (r < n - 1) {
            int far = 0;
            for (int i = l; i <= r; i++)
                far = Integer.max(far, i + nums[i]);

            l = r + 1;
            r = far;
            jumps++;
        }

        return jumps;

    }

    public static void main(String[] args) {
        System.out.println(jump2(new int[] { 2, 3, 1, 1, 4 }));// 2
        System.out.println(jump2(new int[] { 0 }));// 0

    }
}