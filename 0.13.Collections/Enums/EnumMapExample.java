import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

// Define an enum type for demonstration purposes
enum Color {
    RED, GREEN, BLUE
}

public class EnumMapExample {

    public static void main(String[] args) 
    {
        // Constructor: EnumMap(Class<K> keyType)
        EnumMap<Color, String> enumMap1 = new EnumMap<>(Color.class);
        enumMap1.put(Color.RED, "Red Color");
        enumMap1.put(Color.GREEN, "Green Color");
        enumMap1.put(Color.BLUE, "Blue Color");
        System.out.println("enumMap1: " + enumMap1); 
        // Output: {RED=Red Color, GREEN=Green Color, BLUE=Blue Color}

        // Constructor: EnumMap(EnumMap<K, ? extends V> m)
        EnumMap<Color, String> enumMap2 = new EnumMap<>(enumMap1);
        System.out.println("enumMap2 (copied from enumMap1): " + enumMap2); // Output: {RED=Red Color, GREEN=Green Color, BLUE=Blue Color}

        // Constructor: EnumMap(Map<K, ? extends V> m)
        Map<Color, String> map = Map.of(Color.RED, "Red", Color.GREEN, "Green", Color.BLUE, "Blue");
        EnumMap<Color, String> enumMap3 = new EnumMap<>(map);
        System.out.println("enumMap3 (created from map): " + enumMap3); // Output: {RED=Red, GREEN=Green, BLUE=Blue}

        // size()
        System.out.println("Size of enumMap1: " + enumMap1.size()); // Output: 3

        // containsValue(Object value)
        System.out.println("enumMap1 contains 'Red Color': " + enumMap1.containsValue("Red Color")); // Output: true

        // containsKey(Object key)
        System.out.println("enumMap1 contains key RED: " + enumMap1.containsKey(Color.RED)); // Output: true

        // get(Object key)
        System.out.println("Value for key RED in enumMap1: " + enumMap1.get(Color.RED)); // Output: Red Color

        // put(K key, V value)
        enumMap1.put(Color.RED, "Dark Red");
        System.out.println("Updated enumMap1 after put: " + enumMap1); // Output: {RED=Dark Red, GREEN=Green Color, BLUE=Blue Color}

        // putAll(Map<? extends K, ? extends V> m)
        Map<Color, String> newEntries = Map.of(Color.RED, "Bright Red", Color.GREEN, "Bright Green");
        enumMap1.putAll(newEntries);
        System.out.println("Updated enumMap1 after putAll: " + enumMap1); // Output: {RED=Bright Red, GREEN=Bright Green, BLUE=Blue Color}

        // remove(Object key)
        enumMap1.remove(Color.BLUE);
        System.out.println("Updated enumMap1 after remove BLUE: " + enumMap1); // Output: {RED=Bright Red, GREEN=Bright Green}

        // clear()
        enumMap1.clear();
        System.out.println("enumMap1 after clear: " + enumMap1); // Output: {}

        // keySet()
        Set<Color> keySet = enumMap2.keySet();
        System.out.println("Key set of enumMap2: " + keySet); // Output: [RED, GREEN, BLUE]

        // values()
        Collection<String> values = enumMap2.values();
        System.out.println("Values of enumMap2: " + values); // Output: [Red Color, Green Color, Blue Color]

        // entrySet()
        Set<Map.Entry<Color, String>> entrySet = enumMap2.entrySet();
        System.out.println("Entry set of enumMap2: " + entrySet); // Output: [RED=Red Color, GREEN=Green Color, BLUE=Blue Color]

        // equals(Object o)
        System.out.println("enumMap2 :" + enumMap2);
        //output : enumMap2 :{RED=Red Color, GREEN=Green Color, BLUE=Blue Color}
        System.out.println("enumMap3 :" + enumMap3);
        //output : enumMap3 :{RED=Red, GREEN=Green, BLUE=Blue}
        System.out.println("enumMap2 equals enumMap3: " + enumMap2.equals(enumMap3)); // Output: true

        // hashCode()
        System.out.println("Hash code of enumMap2: " + enumMap2.hashCode()); // Output: Hash code value

        // clone()
        EnumMap<Color, String> enumMapClone = enumMap2.clone();
        System.out.println("Clone of enumMap2: " + enumMapClone); // Output: {RED=Red Color, GREEN=Green Color, BLUE=Blue Color}
    }
}
