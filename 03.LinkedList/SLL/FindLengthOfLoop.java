import java.util.HashMap;

import org.w3c.dom.Node;

public class FindLengthOfLoop {
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

// Length of the loop 
    
    // approach : Hashmap 
    // T : O(n.logn) s:O(n)
    public static int countNodesinLoop(ListNode head){
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode curr = head;
        int pos = 1;

        while (curr != null) {
            if(map.containsKey(curr)){
                // System.out.println(map);
                return pos - map.get(curr);
            }
            map.put(curr,pos++);
            curr = curr.next;

            
        }
        return 0;

    }

    // approach : two pointer / turtoise / hare algo
    public static int countNodesinLoop2(ListNode head){
        ListNode  slow  = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = fast.next;
                int count = 1;
                while(fast != slow){
                    fast= fast.next;
                    count++;
                }
                return count;
                
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        ListNode ll1 = constructLL(new int[]{25,14,19,33,10,21,39,90,58,45});
        ll1.next.next.next.next.next.next.next.next.next.next = ll1.next.next.next;
        System.out.println(countNodesinLoop2(ll1));
        
    }
    
}
