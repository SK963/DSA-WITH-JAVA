import java.util.PriorityQueue;

public class MergeSortedLists {
    
    static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    }


    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val -b.val);
        for(ListNode ld : lists){
            while (ld != null) {
                ListNode next = ld.next; // save next
                ld.next = null;          // break old link
                pq.add(ld);
                ld = next;
            }
        }

        ListNode ans = null;
        if(!pq.isEmpty()) ans = pq.remove();
        ListNode curr = ans;

        while(!pq.isEmpty()){
            curr.next = pq.remove();
            curr = curr.next;
        }
        

        return ans;
    }


    public static void main(String[] args) {
        int arr[][] = new int[][]{{-2,-1,-1,-1},{}};
    }



}


