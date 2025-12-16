public class ValidParenthesisString {


    // recursive approach
    // T : 3^N
    // S : O(N) (stack space)
    public static boolean checkValidString(String str) {
         return check(str, 0, 0);

    }

    public static boolean check(String str , int index , int count){

        if(count < 0) return false;
        if(index == str.length())
             return count==0;
        
        if(str.charAt(index)== '(') return check(str, index+1, count+1);
        else if(str.charAt(index)== ')') return check(str, index+1, count-1);
        else {
             return check(str, index+1, count-1) || check(str, index+1, count+1) ||check(str, index+1, count);
        }
        

    }

    // greedy approach
    public static boolean checkValidString2(String str){
        int min = 0 , max = 0;

        for(int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                min++;
                max++;
            }
            else if(ch == ')'){
                min--;
                max--;
            }
            else{
                min--;
                max++;
            }

            if(min < 0)min =0;
            if(max <0)return false;
        }
        return min == 0;
    }



    public static void main(String[] args) {

        System.out.println(checkValidString2("()"));
        System.out.println(checkValidString2("(*)"));
        System.out.println(checkValidString2("(*))"));
        System.out.println(checkValidString2("(*()"));
        System.out.println(checkValidString2("(*(()"));

        
    }
    
}
