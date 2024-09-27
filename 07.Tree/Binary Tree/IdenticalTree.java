
public class IdenticalTree{

    static class TreeNode{
        int val;
        TreeNode left , right;

        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }




    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null &&  !(q == null)) || (p != null && (q == null)))
            return false;
        if(p == null && q == null)
            return true;
        
        if(p.val == q.val){
            boolean left = isSameTree(p.left , q.left);
            boolean right = isSameTree(p.right , q.right);
            if(left && right)
                return true;
        }
        return false;
        
    }
    public static void main(String[] args) {

        // Tree1 
            //         0
            //       /   \
            //      1     2
            //     /       \
            //    3         4
          //     /           \
          //    5             6
            
        
        // tree 1
        TreeNode tree1[] = new TreeNode[7] ;
        for(int i = 0 ; i< tree1.length ; i++){
            tree1[i] = new TreeNode(i);  
        }

        TreeNode root1 = tree1[0];
        tree1[0].left = tree1[1];
        tree1[0].right = tree1[2];
        tree1[1].left = tree1[3];
        tree1[2].right = tree1[4];
        tree1[3].left = tree1[5];
        tree1[4].right = tree1[6];

        // tree 2
        // Tree1 
            //         0
            //       /   \
            //      1     2
            //     /       \
            //    3         4
          //     /           
          //    5             
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


        System.out.println("tree1 && tree1 :" + isSameTree(root1, root1));
        System.out.println("tree1 && tree2 : " +  isSameTree(root1, root2));
  
        
    }
}