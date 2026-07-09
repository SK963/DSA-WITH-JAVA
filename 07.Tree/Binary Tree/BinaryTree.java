import java.util.*;

public class BinaryTree {

    private TreeNode root;

    // Constructor builds the tree
    public BinaryTree(Integer[] arr) {
        this.root = buildTree(arr);
    }

    // Getter so user can access the root
    public TreeNode getRoot() {
        return this.root;
    }

    private TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Integer[]{1, 3, 2, 5, 3, null, 9});
        TreeNode root = tree.getRoot();
        System.out.println(root.val);
    }
}