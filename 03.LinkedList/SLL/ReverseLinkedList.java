import java.util.*;

public class ReverseLinkedList {

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



    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;

        ListNode leftptr= head;
        int cnt = 1;

        for(int i = 1 ; i< left ; i++)
            leftptr = leftptr.next;
        
        ListNode rightptr = leftptr;
        for(int j = 0 ; j < right-left ;j++)
            rightptr = rightptr.next;


        while(leftptr.next != rightptr){
            ListNode leftnext = new ListNode(leftptr.next.val);
            leftptr.next = leftptr.next.next;
            leftnext.next = rightptr.next;
            rightptr.next = leftnext;

        }

        return head;
    }
    
    

    // apprach 1 : reversing the data using stack 
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();

        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;

        while(curr != null){
            curr.val = stack.pop();
            curr = curr.next;
        }
             

        return head;
    }
    

    // approach : reversing the links
    public static ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode temp = head;
        ListNode front = temp.next;

        while(temp != null){

            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
        

        
    }

    // approach : using recurrsion
    public static ListNode reverseList2(ListNode head){

        // base case
        if(head == null || head.next == null)return head;

        ListNode newhead = reverseList2(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }



    public static void main(String[] args) {
        print(reverseList2(constructLL(new int[]{1,2,3,4,5})));// [1,4,3,2,5]
        print(reverseList2(constructLL(new int[]{5})));// [5]
        // print(reverseBetween(constructLL(new int[]{1,2,3,4,5,5,6,7}) , 2 , 4));

        
    }
    
}
