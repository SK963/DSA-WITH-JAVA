import java.util.ArrayList;


public class AllPossiblePaths {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;

        }
    }

    // ----------------------------------------------------------------------------


    public static ArrayList<ArrayList<Integer>> Paths(TreeNode root){
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        if(root == null) return paths;
        
        path(root , paths, new ArrayList<>());
        return paths;
    }

    private static void path(TreeNode node, ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        if (node.left != null)
            path(node.left, paths, new ArrayList<>(path));
        if (node.right != null)
            path(node.right, paths, new ArrayList<>(path));

    }

    // -----------------------------------------------------------------------
    public static void main(String[] args) {
        // Tree1
        //    1
        //   / \
        //  2   3
        // / \ / \
        // 4 5 6 7

        int val[] = { 1, 2, 3, 4, 5, 6, 7 };
        TreeNode tree1[] = new TreeNode[8];

        for (int i = 0; i < val.length; i++) {
            tree1[i + 1] = new TreeNode(val[i]);
        }

        TreeNode root1 = tree1[1];
        tree1[1].left = tree1[2];
        tree1[1].right = tree1[3];
        tree1[2].left = tree1[4];
        tree1[2].right = tree1[5];
        tree1[3].left = tree1[6];
        tree1[3].right = tree1[7];

        System.out.println("all possible paths of tree1 : " + Paths(root1).toString());

        // Tree2 
        //           1
        //         /   \
        //       2      3
        //     /  \    / \
        //    4    10 9   10
        //    \
        //     5   
        //      \
        //       6

        int values[] = { 1, 2, 3, 4, 10, 9, 10, 5, 6 };

        TreeNode tree2[] = new TreeNode[values.length + 1];

        for (int i = 0; i < values.length; i++) {
            tree2[i + 1] = new TreeNode(values[i]);
        }

        TreeNode root2 = tree2[1];

        tree2[1].left = tree2[2];
        tree2[1].right = tree2[3];

        tree2[2].left = tree2[4];
        tree2[2].right = tree2[5];

        tree2[3].left = tree2[6];
        tree2[3].right = tree2[7];

        tree2[4].right = tree2[8];
        tree2[8].right = tree2[9];

        System.out.println("all possible paths of  tree1 : " + Paths(root2).toString());

    }

    // all possible paths of tree1 : [[1, 2, 4], [1, 2, 5], [1, 3, 6], [1, 3, 7]]
    // all possible paths of  tree1 : [[1, 2, 4, 5, 6], [1, 2, 10], [1, 3, 9], [1, 3, 10]]


}
