import java.util.*;


class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
		
	}
}

class LinkedList{

	Node head = null;
	Node tail = null;

	public LinkedList(){
		head = null;
		tail = null;
	}


	//INSERTION
	void add_first(int data){
		if(head == null){
			head = new Node(data);
			tail = head;
		}
		else{
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	void add_last(int data){
		if(head == null){
			Node new_node = new Node(data);
			head = new_node;
			tail = head;
		}
		else{
			Node new_node = new Node(data);
			tail.next = new_node;
			tail = new_node;
		}
	}


	//DELETE
	//remove from first/ front
	void remove_first(){
		if(head != null && head.next != null){
			head = head.next;
			System.out.println("Element removed from the first");
			
		}
		else if(head.next == null){
			head = null;
			tail = null;
			System.out.println("Element removed from the first");
		}
		else
			System.out.println("Empty linked list");
	}

	// remove from last
	void remove_last(){
		Node curr  = head;
		while(curr.next.next != null){
			curr = curr.next;
		}
		curr.next = null;
	}

	//length 

	
	//search

	

	//Printing the linked list
	void print(){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	
	}

	
	
}

public class Main {
	public static void main(String args[]){

		LinkedList ll = new LinkedList();
		ll.add_first(10);  // 10
		ll.add_first(20);  // 20 -> 10
		ll.add_last(30);   // 20 ->10->30
		ll.add_last(40);   // 20 ->10->30 ->40
		ll.print();
		
		ll.remove_first();
		ll.remove_last();
		
		ll.print();
		
	}
}
