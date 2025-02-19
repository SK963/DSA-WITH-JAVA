

public class MiddleoftheLinkedList {

// ll implementation start
public static class ListNode {
    int val;
    ListNode next;

    //constructor
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


    // brute approach 
    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }

        int mid =  count/2  + 1; 

        current = head;
        for(int i = 1 ; i< mid ; i++)
        {
            current = current.next;
        }

        return current;

    }


    // approach : two pointers
    // T: O(n/2) , S:(1)

    public static ListNode middleNode2(ListNode head){
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        System.out.println(middleNode2(constructLL(new int[]{1,2,3,4,5})).val);//3
        System.out.println(middleNode2(constructLL(new int[]{1,2,3,4,5,6})).val); //4
        
    }
    
}
