public class SLL {

    static class Node {
        int data;
        Node next;

        Node(int d) { 
            data = d; 
            next = null;
        }
    }
    

    static Node constructLL(int arr[]) {
        if (arr.length == 0) return null;  // Handle empty array

        Node head = new Node(arr[0]);  // Create the head
        Node current = head;  // Maintain a reference to the current node

        // Build the linked list
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
        
    }

    public static void print(Node head){
        Node curr = head;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println("]");
    }



    public static void main(String[] args) {

        print(constructLL(new int[]{1,2,3,4,5}));
        
    }
}
