

public class ChildrenSumInABinaryTree {

    public static boolean isSumProperty(TreeNode root) {

        if(root == null) return true;
        else if (root.left == null && root.right == null)return true; //leaf 
        
        
        if (root.left == null) return  (isSumProperty(root.right) && root.data == root.right.data);
        if (root.right == null) return (isSumProperty(root.left) && root.data == root.left.data);
        
        
        return (isSumProperty(root.left) && isSumProperty(root.right) && (root.left.data + root.right.data == root.data));

    }


    public static void main(String[] args) {
        System.out.println(isSumProperty(new BinaryTree(new Integer[]{35, 20, 15, 15, 5, 10, 5}).getRoot()));
        System.out.println(isSumProperty(new BinaryTree(new Integer[]{1, 4, 3, 5}).getRoot()));
    }
    
}
