public class LongestPalindromicSubstring {

    // Brute 
    // T : O(N^2)  S : O(1)
    public static String longestPalindrome(String s) {
        // if(s.length() <= 1)return s;
        String result ="";
        boolean found = false;

        for(int i = 0 ; i< s.length() ; i++){

            int left = i;
            int right = s.length()-1;

            while(left <= right ){
                if(s.charAt(left) == s.charAt(right)){
                    if( right-left+1 > result.length() && ispalidrome(s, left , right) ){
                        result = s.substring(left, right+1);
                        found = true;
                        // System.out.println(result);
                        break;
                    }
                }
                if(found) break;
                right--;

            }
            found = false;

        }
        return result;


        
    }

    static boolean ispalidrome(String s  , int left ,int right){
        int i = left;
        int j = right;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); //"baba"
        System.out.println(longestPalindrome("cbbd"));//"bb"
        System.out.println(longestPalindrome("a")); //"a"
        System.out.println(longestPalindrome("ac")); //"a"
        System.out.println(longestPalindrome("aacabdkacaa"));//"aca"
        System.out.println(longestPalindrome("bb"));//"bb"
    }
    
}
