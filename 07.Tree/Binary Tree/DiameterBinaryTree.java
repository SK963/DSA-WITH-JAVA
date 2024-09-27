import java.lang.Math;



public class DiameterBinaryTree {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int data){
            this.data = data;
            this.right = null;
            this.left = null;
    
        }

        
    }

    public static int height(TreeNode root){
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left , right) +1 ;

    }

    


    public static int path(TreeNode root){
        if(root == null)
            return 0;
        
        int left = height(root.left) ;
        int right = height(root.right);

        return left+right;

    }


    public static int Diameter(TreeNode root){
        int current = path(root);
        int left = path(root.left);
        int right = path(root.right);

        return Math.max(Math.max(left , right), current);
    }


    // Create Tree
    public static TreeNode insertLevelOrder(Integer[] arr, int i) {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode root = new TreeNode(arr[i]);

            // Insert left child
            if(arr[2 * i + 1] !=  null)
                root.left = insertLevelOrder(arr, 2 * i + 1);

            // Insert right child
            if(arr[2 * i + 2] !=  null)
                root.right = insertLevelOrder(arr, 2 * i + 2);

            return root;
        }
        return null;
    }




    public static void main(String[] args) {
    
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
 
        TreeNode tree1[] = new TreeNode[10];
        
        
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


        System.out.println("Diameter of the tree1 : " + Diameter(root1));

        // // tree 2 : Exception 
        
        // Integer arr[] =  {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2};
        // System.out.println(Arrays.toString(arr));

        // TreeNode root2 = insertLevelOrder(arr,0);
        // System.out.println("Diameter of the tree2 :" + Diameter(root2));


    }
    
    
}
