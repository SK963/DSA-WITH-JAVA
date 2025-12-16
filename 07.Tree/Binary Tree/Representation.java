import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.Node;

public class Representation {
    
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to insert nodes in level order
    public static TreeNode insertLevelOrder(int[] arr, int i) {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode root = new TreeNode(arr[i]);

            // Insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // Insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);

            return root;
        }
        return null;
    }

    public static void createTree(TreeNode root0, ArrayList<Integer> v ){


        Integer[] array = v.toArray(new Integer[0]);
        int[] intArray = new int[array.length];

        // Convert Integer[] to int[] using a loop
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = array[i]; // Auto-unboxing happens here
        }
        root0 = insertLevelOrder(intArray,0);
        
        
        
        
    }

    // Function for preorder traversal of the binary tree
    public static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
         ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // Create the root node using the first element
        TreeNode root = new TreeNode(arraylist.get(0));
        createTree(root, arraylist);

        // Print preorder traversal of the tree
        System.out.print("Preorder traversal of the binary tree: ");
        preorder(root);
    }
}
