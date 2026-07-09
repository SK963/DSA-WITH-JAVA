import java.util.*;

public class MaximumWidthOfBinaryTree {

    static class pair{
        TreeNode key;
        int value;

        pair(TreeNode key , int value){
            this.key = key;
            this.value = value;
        }
    }


    public static int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;

        ArrayDeque<pair> dq = new ArrayDeque<>();
        dq.add(new pair(root , 1));

        
        int maxwidth = 1;
        while(!dq.isEmpty()){
            int size = dq.size();
            int currwidth = dq.getLast().value - dq.getFirst().value +1;
            maxwidth = Integer.max(currwidth , maxwidth);

            while(size > 0){
                pair p = dq.remove();
                TreeNode curr = p.key;
                int pos = p.value;

                if(curr.left != null) dq.add(new pair(curr.left , pos*2-1));
                if(curr.right != null) dq.add(new pair(curr.right , pos*2));
                size--;
            }
            

        }

        return maxwidth;
        
    }

    public static void main(String[] args) {
        System.out.println(widthOfBinaryTree(new BinaryTree(new Integer[] { 1, 3, 2, 5, 3, null, 9}).getRoot()));
        System.out.println(widthOfBinaryTree(new BinaryTree(new Integer[] { 1,3,2,5,null,null,9,6,null,7}).getRoot()));
        System.out.println(widthOfBinaryTree(new BinaryTree(new Integer[] {1,3,2,5}).getRoot()));

    }



}
