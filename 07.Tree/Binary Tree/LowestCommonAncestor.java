import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int val){
            this.val = val;
            this.right = null;
            this.left = null;
    
        }

        @Override
        public  String  toString(){
            return "{ node : " + this.val ;
        }


    }

// ----------------------------------------------------------------------------
    
    // apporach 1 : using paths and then selecting the  last common point in the path 
    private static boolean path(List<TreeNode> possiblepath ,
    TreeNode root , TreeNode node)
    {
        if(root == null) return false;
        possiblepath.add(root);
        if(root.val == node.val) return true;
        if(path(possiblepath , root.left , node) || 
            path(possiblepath , root.right , node))
            return true;
        
        possiblepath.remove(possiblepath.size()-1);
        return false;
        

        
    }

    public static List<TreeNode> Path(TreeNode root , TreeNode node){
        List<TreeNode> path = new ArrayList<>();
        if(root == null ) return path;
        path(path, root , node);
        return path;
       


    }

 
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        List<TreeNode> path1 = Path(root , p);
        List<TreeNode> path2 = Path(root, q);

        while(true){
            for(int i = 0 ; i< Math.min(path1.size(), path2.size()) ; i++){
                if(path1.get(i) != path2.get(i))
                    return path1.get(i-1);
            }
        
        
        }
    }

    // approach2 : using dfs traversal 

    public static TreeNode lowestcommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestcommonAncestor(root.left, p, q);
        TreeNode right = lowestcommonAncestor(root.right, p, q);

        if(left == null) return right;
        else if (right == null) return left;
        else return root;

    }




    
// -----------------------------------------------------------------------
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
        TreeNode p1 = tree1[2].left = tree1[4];
        TreeNode q1 = tree1[2].right = tree1[5];
        tree1[3].left = tree1[6];
        tree1[3].right = tree1[7];

        System.out.println("right side View of tree1 : " + lowestCommonAncestor(root1, p1,q1));
        
        // Tree2 
        //           1
        //         /   \
        //       2      3
        //     /  \    / \
        //    4    10 9   10
        //    \
        //     5   
        //      \
        //       6

        int values[] = {1,2,3,4,10,9,10,5,6};

        TreeNode tree2[] = new TreeNode[values.length+1];

        for(int i = 0 ; i<values.length ; i++){
            tree2[i+1] = new TreeNode(values[i]);
        } 
        
        TreeNode root2 = tree2[1];

        tree2[1].left = tree2[2];
        tree2[1].right = tree2[3];

        tree2[2].left = tree2[4];
        TreeNode p2 = tree2[2].right = tree2[5];

        TreeNode q2 = tree2[3].left = tree2[6];
        tree2[3].right = tree2[7];
        
        tree2[4].right = tree2[8];
        tree2[8].right = tree2[9];

        System.out.println("right side View of tree1 : " +  lowestcommonAncestor(root2, p2,q2));
        
    }



    
}
