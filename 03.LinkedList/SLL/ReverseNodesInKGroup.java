import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ReverseNodesInKGroup {
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

    static void reverse(ListNode start , ListNode end){
        ListNode curr = start;
        Stack<Integer> stack = new Stack<>();

        while(curr != end){
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = start;

        while(!stack.isEmpty()){
            curr.val = stack.pop();
            curr = curr.next;
        }


    }

    static ListNode kthnode(ListNode start  , int k){

        ListNode curr = start;
        int i = 0 ;

        while(i< k){
            if(curr == null)return null;
            curr = curr.next;
            i++;
        }

        return curr;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode start = head;
        ListNode end  = kthnode(start, k);


        while(end != null){
            reverse(start, end);
            start = end.next;
            end = kthnode(start, k);
        }

        return head;   
    }





    public static void main(String[] args) {

        print(reverseKGroup(constructLL(new int[]{1,2,3,4,5}),2));// [2,1,4,3,5]
        print(reverseKGroup(constructLL(new int[]{1,2,3,4,5}),3));// [3,2,1,4,5]
        
    }
    
}
