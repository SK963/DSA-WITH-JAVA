// Topics : Strings , Stack
import java.util.*;

public class RemoveOutermostParentheses {

    // T : O(N^2) , S : O(N); N: str.length
    public static String removeOuterParentheses(String str) {
       
        String result = "";

        int count1 = 0; // count (
        int count2 = 0; // count )
        String valid_parenthesis = "";
        for(int i = 0 ; i< str.length(); i++){ 
            char current = str.charAt(i);
            valid_parenthesis += current;
            if(current == '(') count1++;
            else count2++;

            if(count1 == count2 && count1 != 0){
                for(int j = 1 ; j< valid_parenthesis.length()-1 ; j++){
                    result += valid_parenthesis.charAt(j);
                }
                
                valid_parenthesis = "";
            }
            
            
        }

        return result;

        
    }


    // another approach : 
    public static String removeOuterParentheses2(String str){
        String result = "";   // To store the final result
        int balance = 0; // To keep track of the balance of parentheses

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(') {
                // If balance is greater than 0, it means this '(' is not an
                // outermost parenthesis
                if (balance > 0) result += current; // Add the character to the result
                
                
                balance++; // Increase the balance for '('
            } 
            else {
                balance--; // Decrease the balance for ')'
                // If balance is greater than 0, it means this ')' is not an
                // outermost parenthesis
                if (balance > 0) result += current; // Add the character to the result
                
            }

        }
        return result;
    }



    // approach : using stack
    static String removeOuterParentheses3(String str) {
        String result = " ";
        Stack<Character> stack =  new Stack<>();;
        int start = 0;  // Start index of a primitive block

        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == '(') {
                stack.push('(');
            }else{
                stack.pop();
            }
            // When the stack is empty, we found a complete primitive block
            if(stack.empty()){
                // Append all except the outermost parentheses
                result += str.substring(start+1,i);
                start = i + 1;  // Update the start for the next primitive block
            }
        }

        return result;
    }

    
    public static void main(String[] args) {

        System.out.println(removeOuterParentheses3("(()())(())")); //"()()()"
        System.out.println(removeOuterParentheses3("(()())(())(()(()))"));//()()()()(())
        System.out.println(removeOuterParentheses3("()()")); //""

    }
    
}
