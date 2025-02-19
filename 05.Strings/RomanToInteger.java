import java.util.*;
public class RomanToInteger {


    public static int romanToInt(String s) {
        Map<Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int value = 0;
        for(int i = 0 ; i<s.length()-1 ; i++){
            int val = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));

            if(val < next)value -= val;
            else value += val;



        }
        value += map.get(s.charAt(s.length()-1));
        
        return value;
        

        
    }
    


    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("MCMXCIV")); //1994
    }
}
