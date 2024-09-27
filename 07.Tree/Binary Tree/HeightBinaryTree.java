import java.lang.Math;




public class HeightBinaryTree {

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

        int left  = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left , right);


    }


    public static void main(String[] args) {
        // Tree1 
        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  5 6  7 

        int val[] = {1,2,3,4,5,6,7};
        TreeNode tree1[] = new TreeNode[8];

        for(int i = 0 ; i<val.length ; i++){
            tree1[i+1] = new TreeNode(val[i]);
        }

        TreeNode root1 = tree1[1];
        tree1[1].left = tree1[2];
        tree1[1].right = tree1[3];
        tree1[2].left = tree1[4];
        tree1[2].right = tree1[5];
        tree1[3].left = tree1[6];
        tree1[3].right = tree1[7];

        System.out.println("Height of the tree :" + height(root1));
  
    
    }
}
