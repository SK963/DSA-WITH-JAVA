import java.util.*;

public class LinkedListCycle {
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

    // approach1:  hashmap  (return position )
    public static int hasCycle(ListNode head){
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode curr = head;
        int pos = 0;
        while (curr != null) {
            if(map.containsKey(curr)){
                return map.get(curr);
            }
            map.put(curr, pos++);
            curr = curr.next;
        }

        return -1;
    }

    
// ---------------------------------------------------
    //return true/false

    // approach : Hashmap
    public static boolean hasCycle1(ListNode head){
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode curr = head;
        int pos = 0;
        while (curr != null) {
            if(map.containsKey(curr)){
                return true;
            }
            map.put(curr, pos++);
            curr = curr.next;
        }

        return false;
    }


    //approach : slow and fast pointer approach 
    public static boolean hasCycle2(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)return true;
                        
        }
        return false;
    }



    public static void main(String[] args) {
        ListNode ll1 = constructLL(new int[]{3,2,0,4});
        ll1.next.next.next.next = ll1.next; //3->2->0->4->2
        System.out.println(hasCycle2(ll1)); //pos : 1

        ListNode ll2 = constructLL(new int[]{1,2});
        ll2.next = ll2;
        System.out.println(hasCycle2(ll2));//pos : 0
        
        ListNode ll3 = constructLL(new int[]{1});
        System.out.println(hasCycle2(ll3));//pos : -1

        ListNode ll4 = constructLL(new int[]{-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5});
        System.out.println(hasCycle2(ll4));     
    }
    
}
