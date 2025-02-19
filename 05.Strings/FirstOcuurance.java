public class FirstOcuurance {
    

    // approach :  finding substring and comparingn it with needle
    public static int strStr(String haystack, String needle) {
        if(haystack.length() == needle.length())
            return haystack.equals(needle)?0:-1;
        for(int i =0; i< haystack.length()-needle.length()+1; i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
        
    }

    // approach : using  KMP algo for string matching 

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        
    }

    
}
