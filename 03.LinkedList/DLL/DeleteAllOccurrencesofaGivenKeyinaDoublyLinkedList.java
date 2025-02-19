public class DeleteAllOccurrencesofaGivenKeyinaDoublyLinkedList {
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


    //print
    static void print(Node head){
        Node curr = head;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        } System.out.println("]");
    }

    public static Node deleteAllOccurOfX(Node head, int x) {
        if(head == null)return head;

        Node temp = head;

        while(temp != null){
            if(temp.data == x){
                if(temp == head)
                    head = head.next;
                
                Node prev = temp.prev;
                Node next = temp.next;

                if(next != null) next.prev = prev;
                if(prev != null) prev.next = next;
                
            }
            
            temp = temp.next;
        }

        return head;

    }

    public static void main(String[] args) {

        print(deleteAllOccurOfX(constructDLL(new int[]{2,2,10,8,4,2,5,2}),2)); //10<->8<->4<->5
        print(deleteAllOccurOfX(constructDLL(new int[]{9,1,3,4,5,1,8,4}),9)); //1<->3<->4<->5<->1<->8<->4
        
    }
    
}
