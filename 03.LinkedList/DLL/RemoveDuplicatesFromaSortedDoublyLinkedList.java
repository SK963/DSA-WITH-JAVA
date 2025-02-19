import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromaSortedDoublyLinkedList {

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


    public static Node removeDuplicates(Node head){

        if(head == null) return head;

        Node curr = head;

        while (curr.next != null) {
            Node prev = curr.prev;
            Node next = curr.next;
            if(curr.data == next.data){
                if(curr == head){
                    head = head.next;
                    next.prev = prev;
                }
                else{
                    prev.next = next;
                    next.prev = prev;
                }
                
            }

            curr = curr.next;

            
        }

        return head;


    }

    public static void main(String[] args) {
        print(removeDuplicates(constructDLL(new int[]{1,1,1,2,3,4}))); //[1,2,3,4]
        print(removeDuplicates(constructDLL(new int[]{1,2,2,3,3,4,4}))); // [1,2,3,4]

    }
    
}
