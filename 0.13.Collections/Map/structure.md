# Map (Interface)

``` java
javap java.util.Map
Compiled from "Map.java"
public interface java.util.Map<K, V> 
{
  public abstract int size();
  public abstract boolean isEmpty();
  
  public abstract boolean containsKey(java.lang.Object);
  public abstract boolean containsValue(java.lang.Object);
  
  public abstract V get(java.lang.Object);
  public abstract V put(K, V);
  public abstract void putAll(java.util.Map<? extends K, ? extends V>);
  
  public abstract V remove(java.lang.Object);
  public abstract void clear();
  
  public abstract java.util.Set<K> keySet();
  public abstract java.util.Collection<V> values();
  
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public default V getOrDefault(java.lang.Object, V);
  
  public default void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  
  public default void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V putIfAbsent(K, V);
  
  public default boolean remove(java.lang.Object, java.lang.Object);
  public default boolean replace(K, V, V);
  public default V replace(K, V);
  public default V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public default V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  
  public static <K, V> java.util.Map<K, V> of();
  public static <K, V> java.util.Map<K, V> of(K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  
  public static <K, V> java.util.Map<K, V> ofEntries(java.util.Map$Entry<? extends K, ? extends V>...);
  public static <K, V> java.util.Map$Entry<K, V> entry(K, V);
  public static <K, V> java.util.Map<K, V> copyOf(java.util.Map<? extends K, ? extends V>);
}
```


----

# MapEntry (Class)

``` java

javap java.util.Map.Entry
Compiled from "Map.java"
public interface java.util.Map$Entry<K, V>
{
  public abstract K getKey();
  public abstract V getValue();
  public abstract V setValue(V);
  
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  
  //Comparators 
  //single comparator
  public static <K extends java.lang.Comparable <? super K>, V> java.util.Comparator<java.util.Map$Entry<K, V>> comparingByKey();
  public static <K, V extends java.lang.Comparable<? super V>> java.util.Comparator<java.util.Map$Entry<K, V>> comparingByValue();
  //multi or modified comparators
  public static <K, V> java.util.Comparator<java.util.Map$Entry<K, V>> comparingByKey(java.util.Comparator<? super K>);
  public static <K, V> java.util.Comparator<java.util.Map$Entry<K, V>> comparingByValue(java.util.Comparator<? super V>);
  
  //Copy 
  public static <K, V> java.util.Map$Entry<K, V> copyOf(java.util.Map$Entry<? extends K, ? extends V>);
}
```

# HashMap (Class)

``` Java
javap java.util.HashMap
Compiled from "HashMap.java"
public class java.util.HashMap<K, V> 
extends java.util.AbstractMap<K, V> 
implements java.util.Map<K, V>, 
java.lang.Cloneable, 
java.io.Serializable
{
  static final int DEFAULT_INITIAL_CAPACITY;
  static final int MAXIMUM_CAPACITY;
  static final float DEFAULT_LOAD_FACTOR;
  static final int TREEIFY_THRESHOLD;
  static final int UNTREEIFY_THRESHOLD;
  static final int MIN_TREEIFY_CAPACITY;
  
  transient java.util.HashMap$Node<K, V>[] table;
  transient java.util.Set<java.util.Map$Entry<K, V>> entrySet;
  transient int size;
  transient int modCount;
  
  int threshold;
  final float loadFactor;
  
  static final int hash(java.lang.Object);
  
  static java.lang.Class<?> comparableClassFor(java.lang.Object);
  static int compareComparables(java.lang.Class<?>, java.lang.Object, java.lang.Object);
  static final int tableSizeFor(int);
  
  //Constructors
  public java.util.HashMap(int, float);
  public java.util.HashMap(int);
  public java.util.HashMap();
  public java.util.HashMap(java.util.Map<? extends K, ? extends V>);
  
  
  final void putMapEntries(java.util.Map<? extends K, ? extends V>, boolean);
  
  public int size();
  public boolean isEmpty();
  
  public V get(java.lang.Object);
  final java.util.HashMap$Node<K, V> getNode(java.lang.Object);
  public boolean containsKey(java.lang.Object);
  public V put(K, V);
  final V putVal(int, K, V, boolean, boolean);
  final java.util.HashMap$Node<K, V>[] resize();
  final void treeifyBin(java.util.HashMap$Node<K, V>[], int);
  public void putAll(java.util.Map<? extends K, ? extends V>);
  public V remove(java.lang.Object);
  final java.util.HashMap$Node<K, V> removeNode(int, java.lang.Object, java.lang.Object, boolean, boolean);
  public void clear();
  public boolean containsValue(java.lang.Object);
  public java.util.Set<K> keySet();
  final <T> T[] prepareArray(T[]);
  <T> T[] keysToArray(T[]);
  <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public V getOrDefault(java.lang.Object, V);
  public V putIfAbsent(K, V);
  public boolean remove(java.lang.Object, java.lang.Object);
  public boolean replace(K, V, V);
  public V replace(K, V);
  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public java.lang.Object clone();
  final float loadFactor();
  final int capacity();
  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  void reinitialize();
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;
  static int calculateHashMapCapacity(int);
  public static <K, V> java.util.HashMap<K, V> newHashMap(int);
}

```



# LinkedHashMap (Class)
``` java

javap java.util.LinkedHashMap
Compiled from "LinkedHashMap.java"
public class java.util.LinkedHashMap<K, V> 
extends java.util.HashMap<K, V> 
implements java.util.Map<K, V> 
{

	//Constructors
	public java.util.LinkedHashMap(int, float);
  public java.util.LinkedHashMap(int);
  public java.util.LinkedHashMap();
  public java.util.LinkedHashMap(java.util.Map<? extends K, ? extends V>);
  public java.util.LinkedHashMap(int, float, boolean);
  
  transient java.util.LinkedHashMap$Entry<K, V> head;
  transient java.util.LinkedHashMap$Entry<K, V> tail;
  
  final boolean accessOrder;
  
  void reinitialize();
  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;
  
  
  
  public boolean containsValue(java.lang.Object);
  public V get(java.lang.Object);
  public V getOrDefault(java.lang.Object, V);
  public void clear();
  protected boolean removeEldestEntry(java.util.Map$Entry<K, V>);
  
  public java.util.Set<K> keySet();
  final <T> T[] keysToArray(T[]);
  final <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(int);

}

```

# TreeMap (Class)

``` java
javap java.util.TreeMap
Compiled from "TreeMap.java"
public class java.util.TreeMap<K, V> 
extends java.util.AbstractMap<K, V> 
implements java.util.NavigableMap<K, V>, 
java.lang.Cloneable, 
java.io.Serializable 
{
	
	//Consturctors
  public java.util.TreeMap();
  public java.util.TreeMap(java.util.Comparator<? super K>);
  public java.util.TreeMap(java.util.Map<? extends K, ? extends V>);
  public java.util.TreeMap(java.util.SortedMap<K, ? extends V>);
  
  public int size();
  
  public boolean containsKey(java.lang.Object);
  public boolean containsValue(java.lang.Object);
  public V get(java.lang.Object);
  public java.util.Comparator<? super K> comparator();
  public K firstKey();
  public K lastKey();
  public void putAll(java.util.Map<? extends K, ? extends V>);
  final java.util.TreeMap$Entry<K, V> getEntry(java.lang.Object);
  final java.util.TreeMap$Entry<K, V> getEntryUsingComparator(java.lang.Object);
  final java.util.TreeMap$Entry<K, V> getCeilingEntry(K);
  final java.util.TreeMap$Entry<K, V> getFloorEntry(K);
  final java.util.TreeMap$Entry<K, V> getHigherEntry(K);
  final java.util.TreeMap$Entry<K, V> getLowerEntry(K);
  
  public V put(K, V);
  public V putIfAbsent(K, V);
  
  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  public V remove(java.lang.Object);
  public void clear();
  public java.lang.Object clone();
  public java.util.Map$Entry<K, V> firstEntry();
  public java.util.Map$Entry<K, V> lastEntry();
  public java.util.Map$Entry<K, V> pollFirstEntry();
  public java.util.Map$Entry<K, V> pollLastEntry();
  public java.util.Map$Entry<K, V> lowerEntry(K);
  public K lowerKey(K);
  public java.util.Map$Entry<K, V> floorEntry(K);
  public K floorKey(K);
  public java.util.Map$Entry<K, V> ceilingEntry(K);
  public K ceilingKey(K);
  public java.util.Map$Entry<K, V> higherEntry(K);
  public K higherKey(K);
  public java.util.Set<K> keySet();
  public java.util.NavigableSet<K> navigableKeySet();
  public java.util.NavigableSet<K> descendingKeySet();
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public java.util.NavigableMap<K, V> descendingMap();
  public java.util.NavigableMap<K, V> subMap(K, boolean, K, boolean);
  public java.util.NavigableMap<K, V> headMap(K, boolean);
  public java.util.NavigableMap<K, V> tailMap(K, boolean);
  public java.util.SortedMap<K, V> subMap(K, K);
  public java.util.SortedMap<K, V> headMap(K);
  public java.util.SortedMap<K, V> tailMap(K);
  public boolean replace(K, V, V);
  public V replace(K, V);
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  java.util.Iterator<K> keyIterator();
  java.util.Iterator<K> descendingKeyIterator();
  final int compare(java.lang.Object, java.lang.Object);
  static final boolean valEquals(java.lang.Object, java.lang.Object);
  static <K, V> java.util.Map$Entry<K, V> exportEntry(java.util.TreeMap$Entry<K, V>);
  static <K, V> K keyOrNull(java.util.TreeMap$Entry<K, V>);
  static <K> K key(java.util.TreeMap$Entry<K, ?>);
  final java.util.TreeMap$Entry<K, V> getFirstEntry();
  final java.util.TreeMap$Entry<K, V> getLastEntry();
  static <K, V> java.util.TreeMap$Entry<K, V> successor(java.util.TreeMap$Entry<K, V>);
  static <K, V> java.util.TreeMap$Entry<K, V> predecessor(java.util.TreeMap$Entry<K, V>);
  void readTreeSet(int, java.io.ObjectInputStream, V) throws java.io.IOException, java.lang.ClassNotFoundException;
  void addAllForTreeSet(java.util.SortedSet<? extends K>, V);
  static <K> java.util.Spliterator<K> keySpliteratorFor(java.util.NavigableMap<K, ?>);
  final java.util.Spliterator<K> keySpliterator();
  final java.util.Spliterator<K> descendingKeySpliterator();
  static {};
}
```


# WeakHashMap

``` java
javap java.util.WeakHashMap
Compiled from "WeakHashMap.java"
public class java.util.WeakHashMap<K, V> 
extends java.util.AbstractMap<K, V> 
implements java.util.Map<K, V> 
{
  java.util.WeakHashMap$Entry<K, V>[] table;
  int modCount;
  public java.util.WeakHashMap(int, float);
  public java.util.WeakHashMap(int);
  public java.util.WeakHashMap();
  public java.util.WeakHashMap(java.util.Map<? extends K, ? extends V>);
  static java.lang.Object unmaskNull(java.lang.Object);
  final int hash(java.lang.Object);
  public int size();
  public boolean isEmpty();
  public V get(java.lang.Object);
  public boolean containsKey(java.lang.Object);
  java.util.WeakHashMap$Entry<K, V> getEntry(java.lang.Object);
  public V put(K, V);
  void resize(int);
  public void putAll(java.util.Map<? extends K, ? extends V>);
  public V remove(java.lang.Object);
  boolean removeMapping(java.lang.Object);
  public void clear();
  public boolean containsValue(java.lang.Object);
  public java.util.Set<K> keySet();
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public static <K, V> java.util.WeakHashMap<K, V> newWeakHashMap(int);
  static {};
}

```




# IdentityHashMap

``` java
javap java.util.IdentityHashMap
Compiled from "IdentityHashMap.java"
public class java.util.IdentityHashMap<K, V> 
extends java.util.AbstractMap<K, V> 
implements java.util.Map<K, V>, 
java.io.Serializable, 
java.lang.Cloneable 
{
  transient java.lang.Object[] table;
  int size;
  transient int modCount;
  static final java.lang.Object NULL_KEY;
  
  static final java.lang.Object unmaskNull(java.lang.Object);
  public java.util.IdentityHashMap();
  public java.util.IdentityHashMap(int);
  public java.util.IdentityHashMap(java.util.Map<? extends K, ? extends V>);
  public int size();
  public boolean isEmpty();
  public V get(java.lang.Object);
  public boolean containsKey(java.lang.Object);
  public boolean containsValue(java.lang.Object);
  public V put(K, V);
  public void putAll(java.util.Map<? extends K, ? extends V>);
  public V remove(java.lang.Object);
  public void clear();
  public boolean equals(java.lang.Object);
  public int hashCode();
  public java.lang.Object clone();
  public java.util.Set<K> keySet();
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public boolean remove(java.lang.Object, java.lang.Object);
  public boolean replace(K, V, V);
  static {};
}
```

# HashTable

```  java
javap java.util.Hashtable
Compiled from "Hashtable.java"
public class java.util.Hashtable<K, V> 
extends java.util.Dictionary<K, V> 
implements java.util.Map<K, V>, 
java.lang.Cloneable, 
java.io.Serializable 
{
  public java.util.Hashtable(int, float);
  public java.util.Hashtable(int);
  public java.util.Hashtable();
  public java.util.Hashtable(java.util.Map<? extends K, ? extends V>);
  java.util.Hashtable(java.lang.Void);
  public synchronized int size();
  public synchronized boolean isEmpty();
  public synchronized java.util.Enumeration<K> keys();
  public synchronized java.util.Enumeration<V> elements();
  public synchronized boolean contains(java.lang.Object);
  public boolean containsValue(java.lang.Object);
  public synchronized boolean containsKey(java.lang.Object);
  public synchronized V get(java.lang.Object);
  protected void rehash();
  public synchronized V put(K, V);
  public synchronized V remove(java.lang.Object);
  public synchronized void putAll(java.util.Map<? extends K, ? extends V>);
  public synchronized void clear();
  public synchronized java.lang.Object clone();
  final java.util.Hashtable<?, ?> cloneHashtable();
  public synchronized java.lang.String toString();
  public java.util.Set<K> keySet();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public java.util.Collection<V> values();
  public synchronized boolean equals(java.lang.Object);
  public synchronized int hashCode();
  public synchronized V getOrDefault(java.lang.Object, V);
  public synchronized void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public synchronized void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public synchronized V putIfAbsent(K, V);
  public synchronized boolean remove(java.lang.Object, java.lang.Object);
  public synchronized boolean replace(K, V, V);
  public synchronized V replace(K, V);
  public synchronized V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public synchronized V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public synchronized V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public synchronized V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  void writeHashtable(java.io.ObjectOutputStream) throws java.io.IOException;
  final void defaultWriteHashtable(java.io.ObjectOutputStream, int, float) throws java.io.IOException;
  void readHashtable(java.io.ObjectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException;
}

```