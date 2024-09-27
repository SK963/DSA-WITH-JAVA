public class DiameterOfBinaryTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }

    }

    public static int diameter(TreeNode root) {

        int[] diameter = new int[1];
        diameter[0] = 0;

        height(root, diameter);

        return diameter[0];
    }


    private static int height(TreeNode node, int[] diameter) {

        if (node == null) {
            return 0;
        }


        int lh ;
        int rh ;
        lh = height(node.left, diameter);
        rh = height(node.right, diameter);

        diameter[0] = Math.max(diameter[0], lh + rh);


        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {
        TreeNode tree1[] = new TreeNode[10];
    
    // tree1 : Diameter :9->5->4->3->6->->7->8  : 7
    //      1
    //     / \
    //    2   3
    //       / \
    //      4   6
    //     /     \
    //    5       7
    //   /         \
    //  9           8
        
        for(int i = 1 ; i< tree1.length ; i++){
            tree1[i]  =  new TreeNode(i);
        }
        
        TreeNode root1 = tree1[1];
        tree1[1].left = tree1[2];
        tree1[1].right = tree1[3];
        tree1[3].left = tree1[4];
        tree1[3].right = tree1[6];
        tree1[4].left = tree1[5];
        tree1[6].right = tree1[7];
        tree1[5].left = tree1[9];
        tree1[7].right = tree1[8];


        System.out.println("Diameter of the tree1 : " + diameter(root1));
    }

}
