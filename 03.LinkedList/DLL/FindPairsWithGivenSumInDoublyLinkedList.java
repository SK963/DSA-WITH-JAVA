import java.util.*;

public class FindPairsWithGivenSumInDoublyLinkedList {

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    
    
    // create a dll  from a arr 
    public static Node constructDLL(int arr[]) {

        int n = arr.length;
        Node dll[] =  new Node[n];
        // [1,2,3,4,5]
        for(int i = 0 ; i< n ; i++){
            dll[i] = new Node(arr[i]);
        }

        for(int i = 0 ; i< n-1; i++){
            dll[i].next = dll[i+1];
            dll[i+1].prev = dll[i];
            
        }
        return dll[0];
        
    }


    //print
    static void print(Node head){
        Node curr = head;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        } System.out.println("]");
    }


    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node front = head;
        Node back = head;
        while(back.next != null) back = back.next;

        while(front.data < back.data){
            if(back.data + front.data > target)back = back.prev;
            else if(back.data + front.data < target)front = front.next;
            else{
                ans.add(new ArrayList<>(Arrays.asList(front.data , back.data)));
                front = front.next;
                back = back.prev;
            }
            

        }

        return ans;
        
    }

    public static void main(String[] args) {
        System.out.println(findPairsWithGivenSum(7,constructDLL(new int[]{1,2,3,4,5,6,7,8,9})).toString()); //[1,6][2,5]
        System.out.println(findPairsWithGivenSum(6,constructDLL(new int[]{1,5,6})).toString()); // [1,5]
        System.out.println(findPairsWithGivenSum(5,constructDLL(new int[]{1,2,3,4})).toString()); // [1,5]
    }
}
