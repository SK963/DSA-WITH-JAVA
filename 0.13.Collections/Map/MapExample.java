import java.util.*;


public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. size()
        System.out.println("Initial size: " + map.size());

        // 2. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 3. put(K, V)
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        System.out.println("Map after put: " + map);

        // 4. containsKey(Object)
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));

        // 5. containsValue(Object)
        System.out.println("Contains value 2? " + map.containsValue(2));

        // 6. get(Object) : gives value for the given key 
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        // 7. putAll(Map<? extends K, ? extends V>)
        Map<String, Integer> otherMap = new HashMap<>();
        otherMap.put("Date", 4);
        otherMap.put("Elderberry", 7);
        map.putAll(otherMap);
        System.out.println("Map after putAll: " + map);

        // 8. remove(Object)
        map.remove("Cherry");
        System.out.println("Map after remove: " + map);

        // 9. clear()
        map.clear();
        System.out.println("Map after clear: " + map);

        // Re-populate map for further examples
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Date", 4);
        map.put("Elderberry", 7);

		System.out.println("After repopulating the map : " + map);

        // 10. keySet()
        Set<String> keys = map.keySet();
        System.out.println("Key set: " + keys);

        // 11. values()
        Collection<Integer> values = map.values();
        System.out.println("Values collection: " + values);

        // 12. entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entry set: " + entries);

        // 13. equals(Object)
        Map<String, Integer> anotherMap = new HashMap<>(map);
        System.out.println("Map equals anotherMap? " + map.equals(anotherMap));

        // 14. hashCode()
        System.out.println("Map hash code: " + map.hashCode());

        // 15. getOrDefault(Object, V)
        System.out.println("Value for key 'Fig' (default 0): " + map.getOrDefault("Fig", 0));

        // 16. forEach(BiConsumer<? super K, ? super V>)
        System.out.println("forEach method:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 17. replaceAll(BiFunction<? super K, ? super V, ? extends V>)
        map.replaceAll((key, value) -> value * 2);
        System.out.println("Map after replaceAll: " + map);

        // 18. putIfAbsent(K, V)
        map.putIfAbsent("Grape", 6);
        System.out.println("Map after putIfAbsent: " + map);

        // 19. remove(Object, Object)
        map.remove("Apple", 6); 
        System.out.println("Map after remove with key and value: " + map);

        // 20. replace(K, V, V)
        map.replace("Banana", 4, 8); 
        System.out.println("Map after replace with key and values: " + map);

        // 21. replace(K, V)
        map.replace("Banana", 9); // This will replace the value
        System.out.println("Map after replace with key and new value: " + map);

        // 22. computeIfAbsent(K, Function<? super K, ? extends V>)
        map.computeIfAbsent("Honeydew", k -> 9);
        System.out.println("Map after computeIfAbsent: " + map);

        // 23. computeIfPresent(K, BiFunction<? super K, ? super V, ? extends V>)
        map.computeIfPresent("Banana", (k, v) -> v + 1);
        System.out.println("Map after computeIfPresent: " + map);

        // 24. compute(K, BiFunction<? super K, ? super V, ? extends V>)
        map.compute("Date", (k, v) -> (v == null) ? 0 : v + 1);
        System.out.println("Map after compute: " + map);

        // 25. merge(K, V, BiFunction<? super V, ? super V, ? extends V>)
        map.merge("Date", 1, Integer::sum);
        System.out.println("Map after merge: " + map);

        // 26-37. of() methods
        Map<String, Integer> singleEntryMap = Map.of("Kiwi", 1);
        Map<String, Integer> twoEntryMap = Map.of("Kiwi", 1, "Lemon", 2);
        Map<String, Integer> threeEntryMap = Map.of("Kiwi", 1, "Lemon", 2, "Mango", 3);
        Map<String, Integer> fourEntryMap = Map.of("Kiwi", 1, "Lemon", 2, "Mango", 3, "Nectarine", 4);
        Map<String, Integer> fiveEntryMap = Map.of("Kiwi", 1, "Lemon", 2, "Mango", 3, "Nectarine", 4, "Orange", 5);

        System.out.println("Single entry map: " + singleEntryMap);
        System.out.println("Two entry map: " + twoEntryMap);
        System.out.println("Three entry map: " + threeEntryMap);
        System.out.println("Four entry map: " + fourEntryMap);
        System.out.println("Five entry map: " + fiveEntryMap);

        // 38. ofEntries(Map.Entry<? extends K, ? extends V>...)
        Map<String, Integer> mapOfEntries = Map.ofEntries(
            Map.entry("Papaya", 3),
            Map.entry("Quince", 5)
        );
        System.out.println("Map of entries: " + mapOfEntries);

        // 39. copyOf(Map<? extends K, ? extends V>)
        Map<String, Integer> copiedMap = Map.copyOf(map);
        System.out.println("Copied map: " + copiedMap);
    }
}

/*
OUTPUT
	Initial size: 0
Is map empty? true
Map after put: {Apple=3, Cherry=5, Banana=2}
Contains key 'Apple'? true
Contains value 2? true
Value for key 'Banana': 2
Map after putAll: {Apple=3, Cherry=5, Date=4, Elderberry=7, Banana=2}
Map after remove: {Apple=3, Date=4, Elderberry=7, Banana=2}
Map after clear: {}
After repopulating the map : {Apple=3, Cherry=5, Date=4, Elderberry=7, Banana=2}
Key set: [Apple, Cherry, Date, Elderberry, Banana]
Values collection: [3, 5, 4, 7, 2]
Entry set: [Apple=3, Cherry=5, Date=4, Elderberry=7, Banana=2]
Map equals anotherMap? true
Map hash code: -1847367759
Value for key 'Fig' (default 0): 0
forEach method:
Apple -> 3
Cherry -> 5
Date -> 4
Elderberry -> 7
Banana -> 2
Map after replaceAll: {Apple=6, Cherry=10, Date=8, Elderberry=14, Banana=4}
Map after putIfAbsent: {Apple=6, Cherry=10, Grape=6, Date=8, Elderberry=14, Banana=4}
Map after remove with key and value: {Cherry=10, Grape=6, Date=8, Elderberry=14, Banana=4}
Map after replace with key and values: {Cherry=10, Grape=6, Date=8, Elderberry=14, Banana=8}
Map after replace with key and new value: {Cherry=10, Grape=6, Date=8, Elderberry=14, Banana=9}
Map after computeIfAbsent: {Cherry=10, Grape=6, Honeydew=9, Date=8, Elderberry=14, Banana=9}
Map after computeIfPresent: {Cherry=10, Grape=6, Honeydew=9, Date=8, Elderberry=14, Banana=10}
Map after compute: {Cherry=10, Grape=6, Honeydew=9, Date=9, Elderberry=14, Banana=10}
Map after merge: {Cherry=10, Grape=6, Honeydew=9, Date=10, Elderberry=14, Banana=10}
Single entry map: {Kiwi=1}
Two entry map: {Kiwi=1, Lemon=2}
Three entry map: {Kiwi=1, Mango=3, Lemon=2}
Four entry map: {Lemon=2, Mango=3, Kiwi=1, Nectarine=4}
Five entry map: {Kiwi=1, Orange=5, Nectarine=4, Mango=3, Lemon=2}
Map of entries: {Quince=5, Papaya=3}
Copied map: {Grape=6, Banana=10, Elderberry=14, Honeydew=9, Date=10, Cherry=10}
*/
