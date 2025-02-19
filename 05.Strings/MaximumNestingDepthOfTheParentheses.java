import java.util.*;

public class MaximumNestingDepthOfTheParentheses {


    public static int maxDepth(String s) {
        int depth =0;

        Stack <Character> stack = new Stack<>();
        for(int i = 0 ; i< s.length();i++){
            Character current = s.charAt(i);
            if(current == '(')stack.push(current);
            else if(current == ')')stack.pop();
            depth = Integer.max(depth, stack.size());
        }

        return depth;
       
    }

    public static int maxDepth2(String s){
        int n=s.length();

        int para=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')para++;
            count =Math.max(para,count);
            if(s.charAt(i)==')')para--;
            
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(maxDepth2("(1+(2*3)+((8)/4))+1")); //3
        System.out.println(maxDepth2("(1)+((2))+(((3)))")); //3
        System.out.println(maxDepth2("()(())((()()))")); //3
    }
    
}
