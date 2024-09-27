import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
public class ZigZagTraversal {

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


    // correct but not 100%
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        Queue<TreeNode> rl = new LinkedList<>();
        Stack<TreeNode> lr = new Stack<>();

        if(root == null){
            return traversal;
        }
        
        List<Integer>level = new ArrayList<>();
        lr.push(root);

        
        while(!rl.isEmpty() || !lr.isEmpty()){
            
            while(!rl.isEmpty()){
                TreeNode element = rl.poll();
                if(element.right != null) lr.push(element.right);
                if(element.left !=  null) lr.push(element.left);
                
                level.add(element.data);

            }
            if (!level.isEmpty()) {
                traversal.add(new ArrayList<>(level));  // Add a copy of the level
            }
            level.clear();
            
            while(!lr.isEmpty()){

                TreeNode element = lr.pop();
                if(element.left != null) rl.add(element.left);
                if(element.right != null) rl.add(element.right);

                level.add(element.data);



            }
            if (!level.isEmpty()) {
                traversal.add(new ArrayList<>(level));  // Add a copy of the level
            }
            level.clear();
            

        }





        return traversal;
        
    } 
    

    // correct 100%
    public static List<List<Integer>> zigZagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if (root == null) return traversal;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Add nodes based on the current direction of traversal
                if (leftToRight) {
                    level.add(node.data);
                } else {
                    level.add(0, node.data);  // Insert at the beginning for right-to-left
                }

                // Add the children for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            traversal.add(level);
            leftToRight = !leftToRight;  // Switch the direction for the next level
        }

        return traversal;
    }
    
    
    
    public static void main(String[] args) {

        // test case 1 : 
        //      3
        //     / \
        //    9   20
        //       /  \
        //     15    7

        TreeNode tree1[] = new TreeNode[6];
        int values[] = {3,9,20,15,7};
        for(int i = 0 ;i< values.length; i++){
            tree1[i+1] =  new TreeNode(values[i]);
        }

        TreeNode root1 = tree1[1];
        tree1[1].left = tree1[2];
        tree1[1].right = tree1[3];
        tree1[3].left = tree1[4];
        tree1[3].right = tree1[5];

        List<List<Integer>> Traversal = zigzagLevelOrder(root1);
        System.out.println("Zig Zag Traversal Order :" + Traversal.toString());
        // Test case 2: The tree from the diagram:
        //          0
        //        /   \
        //       2     4
        //      /     / \
        //     1     3  -1
        //    / \     \   \
        //   5   1     6   8

        TreeNode tree2[] = new TreeNode[11];
        int values2[] = {0, 2, 4, 1,3, -1,5 ,1,6, 8};
        for(int i = 0; i < values2.length; i++) {
            tree2[i+1] = new TreeNode(values2[i]);
        }

        TreeNode root2 = tree2[1];
        tree2[1].left = tree2[2];
        tree2[1].right = tree2[3];

        tree2[2].left = tree2[4];

        tree2[3].left = tree2[5];
        tree2[3].right = tree2[6];

        tree2[4].left = tree2[7];
        tree2[4].right = tree2[8];

        tree2[5].left = tree2[9];
        tree2[6].right = tree2[10];

        List<List<Integer>> Traversal2 = zigZagLevelOrder(root2);
        System.out.println("Zig Zag Traversal Order for tree 2: " + Traversal2.toString());
        // Zig Zag Traversal Order for tree 2: [[0], [4, 2], [1, 3, -1], [1, 5, 6, 8]]
        // Actual output : [[0],[4,2],[1,3,-1],[8,6,1,5]]
    }
    
}
