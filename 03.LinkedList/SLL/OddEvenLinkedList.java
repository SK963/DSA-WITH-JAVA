public class OddEvenLinkedList {
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

// ODD EVEN 
    // 
    // T : O(n) , S : O(1)
    public static ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode evenhead = head.next;

        ListNode odd = head;
        ListNode even = head.next;

        while(odd.next != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenhead;

        return head;
    }


    public static void main(String[] args) {
        print(oddEvenList(constructLL(new int[]{1,2,3,4,5})));
        print(oddEvenList(constructLL(new int[]{1,2,3,4,5,6})));
        
    }
    
}
