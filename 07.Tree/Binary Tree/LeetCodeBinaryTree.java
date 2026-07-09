import java.util.*;
public class LeetCodeBinaryTree{

    public static TreeNode buildTree(Integer[] arr) {

        if (arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {

            TreeNode curr = q.poll();

            if (arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }


    public static Integer[] treeToArray(TreeNode root) {

        if (root == null) return new Integer[]{};
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {
                result.add(null);
            } else {
                result.add(curr.val);
                q.add(curr.left);
                q.add(curr.right);
            }
        }

        // remove trailing nulls
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        TreeNode root = buildTree(new Integer[]{0, null, 1, null, 2, null, 3, null, 4});
        System.out.println(Arrays.toString(treeToArray(root)));
    }

}