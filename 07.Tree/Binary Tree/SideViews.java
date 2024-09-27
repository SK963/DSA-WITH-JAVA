import java.util.*;

public class SideViews {

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

// -----------------------------------------------------------------------------------
    
    // right side View
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        if(root == null)
            return view;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            for(int i = 0 ; i< level ; i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                int data = q.poll().val;
                if(i == level-1) view.add(data);
        }
            
        }


        return view;
        
    }

//--------------------------------------------------------------------------------------- 

//left side view :  code not working properly  for various test cases 
    public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        if(root == null)
            return view;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            for(int i = 0 ; i< level ; i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                int data = q.poll().val;
                if(i == 0) view.add(data);
        }
            
        }


        return view;
        
    }
// ------------------------------------------------------------------------------------
    // Top View 
    static class pair{
        int row;
        TreeNode node;
        public pair(int row ,TreeNode node){
            this.row = row;
            this.node = node;
        }
    }

    public static List<Integer> topView(TreeNode root){
        List<Integer> view = new ArrayList<>();
        if(root == null)
            return view;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0, root));

        while(!q.isEmpty()){
            pair p = q.poll();
            TreeNode node = p.node;
            int row = p.row;

            if(!map.containsKey(row)) map.put(row, node.val);

            if(node.left != null) q.add(new pair(row -1 , node.left));
            if(node.right != null) q.add(new pair(row + 1 , node.right));


        }

        for(Map.Entry<Integer ,Integer> entry : map.entrySet()){
            view.add(entry.getValue());

        }

        return view;
        
    }
// ------------------------------------------------------------------------------
    // Bottom View
    public static List<Integer> bottomView(TreeNode root){
        List<Integer> view = new ArrayList<>();
        if(root == null)
            return view;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0, root));

        while(!q.isEmpty()){
            pair p = q.poll();
            TreeNode node = p.node;
            int row = p.row;
            map.put(row , node.val);
            if(node.left != null) q.add(new pair(row -1 , node.left));
            if(node.right != null) q.add(new pair(row + 1 , node.right));


        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            view.add(entry.getValue());
        }

        

        return view;
    }



// -----------------------------------------------------------------------------------
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
        
        System.out.println("Tree1 : ");
        System.out.println("Right View : " + rightSideView(root1).toString());
        System.out.println("Left View  : " + leftSideView(root1).toString());
        System.out.println("Top View  : " + topView(root1).toString());
        System.out.println("Bottom View : " + bottomView(root1).toString());
        System.out.println("---------------------------------------");
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
        tree2[2].right = tree2[5];

        tree2[3].left = tree2[6];
        tree2[3].right = tree2[7];
        
        tree2[4].right = tree2[8];
        tree2[8].right = tree2[9];

        System.out.println("Tree2 : ");
        System.out.println("Right View : " + rightSideView(root2).toString());
        System.out.println("Left View  : " + leftSideView(root2).toString());
        System.out.println("Top View  : " + topView(root2).toString());
        System.out.println("Bottom View : " + bottomView(root2).toString());
    }
    
}
