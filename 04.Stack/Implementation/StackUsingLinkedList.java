


public class StackUsingLinkedList {

		static class Node{
			int data; 
			Node next ;

			Node(int data){
				this.data = data;
				this.next = null;
			}
		}

		static class Stack{
			int size;
			Node top;

			public Stack(){
				this.size = 0;
				this.top = null;
			}

			void push(int data){
				Node new_node = new Node(data);
				size++;

				System.out.println(data + " is inserted in the stack: " + this.getClass().getName());
				
				if(top == null){
					top = new_node;
					return;
				}
				new_node.next = top;
				top = new_node;
				
			}

			boolean is_empty(){
				return (size == 0);
			}

			void pop(){
				if(is_empty()){
					System.out.println("Empty stack.");
				}
				else {
					int data = top.data;
					top = top.next;
					System.out.println(data + " is removed from stack: " + this.getClass().getName());
				}
				
				
			}

			void peek(){
				if(is_empty()){
					System.out.println("Stack: "+this.getClass().getName() +"  is empty");
				}
				else{
					System.out.println(top.data);
				}
			}
		}
	
    
	
    public static void main(String args[]) 
	{
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.is_empty()) {
            stack.peek();
            stack.pop();
        }

		
    }
}