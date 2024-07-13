import java.util.Stack;

public class StackUsingJCF
{
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

		System.out.println("the stack: " + stack);

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek()); // Output: Cherry

        // Pop an element from the stack
        System.out.println("Popped element : " + stack.pop()); // Output: Cherry

		System.out.println("stack after popping: " + stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty()); // Output: false

        // Search for an element
        System.out.println("Position of 'Banana' in stack: " + stack.search("Banana")); // Output: 1 ( found )
        System.out.println("Position of 'Cherry' in stack: " + stack.search("Cherry")); // Output: -1 (not found)

        // Display all elements in the stack
        System.out.println("Elements in stack: " + stack);



		//using some other methods of collection and list  class
		System.out.println("Size of the stack is :" + stack.size());

        //clearing the stack

        stack.clear();

		System.out.println("The stack is empty :" + stack.isEmpty());
        System.out.println(stack);

    }
}
