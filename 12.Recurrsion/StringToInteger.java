
// topics : String , Recurrsion
public class StringToInteger {
  

    //iteratve implementation : 
    public static int myAtoi(String s) {
        
        int i = 0;
        int sign = 1;
        int result = 0;
        
        if(s.length() == 0) return 0;
        while(i < s.length() && s.charAt(i) == ' ') i++; // ingoring whitespaces
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = s.charAt(i) == '+' ? 1 : -1; //sign 
            i++;
        }
        
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            //handling edge test cases of limit values
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return result * sign;
        
    }

    // recursive implementation
    public static int myAtoi2(String s){
        return Integer.MAX_VALUE;
    }

    
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-042"));
        System.out.println(myAtoi("1337c0d3"));
    }
    
}
