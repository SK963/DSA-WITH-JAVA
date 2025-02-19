// topic : sliding-window , two-pointer , Strings , Dynamic Programming
import java.util.*;
public class CountNumberOfSubstrings {

    //approach : use a set 
    // T : O(N^2) , S: O(N);
    static long substrCount(String S, int K) {

        List<String> list = new ArrayList<>();
        int n = S.length();
        Set<Character>set = new HashSet<>();
        int count = 0;
        
        for(int i = 0 ; i< n ; i++){
            set.clear();
            set.add(S.charAt(i));
            int j = i;

            while(set.size() <= K && j < S.length()){
                if(set.size()== K){
                    list.add(S.substring(i,j+1));
                    count++;
                }
                j++;
                if(j<S.length())set.add(S.charAt(j));
            
            }
            
        }


        System.out.println(list.toString());
        return count ;
        
    }


    // approac : sliding window / two pointer : optimized
    static long substrCount3 (String s, int k) {
        return helper(s,k)- helper(s,k-1);
    
    }
    
    static long helper(String s, int k){
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        int left = 0;
        long count = 0;

        for (int right = 0; right < n; right++) {
            // Add character at `right` to the map
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0) + 1);

            // Shrink window if we exceed `k` distinct characters
            while (hm.size() > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;
            }

            // Count all valid substrings ending at `right`
            if(hm.size()<=k){
               count += (right - left + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(substrCount("aba", 2)); //3 : ["ab", "ba" and "aba".]
        System.out.println(substrCount("abaaca", 1)); //7 ["a", "b", "a", "aa", "a", "c", "a". ]
        
    }
}
