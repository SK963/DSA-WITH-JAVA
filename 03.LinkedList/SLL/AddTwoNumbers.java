public class AddTwoNumbers{

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




    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
    
        ListNode A = l1, B = l2;
        int carry = 0;
    
  
        while (A != null || B != null) {
            int val1 = (A != null) ? A.val : 0;  
            int val2 = (B != null) ? B.val : 0;  
    
            int sum = val1 + val2 + carry;  
            carry = sum / 10;              
            current.next = new ListNode(sum % 10);  
            current = current.next;
    
            
            if (A != null) A = A.next;
            if (B != null) B = B.next;
        }
    
      
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
    
        return dummyHead.next;  
    }
    




    public static void main(String[] args) {
        
        print(addTwoNumbers(constructLL(new int[]{2,4,3}) , constructLL(new int[]{5,6,4})));// [7,0,8]
        print(addTwoNumbers(constructLL(new int[]{9,9,9,9,9,9,9}) , constructLL(new int[]{9,9,9,9})));// [[8,9,9,9,0,0,0,1]
    }
}