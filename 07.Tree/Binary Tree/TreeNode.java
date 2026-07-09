
public class TreeNode {
    int val;
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = this.data =val;
        this.left = this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = this.data = val;
        this.left = left;
        this.right = right;
    }

}