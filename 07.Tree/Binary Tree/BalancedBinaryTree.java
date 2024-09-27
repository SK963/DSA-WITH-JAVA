import java.lang.Math;

public class BalancedBinaryTree {
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

    // Approach 1 using the height : problem t =  O(N^2)
    public static int height(TreeNode root){

        if(root == null)
            return 0;

        int left  = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left , right);


    }

    public static boolean isbalanced(TreeNode root){
        if(root == null)
            return true;
        
        
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) > 1){
            return false;
        }
        if(isbalanced(root.left) &&  isbalanced(root.right)){
            return true;
        }
        
        return false;
        

    }


    // Approach2  : using the modified height function which will return -1 inspite 
    // the height which will tell that is not balanced

    public static boolean isBalanced(TreeNode root){
        return check(root) != -1;
    }

    public static int check(TreeNode root){
        if(root == null)
            return 0;

        int left  = check(root.left);
        if(left == -1) return -1;
        int right = check(root.right);
        if( right == -1) return -1;
        

        if(Math.abs(left - right)  >  1) return -1;

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

        System.out.println("Balanced Tree status : "+ isbalanced(root1));

            //         0
            //       /   \
            //      1     2
            //     /       \
            //    3         4
          //     /           \
          //    5             6
            
        
             // tree 2
        TreeNode tree2[] = new TreeNode[7] ;
        for(int i = 0 ; i< tree2.length ; i++){
            tree2[i] = new TreeNode(i);  
        }

        TreeNode root2 = tree2[0];
        tree2[0].left = tree2[1];
        tree2[0].right = tree2[2];
        tree2[1].left = tree2[3];
        tree2[2].right = tree2[4];
        tree2[3].left = tree2[5];
        tree2[4].right = tree2[6];


        System.out.println("Height of the tree tree2 : " + height(root1));
        System.out.println("tree2 is balanced : " + isbalanced(root1));

  
        System.out.println("tree2 is balanced : " + isBalanced(root2));
        System.out.println("tree2 is balanced : " + isBalanced(root2));
    
    }
    
}
