import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++){
            char current = s.charAt(i);
            map.put(current,map.getOrDefault(current, 0)+1);
            // System.out.println(map.toString());
        }

        for(int i = 0 ; i< t.length() ; i++){
            char current = t.charAt(i);
            if(map.getOrDefault(current,0) > 0) {
                map.put(current,map.get(current)-1); 
                if(map.get(current) == 0)map.remove(current);
            }
            else return false;
            // System.out.println(map.toString());
        }

        return map.isEmpty() ? true : false;

        
        
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
    
}
