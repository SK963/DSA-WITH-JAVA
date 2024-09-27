
import java.util.Stack;


class InterativeTraversal {

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
    

    public static void preorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){

            root = stack.pop();
            System.out.print(root.data + " ");
            if(root.right != null)
                stack.push(root.right);
            if(root.left != null)
                stack.push(root.left);

        }

    }




    public static void inorder(TreeNode root){
    //      1
    //     / \
    //    2   3
    //   / \ / \
    //  4  5 6  7

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while(true){

            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                
                node = stack.pop();
                System.out.print(node.data + " ");
                node = node.right;
            }


        }
        

    }
    // Iterative postorder traversal using two stacks
    public static void postorder(TreeNode root){
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root == null)
            return;
        s1.push(root);

        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left != null)  s1.push(root.left);
            if(root.right != null) s1.push(root.right);
            
        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop().data + " ");
        }

    }

    // Iterative postoder using 1 stack

    // public static void s1postorder(TreeNode root){

    // }
    



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


// Preorder Traversal : 1 2 4 5 3 6 7 
// Inorder Traversal : 4 2 5 1 6 3 7 
// Postorder Traversal : 4 5 2 6 7 3 1 
