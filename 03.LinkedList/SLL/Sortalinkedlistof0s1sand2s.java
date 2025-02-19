import java.util.*;
public class Sortalinkedlistof0s1sand2s {
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


    // approach : changing the data 
    // T : O(2N) , S:O(1)
    public static ListNode segregate(ListNode head) {
        int zeroes = 0, ones = 0 , twos = 0;
        ListNode curr = head;
        while(curr != null){
            if(curr.val == 0)zeroes++;
            if(curr.val == 1)ones++;
            if(curr.val == 2)twos++;
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            if(zeroes>0){
                curr.val = 0;
                zeroes--;
            }
            else if(ones > 0){
                curr.val = 1;
                ones--;
            }
            else{
                curr.val = 2;
                twos--;
            }

            curr = curr.next;


        }

        return head;
    }
    

    //approach : moving the pointers
    public static ListNode segregate1(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode zerohead = new ListNode(-1);  
        ListNode onehead = new ListNode(-1);
        ListNode twohead = new ListNode(-1);

        ListNode zero = zerohead , one = onehead , two = twohead;
        ListNode curr = head;

        while(curr != null) {
            if(curr.val == 0){
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.val == 1){
                one.next = curr;
                one = one.next;
            }
            else{
                two.next = curr;
                two = two.next;
            }

            curr = curr.next;
            
        }
        
        //zero -> onehead/twohead/null
        if(onehead.next != null)zero.next = onehead.next;
        else if(twohead.next != null)zero.next = twohead.next;
        else zero.next = null;

        //one -> twohead / null
        if(twohead.next != null)one.next = twohead.next;
        else one.next = null;

        //two
        two.next = null;

        return zerohead.next;
        
    }


    public static void main(String[] args) {
        print(segregate1(constructLL(new int[]{1,2,2,1,2,0,2,2})));// [0,1,1,2,2,2,2,2]
        print(segregate1(constructLL(new int[]{2,2,0,1})));// [0,1,2,2]
        print(segregate1(constructLL(new int[]{0,1,0,1,0,1})));// [0,0,0,1,1,1]
        print(segregate1(constructLL(new int[]{0,2,0,2,0,2})));// [0,0,0,2,2,2]
        print(segregate1(constructLL(new int[]{0,0,0})));// [0,0,0,2,2,2]
        print(segregate1(constructLL(new int[]{1,1,1})));// [0,0,0,2,2,2]
        print(segregate1(constructLL(new int[]{2,2,2})));// [0,0,0,2,2,2]
    }

    
}
