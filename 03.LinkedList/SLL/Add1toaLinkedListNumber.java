import org.w3c.dom.Node;

public class Add1toaLinkedListNumber {

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


    public static ListNode addOne(ListNode head) {
        ListNode l = reverseList(head) , curr = l;
        int next = 1;
        while(curr != null){
            if(curr.val < 9) {
                curr.val += next;
                break;
            }
            if(curr.val == 9 && curr.next != null){ 
                curr.val = 0;
                next = 1;
            }
            else{
                curr.val = 0;
                curr.next = new ListNode(0);
            }
            curr = curr.next;

        }
        return reverseList(l);
        
        
    }

    public static ListNode reverseList(ListNode head){

        // base case
        if(head == null || head.next == null)return head;

        ListNode newhead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }


    // approach : using backtracking 
    public static ListNode addOne1(ListNode head){
        int carry = findcarry(head);

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;

        }

        return head;
    }

    static int findcarry(ListNode temp){

        if(temp == null) return 1;
        int carry = findcarry(temp.next);
        temp.val = temp.val + carry ;

        if(temp.val < 10) return 0;
        temp.val = 0;
        return 1;
    }


    public static void main(String[] args) {
        print(addOne1(constructLL(new int[]{1,2,3,4,5})));// [1,4,3,2,5]
        print(addOne1(constructLL(new int[]{5})));// [5]
        print(addOne1(constructLL(new int[]{9,9,9})));// [5]
    }

    
}
