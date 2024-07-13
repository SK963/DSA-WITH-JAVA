import java.util.Stack;

public class QueueUsingStack{

	static class queue_using_stack{

		Stack<Integer> s1 =  new Stack<>();
		Stack<Integer> s2 =  new Stack<>();
	
		public void add(int data){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}

			System.out.println("Inserted element: "+data);
			
		}

		public void remove(){
			if(!s1.isEmpty())
				System.out.println("Removed element: "+s1.pop());
			else
				System.out.println("Stack is empty");
		}

		public boolean is_empty(){
			return s1.isEmpty();
		}

		public void peek(){
			if(!s1.isEmpty())
				System.out.println("Peek element: "+s1.peek());
			else
				System.out.println("Stack is empty");
		}
	}
	
    
	
    public static void main(String args[]) 
	{
        queue_using_stack q = new queue_using_stack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

		while(!q.is_empty()){
			q.peek();
			q.remove();
		}
        
    }
}