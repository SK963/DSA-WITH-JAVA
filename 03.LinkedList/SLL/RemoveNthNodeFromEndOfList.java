import org.w3c.dom.Node;

public class RemoveNthNodeFromEndOfList {
    // ll implementation start
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode constructLL(int arr[]) {
        if (arr.length == 0) return null;  // Handle empty array

        ListNode head = new ListNode(arr[0]);  // Create the head
        ListNode current = head;  // Maintain a reference to the current ListNode

        // Build the linked list
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
        
    }


    public static void print(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();
    }
//  ll implementation end

    //T : O(2n) , S:O(1)
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        // System.out.println(length);
        length = length - n;
        if(length == 0) head = head.next;
        if(length>0){
            int i = 0;
            curr = head;
            while(i<length-1){
                curr = curr.next;
                length--;
            }

            curr.next = curr.next.next;

        }

        return head;

        
    }

    // two pointer approach 
    public static ListNode removeNthFromEnd1(ListNode head , int n){
        
        // Create two pointers, fastp and slowp
        ListNode fastp = head;
        ListNode slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < n; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
        ListNode delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }




    public static void main(String[] args) {
        print(removeNthFromEnd1(constructLL(new int[]{1,2,3,4,5}),2));// [1,2,3,5]
        print(removeNthFromEnd1(constructLL(new int[]{1}),1)); //[]
        print(removeNthFromEnd1(constructLL(new int[]{1,2}),1));//[1]
        print(removeNthFromEnd1(constructLL(new int[]{1,2}),2));//[2]
    }
    
}
