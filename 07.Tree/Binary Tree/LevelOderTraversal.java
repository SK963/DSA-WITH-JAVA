import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {
        }
    
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lot = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return lot;

        q.add(root);

        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);

                sublist.add(q.poll().val);
            }

            lot.add(sublist);

        }
        return lot;
    }

    public static void levelorder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            for (int i = 0; i < q.size(); i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);

                System.out.print(q.poll().val + " ");

            }

        }

    }

    public static void main(String[] args) {
        //     3
        //    / \
        //   9   20
        //       / \
        //      15  7
        
        TreeNode node9 = new TreeNode(9);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode root = new TreeNode(3, node9, node20);

        List<List<Integer>> lot = levelOrder(root);

        System.out.println(lot);
        levelorder(root);

        // Expected output : [[3],[9,20],[15,7]]
    }

}
