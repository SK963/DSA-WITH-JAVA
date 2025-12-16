import java.util.Arrays;
import java.util.Stack;

public class ReverseaStack {

    public static void reverse(Stack<Integer> s) {
        if (s.size() > 0) {

            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack
            int x = s.peek();
            s.pop();
            reverse(s);

            insert_at_bottom(s, x);
        }
    }

    static void insert_at_bottom(Stack<Integer> s, int x) {

        if (s.isEmpty())
            s.push(x);

        else {


            int a = s.peek();
            s.pop();
            insert_at_bottom(s, x);

            s.push(a);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        reverse(stack);
        System.out.println(stack);

    }

}
