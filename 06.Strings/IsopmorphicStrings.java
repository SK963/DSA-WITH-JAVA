import java.util.*;

public class IsopmorphicStrings {


    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i< s.length() ;i++){
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(map.containsKey(key)){
                if(map.get(key)!= value)return false;
            }
            else{
                if(!map.values().contains(value))map.put(key,value);
                else return false;

            } 

        }
        return true;
        
    }
    

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));

    }
}
