import java.util.Arrays;

public class JumpGame {

    // brute
    public static boolean canJump(int[] nums) {
        boolean reached[] = new boolean[nums.length];
        reached[0] = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (reached[i]) {
                for (int j = 0; (j <= nums[i]) && (i + j < nums.length); j++) {
                    reached[i + j] = true;
                }
            } else
                return false;
            if (reached[nums.length - 1])
                return true;
        }

        return reached[reached.length - 1];

    }

    // approach max var
    public static boolean canJump2(int nums[]) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= nums.length - 1)
                return true;
            if (i > max)
                return false;
            max = Integer.max(max, i + nums[i]);

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump2(new int[] { 2, 3, 1, 1, 4 }));// true
        System.out.println(canJump2(new int[] { 3, 2, 1, 0, 4 }));// false
        System.out.println(canJump2(new int[] { 0 }));// true
        System.out.println(canJump2(new int[] { 0, 2, 3 }));// false
    }

}
