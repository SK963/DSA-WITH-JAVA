


public class DeleteTheMiddleNodeOfaLinkedList {
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

    public static ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next==null) return null;
        ListNode slow = head , fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = head;
        while(curr.next != slow){
            curr = curr.next;
        }

        curr.next = curr.next.next;



        return head;
        
    }


    public static ListNode deleteMiddle1(ListNode head){
        
       if(head==null || head.next==null) return null;
       
       ListNode fast=head.next.next , slow=head;
       
       while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
       }

       slow.next=slow.next.next;
       return head;

    }


    public static void main(String[] args) {

        print(deleteMiddle1(constructLL(new int[]{1,3,4,7,1,2,6})));// [1,3,4,1,2,6]
        print(deleteMiddle1(constructLL(new int[]{1,2,3,4})));// [1,2,4]
        print(deleteMiddle1(constructLL(new int[]{2,1})));// [2]
        print(deleteMiddle1(constructLL(new int[]{1})));// []
        
    }

    
}
