import java.util.*;

public class PalindromeLinkedList {
    // ll implementation start
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode constructLL(int arr[]) {
        if (arr.length == 0)
            return null; // Handle empty array

        ListNode head = new ListNode(arr[0]); // Create the head
        ListNode current = head; // Maintain a reference to the current ListNode

        // Build the linked list
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;

    }



    public static void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
// implementation end 

    // approach : usign stack 
    // T : O(n) , S : O(n)
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)return true;

        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            if(stack.peek() == curr.val)stack.pop();
            curr = curr.next;
        }

        if (!stack.isEmpty())return false;
        return true;

    }

    //using two pointers 
    //  T: O(n) , S: O(1)
    public static boolean isPalindrome1(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }

        fast = reverse(slow.next);
        slow = head;

        while(fast != null && (fast.val == slow.val)){
            fast = fast.next;
            slow = slow.next;
        }

        if(fast == null)return true;
        return false;

    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newhead = reverse(head.next);
        ListNode front  = head.next;
        front.next = head;
        head.next = null;
        return  newhead;

    }



    // ll implementation end

    public static void main(String[] args) {

        System.out.println(isPalindrome1(constructLL(new int[] { 1, 2, 2, 1 }))); // t
        System.out.println(isPalindrome1(constructLL(new int[] { 1, 2}))); // f
        System.out.println(isPalindrome1(constructLL(new int[] { 1}))); // t
        System.out.println(isPalindrome1(constructLL(new int[] { 1, 3, 4, 4, 1 }))); // f
        System.out.println(isPalindrome1(constructLL(new int[] { 1, 0, 1 }))); // t
    }

}