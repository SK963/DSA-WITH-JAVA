
public class MaximumPathSum {
    
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }


    private static int MaxPath(TreeNode root, int[] maxi) {
        
        if (root == null) {
            return 0;
        }


        int left = Math.max(0, MaxPath(root.left, maxi));
        int right = Math.max(0, MaxPath(root.right, maxi));

        maxi[0] = Math.max(maxi[0], left + right + root.val);


        return Math.max(left, right) + root.val;
    }


    public static int maxPathSum(TreeNode root) {

        int[] maxi = {Integer.MIN_VALUE};
        MaxPath(root, maxi);

        return maxi[0];
    }



    public static void main(String[] args) {
        // Tree1
        //    0
        //   / \
        //  1   2
        // /     \
        // 3      4
        // /      \
        // 5      6

        // tree 1
        TreeNode tree1[] = new TreeNode[7];
        for (int i = 0; i < tree1.length; i++) {
            tree1[i] = new TreeNode(i);
        }

        TreeNode root1 = tree1[0];
        tree1[0].left = tree1[1];
        tree1[0].right = tree1[2];
        tree1[1].left = tree1[3];
        tree1[2].right = tree1[4];
        tree1[3].left = tree1[5];
        tree1[4].right = tree1[6];

        System.out.println("Maximum path sum for tree1 : " + maxPathSum(root1));

        // Tree2
        // -10
        // / \
        // 9  20
        //    / \
        //   15  7

        int arr2[] = { -10, 9, 20, 15, 7 };
        TreeNode tree2[] = new TreeNode[arr2.length+1];
        for (int i = 0; i < arr2.length; i++) {
            tree2[i+1] = new TreeNode(arr2[i]);
        }

        TreeNode root2 = tree2[1];
        tree2[1].left = tree2[2];
        tree2[1].right = tree2[3];
        tree2[3].left = tree2[4];
        tree2[3].right = tree2[5];

        System.out.println("Max path sum for tree2 : " + maxPathSum(root2));
        
    }
}
