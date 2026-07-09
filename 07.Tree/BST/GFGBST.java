import java.util.*;

public class GFGBST {
    

    public  Node buildTree(String[] arr) {
        // Edge case
        if (arr.length == 0 || arr[0].equals("N")) {
            return null;
        }

        // Create root
        Node root = new Node(Integer.parseInt(arr[0]));

        // Queue for level order construction
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            // Left child
            if (!arr[i].equals("N")) {
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equals("N")) {
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Helper: inorder traversal to verify
    public  void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new GFGBST().buildTree(new String[]{"5", "1", "7", "N", "2", "N", "N", "N", "3"});
        
        // Test
        new GFGBST().inorder(root);  // Output should be: 1 2 3 5 7
    }
}