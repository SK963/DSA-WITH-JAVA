import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {


    public static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        int left = n , right = n;

        parenthesis(ans , left , right , new StringBuilder());

        return ans;
        
        
    }

    static void parenthesis(List<String> ans , int left , int right , StringBuilder paren){

        if(left == 0 && right == 0)ans.add(new String(paren));
        else{
            if(left < right  && left >=0 && right >= 0){
                paren.append('(');
                if(left >0 ) parenthesis(ans, left-1, right, paren);
                paren.deleteCharAt(paren.length()-1);
                paren.append(')');
                if(right > 0)parenthesis(ans, left, right-1, paren);
                paren.deleteCharAt(paren.length()-1);
            }
            else if(left == right){
                paren.append('(');
                parenthesis(ans, left-1, right, paren);
                paren.deleteCharAt(paren.length()-1);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        // ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(generateParenthesis(1));
        //["()"]


    }
    
}
