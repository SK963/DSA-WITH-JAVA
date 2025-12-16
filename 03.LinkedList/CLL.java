import java.util.*;

class Node{
	int data;
	Node next ;
}

class CLL{

	Node head = null;
	Node tail = null;
	int size = 0;
	
	void add_first(int data){
		if(head == null){
			head = new Node();
			head.data = data;
			head.next = head;
			tail = head;
		}
		else{
			Node new_node = new Node();
			new_node.data = data;
			new_node.next = head;
			head = new_node;
			tail.next = head;
		}
		size++;
	}
	
	void add_last(int data){
		if(head == null){
			head = new Node();
			head.data = data;
			head.next = head;
			tail = head;
		}
		else{
			Node new_node = new Node();
			new_node.data = data;
			new_node.next = head;
			tail.next = new_node;
			tail = new_node;
		}
		size++;
	}
	
}

public class Cll {

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

