import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Basic Operations
        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the stack
        System.out.println("Stack after pushes: " + stack);

        // Peek at the top element without removing it
        System.out.println("Element at the top: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Search for an element
        int position = stack.search("Apple");
        if (position != -1) {
            System.out.println("Position of 'Apple' in stack: " + position);
        } else {
            System.out.println("'Apple' is not in the stack");
        }



		//using some list interface function 
		//isempty
		System.out.println("Is the stack empty? " + stack.isEmpty());

		stack.add("Orange");
		System.out.println(stack);

		Integer stackarray[] = (Integer[]) stack.toArray();
		System.out.println(stackarray);
		
    }
}
