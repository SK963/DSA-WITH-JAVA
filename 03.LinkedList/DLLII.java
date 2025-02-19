public class DLLII{

    static class Node
    {
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

    // insert
    public static Node  addNode(Node head, int p, int x) {
        Node before = head;
        int count = 0;
        while(count < p){
            before = before.next;
            count++;

        }
        Node curr = new Node(x);
        Node after = null;
        if(before.next != null) after = before.next;
        
        curr.prev = before; curr.next = after;
        before.next = curr;
        if(after != null) after.prev = curr;

        return head;
    }


    //  delete node by node value
    public static Node deleteNode(Node head, int x) {
        Node curr = head;
        while(curr.next.data != x  ){
            curr = curr.next;
        }

        Node before = curr;
        Node after = null; // if x is at last
        if(curr.next.next != null)after = curr.next.next; // if not at last
        before.next  = after;
        after.prev = before;

        return head;
       
    }

    // delete node by index value // 0 based
    public static Node deleteNodei(Node head, int x) {

        Node curr = head;
        int index = 0;
        // first node deletion
        if(x == 0) {
            head = head.next;
            head.prev = null;
            return head;
        }
        else{
            while(index < x-1 ){
                curr = curr.next;
                index++;
            }

            Node before = curr;
            Node after = null; // if x is at last
            if(curr.next.next != null)after = curr.next.next; // if not at last
            before.next  = after;
            if(after != null) after.prev = before;
        }

            return head;
       
    }

    public static Node reverseDLL(Node head) {
        Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }


        Node first = head;
        int i = 0;
       

        while(first != last ){
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
            first = first.next;
            last = last.prev;
            if(++i >= length/2) break;
        }


        return head;




    }




    static void print(Node head){
        Node curr = head;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        } System.out.println("]");
    }


    public static void main(String[] args) {
        
        Node dll1head = constructDLL(new int[]{1,2,3,4});
        print(dll1head);
        reverseDLL(dll1head);
        print(dll1head);
    } 
}