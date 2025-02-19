import java.util.*;


public class SortList {
    
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

    // brute : 
    public static ListNode sortList(ListNode head){

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(arr);
        curr = head;
    
        for(Integer i : arr){
            curr.val = i;
            curr = curr.next;
        }

        return head;
    }




    //merge sort 
    // Function to merge two sorted linked lists
    static ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        // Create a dummy ListNode to serve
        // as the head of the merged list
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        // Traverse both lists simultaneously
        while (list1 != null && list2 != null) {
            // Compare elements of both lists and
            // link the smaller ListNode to the merged list
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move the temporary pointer
            // to the next ListNode
            temp = temp.next; 
        }

        // If any list still has remaining
        // elements, append them to the merged list
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        // Return the merged list starting 
        // from the next of the dummy ListNode
        return dummyNode.next;
    }

// Function to find the middle of a linked list
    static ListNode findMiddle(ListNode head){
        // If the list is empty or has only one ListNode
        // the middle is the head itself
        if (head == null || head.next == null) {
            return head;
        }

        // Initializing slow and fast pointers
        ListNode slow = head;
        ListNode fast = head.next;

        // Move the fast pointer twice
        // as fast as the slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // When the fast pointer reaches the end,
        // the slow pointer will be at the middle
        return slow;
    }

// Function to perform merge sort on a linked list
    public static ListNode sortList1(ListNode head){
        // Base case: if the list is empty or
        // has only one ListNode, it is already
        // sorted, so return the head
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find the middle of the list
        // using the findMiddle function
        ListNode middle = findMiddle(head);
        
        // Divide the list into two halves
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
        
        // Recursively sort the left and right halves
        left = sortList1(left);
        right = sortList1(right);
        
        // Merge the sorted halves using the
        // mergeTwoSortedLinkedLists function
        return mergeTwoSortedLinkedLists(left, right);
    }



    public static void main(String[] args) {

        print(sortList1(constructLL(new int[]{1,3,4,7,1,2,6})));// [1,3,4,1,2,6]
        print(sortList1(constructLL(new int[]{1,2,3,4})));// [1,2,4]
        print(sortList1(constructLL(new int[]{2,1})));// [2]
        print(sortList1(constructLL(new int[]{1})));// []

        
        
    }

    
}

