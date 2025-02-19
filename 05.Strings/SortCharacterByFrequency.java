import java.util.*;

public class SortCharacterByFrequency {

    public static String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i< s.length() ; i++){
            char current = s.charAt(i);
            map.put(current, map.getOrDefault(current, 0)+1);
        }



        Map<Character, Integer> sortedMap = new TreeMap<>(
            (char1, char2) -> {
                int freq1 = map.get(char1);
                int freq2 = map.get(char2);

                // Sort primarily by frequency (descending)
                int freqCompare = Integer.compare(freq2, freq1);
                if (freqCompare != 0) {
                    return freqCompare;
                }

                // If frequencies are the same, sort alphabetically
                return Character.compare(char1, char2);
            }
        );

        sortedMap.putAll(map);
       
        StringBuffer result = new StringBuffer("");
        
        for(Map.Entry<Character, Integer> element : sortedMap.entrySet()){
            for(int i = 0 ;i< element.getValue();i++)
                result.append(element.getKey());

        }
        return result.toString();
        
           
        
    }



    // using priority queue
    public static String frequencySort2(String s){
        Map<Character, Integer> hm = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        
        pq.addAll(hm.entrySet());
        System.out.println(pq.toString());
        
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        
        return result.toString();
    }

    public static void main(String[] args) {


        System.out.println(frequencySort2("tree"));
        System.out.println(frequencySort2("cccaaa"));
        System.out.println(frequencySort2("Aabb"));
        
    }
    
}
