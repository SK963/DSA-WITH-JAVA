import java.util.*;

public class SumOfBeautyOfAllSubstrings {

    public static int beautySum(String s) {

        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq=new int [26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {

        System.out.println(beautySum("aabcb")); //5
        // ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
        System.out.println(beautySum("aabcbaa")); //17

        
    }
}
