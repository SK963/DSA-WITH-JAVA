import java.util.Arrays;

public class ReverseWordsInAString {
    // Desired 
    //S: O(1)

    // brute : remove leading and trainling spaces split the words and store it in a array of string add them in reverse
    // R: O(N) S : O(N)
    public static String reverseWords(String str){
        str = str.trim();
        String words[] = str.split("\s+");
        // System.out.println(Arrays.toString(words));
        str = "";
        for(int i = words.length-1; i> 0;i--){
            str += words[i];
            str += " ";
        }
        str += words[0];
        return str;

    }


    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue")); //"blue is sky the"
        System.out.println(reverseWords("a good   example"));//"example good a"
        System.out.println(reverseWords("  hello world  ")); //"world hello"
    }
    
}
