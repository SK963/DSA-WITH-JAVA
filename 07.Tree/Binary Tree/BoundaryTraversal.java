import java.util.*;

public class BoundaryTraversal {

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


 //--------------------------------------------------------------------- 
    
    public static List<Integer>  boundaryTraversal(TreeNode root){
        List<Integer> traversal = new ArrayList<>();
        addLeftBoundar(root, traversal);
        addLeaves(root, traversal);
        addRightBoundary(root, traversal);
        return traversal;

    }

    private static void addLeftBoundar(TreeNode root , List<Integer> traversal){
        if(root != null && !isleave(root)){
            traversal.add(root.val);
            
        }
        else return;

        if(root.left != null) addLeftBoundar(root.left, traversal);
        else if(root.right != null) addLeftBoundar(root.right, traversal);
        


    }

    private static void addRightBoundary(TreeNode root ,List<Integer> traversal ){
        Stack<Integer> stack = new Stack<>();
        if(root.right != null ) root = root.right;
        else root = root.left;
        
        while(root != null){
            if(!isleave(root)) stack.push(root.val);
            if(root.right != null) root = root.right;
            else root = root.left;
            
        }

        while(!stack.isEmpty())
            traversal.add(stack.pop());

    }

    private static void addLeaves(TreeNode root , List<Integer> traversal){
        if(isleave(root)){
            traversal.add(root.val);
            return;

        }
        if(root.left != null) addLeaves(root.left, traversal);
        if(root.right != null) addLeaves(root.right, traversal);

    }

    private static boolean isleave(TreeNode root){
        return (root.left == null && root.right == null);
    }



// ---------------------------------------------------------------

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

        System.out.println("Boundary order Traversal for tree1 : " + boundaryTraversal(root1).toString());
        
        

        // Tree2
//           1
//         /   \
//       2       7
//      /         \
//     3           8
//     \            \
//      4            9
//     /\           / \
//    5  6         10  11

        int val2[] = {1,2,7,3,8,4,9,5,6,10,11};
        TreeNode tree2[] = new TreeNode[val2.length+1];

        for(int i = 0 ; i<val2.length ; i++){
            tree2[i+1] = new TreeNode(val2[i]);
        }

        TreeNode root2 = tree2[1];
        tree2[1].left = tree2[2];
        tree2[1].right = tree2[3];

        tree2[2].left = tree2[4];
        
        tree2[3].right = tree2[5];

        tree2[4].right = tree2[6];
        tree2[5].right = tree2[7];

        tree2[6].left = tree2[8];
        tree2[6].right = tree2[9];

        tree2[7].left = tree2[10];
        tree2[7].right = tree2[11];

        System.out.println("Boundary order Traversal for tree2 : " + boundaryTraversal(root2).toString() );
        ;





    }
}
