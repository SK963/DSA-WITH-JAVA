import java.util.*;

public class RootToNodePath {
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

    private static boolean path(List<Integer> possiblepath ,TreeNode root , TreeNode node){
        if(root == null) return false;
        possiblepath.add(root.val);
        if(root.val == node.val) return true;
        if(path(possiblepath , root.left , node) || path(possiblepath , root.right , node))
            return true;
        
        possiblepath.remove(possiblepath.size()-1);
        return false;
        

        
    }

    public static List<Integer> Path(TreeNode root , TreeNode node){
        List<Integer> path = new ArrayList<>();
        if(root == null ) return path;
        path(path, root , node);
        return path;
       


    }


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
        TreeNode p = tree1[3].left = tree1[6];
        tree1[3].right = tree1[7];

        System.out.println("path between root and node for  tree1 : " + Path(root1,p).toString());

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
        TreeNode node = tree2[9];

        System.out.println("path between root and node for  tree2 : " + Path(root2 , node).toString());

    }
    
}
