


public class RecursiveTraversal{

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int val){
            this.val = val;
            this.right = null;
            this.left = null;
    
        }
    }



    public static void preorder(TreeNode node){
        if(node == null)
            return;

        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);

    }

    public static void inorder(TreeNode node){
        if(node == null)
            return;

        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }

    public static void postorder(TreeNode node){
        if(node == null)
            return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");
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

        System.out.print("Preorder Traversal : ");
        preorder(root1);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        inorder(root1);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        postorder(root1);
        System.out.println();

       
      
        

        
    }
}
/*

Preorder Traversal : 1 2 4 5 3 6 7 
Inorder Traversal : 4 2 5 1 6 3 7 
Postorder Traversal : 4 5 2 6 7 3 1 

*/