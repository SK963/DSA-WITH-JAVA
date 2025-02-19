import java.util.HashMap;

public class LinkedListCycleII {
//  basic implementation ---------------
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int d) { 
            val = d; 
            next = null;
        }
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
        ListNode curr = head;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr = curr.next;
        }
        System.out.println("]");
    }

//  -----------------------------------------

    // approach :  hashmap 
    // T : O(n) : S :O(n)
    public static ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode curr = head;
        int pos = 0;
        while (curr != null) {
            if(map.containsKey(curr)){
                return curr;
            }
            map.put(curr, pos++);
            curr = curr.next;
        }

        return null;
    
    
    }


    // approach : two pointer  Fast pointer and slow pointer approach /tortoise / Hare algo  
    // T : O(n) , S:O(1)
    public static ListNode detectCycle2(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Reset the slow pointer
                // to the head of the list
                slow = head; 
    
                // Phase 2: Find the first node of the loop
                while (slow != fast) {
                    // Move slow and fast one step
                    // at a time
                    slow = slow.next;  
                    fast = fast.next;  
    
                    // When slow and fast meet again,
                    // it's the first node of the loop
                }
                
                // Return the first node of the loop
                return slow; 
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode ll1 = constructLL(new int[]{3,2,0,4});
        ll1.next.next.next.next = ll1.next; //3->2->0->4->2
        System.out.println(detectCycle2(ll1)); //pos : 1

        ListNode ll2 = constructLL(new int[]{1,2});
        ll2.next = ll2;
        System.out.println(detectCycle2(ll2));//pos : 0
        
        ListNode ll3 = constructLL(new int[]{1});
        System.out.println(detectCycle2(ll3));//pos : -1 //head

        ListNode ll4 = constructLL(new int[]{-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5});
        System.out.println(detectCycle2(ll4)); 
    }
    
}
