public class LongestCommonPrefix {

    // brute 
    public static String longestCommongPrefix(String words[]){
        if(words.length < 1) return "";
        if(words.length == 1) return words[0];
        int end = 0;
        String result ="";
        while(end < words[0].length()){
            char endchar = words[0].charAt(end);
            for(int i = 1 ; i< words.length ;i++){
                if(end > words[i].length()-1 || words[i].charAt(end)!= endchar) return result;
                
                                                
            }
            result += endchar;
            end++;
        }
        return result;

    }

    // approach : Trie


    public static void main(String[] args) {
        System.out.println(longestCommongPrefix(new String[]{"flower","flow","flight"})); // "fl"
        System.out.println(longestCommongPrefix(new String[]{"dog","racecar","car"}));// ""
        System.out.println(longestCommongPrefix(new String[]{"a"}));// "a"
        System.out.println(longestCommongPrefix(new String[]{"flower","flower","flower","flower"}));// "flower"
        System.out.println(longestCommongPrefix(new String[]{"c","c"}));// "c"
        System.out.println(longestCommongPrefix(new String[]{"ab", "a"}));// "a"
    }
    
}
