

class Stack{
	int stack[];
	int top;
	int size;
	int length;

	public Stack(int size){
		this.stack = new int[size];
		this.size = 0;
		this.top = -1;
		this.length = size;
	}

	//insertion
	void push(int data){
		if(this.size < this.length){
			stack[++top] = data;
			size++;
			System.out.println(data + " is inserted in the stack");
		}
		else
			System.out.println("Stack is full");
	}

	//deletion
	void pop(){
		if(this.size != 0){
			int popped = stack[top];
			stack[top--] = 0;
			size--;
			System.out.println( popped +" is removed from the stack");
		}
		else 
			System.out.println("Stack is empty");
		
	}


	//peek
	void peek(){
		if(size != 0)
			System.out.println(stack[top]);
		else
			System.out.println("Empty Stack");
	}

	//is_empty 
	boolean is_empty(){
		if(this.size == 0)
			return true;
		else
			return false;
	}

	
}

public class StackUsingArray {

	public static void main(String args[]){

		Stack s1 = new Stack(15);
		s1.push(10);
		s1.peek();
		s1.push(20);
		s1.peek();
		s1.pop();
		s1.peek();

		System.out.println(s1.is_empty());


		
		
	}
}

