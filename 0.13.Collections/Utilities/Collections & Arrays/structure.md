## Arrays Class  



### Structure 

``` java

javap java.util.Arrays
Compiled from "Arrays.java"
public class java.util.Arrays 
{

  static final boolean $assertionsDisabled;
  static void rangeCheck(int, int, int);
  
  //sorting 
  public static void sort(int[]);
  public static void sort(int[], int, int);
  public static void sort(long[]);
  public static void sort(long[], int, int);
  public static void sort(short[]);
  public static void sort(short[], int, int);
  public static void sort(char[]);
  public static void sort(char[], int, int);
  public static void sort(byte[]);
  public static void sort(byte[], int, int);
  public static void sort(float[]);
  public static void sort(float[], int, int);
  public static void sort(double[]);
  public static void sort(double[], int, int);
  public static void sort(java.lang.Object[]);
  public static void sort(java.lang.Object[], int, int);
  
  //sorting with comparator 
  public static <T> void sort(T[], java.util.Comparator<? super T>);
  public static <T> void sort(T[], int, int, java.util.Comparator<? super T>);
  
  //parallelsort 
  public static void parallelSort(byte[]);
  public static void parallelSort(byte[], int, int);
  public static void parallelSort(char[]);
  public static void parallelSort(char[], int, int);
  public static void parallelSort(short[]);
  public static void parallelSort(short[], int, int);
  public static void parallelSort(int[]);
  public static void parallelSort(int[], int, int);
  public static void parallelSort(long[]);
  public static void parallelSort(long[], int, int);
  public static void parallelSort(float[]);
  public static void parallelSort(float[], int, int);
  public static void parallelSort(double[]);
  public static void parallelSort(double[], int, int);
//   parallelsort on a object array which extends comparable
  public static <T extends java.lang.Comparable<? super T>> void parallelSort(T[]);
  public static <T extends java.lang.Comparable<? super T>> void parallelSort(T[], int, int);
  
  //parallelsort with comparator
  public static <T> void parallelSort(T[], java.util.Comparator<? super T>);
  public static <T> void parallelSort(T[], int, int, java.util.Comparator<? super T>);
  
  
  // ParallelPrefix
  public static <T> void parallelPrefix(T[], java.util.function.BinaryOperator<T>);
  public static <T> void parallelPrefix(T[], int, int, java.util.function.BinaryOperator<T>);
  public static void parallelPrefix(long[], java.util.function.LongBinaryOperator);
  public static void parallelPrefix(long[], int, int, java.util.function.LongBinaryOperator);
  public static void parallelPrefix(double[], java.util.function.DoubleBinaryOperator);
  public static void parallelPrefix(double[], int, int, java.util.function.DoubleBinaryOperator);
  public static void parallelPrefix(int[], java.util.function.IntBinaryOperator);
  public static void parallelPrefix(int[], int, int, java.util.function.IntBinaryOperator);
  
  // BinarySearch
  public static int binarySearch(long[], long);
  public static int binarySearch(long[], int, int, long);
  public static int binarySearch(int[], int);
  public static int binarySearch(int[], int, int, int);
  public static int binarySearch(short[], short);
  public static int binarySearch(short[], int, int, short);
  public static int binarySearch(char[], char);
  public static int binarySearch(char[], int, int, char);
  public static int binarySearch(byte[], byte);
  public static int binarySearch(byte[], int, int, byte);
  public static int binarySearch(double[], double);
  public static int binarySearch(double[], int, int, double);
  public static int binarySearch(float[], float);
  public static int binarySearch(float[], int, int, float);
  public static int binarySearch(java.lang.Object[], java.lang.Object);
  public static int binarySearch(java.lang.Object[], int, int, java.lang.Object);
  public static <T> int binarySearch(T[], T, java.util.Comparator<? super T>);
  public static <T> int binarySearch(T[], int, int, T, java.util.Comparator<? super T>);
  
  // Equals 
  public static boolean equals(long[], long[]);
  public static boolean equals(long[], int, int, long[], int, int);
  public static boolean equals(int[], int[]);
  public static boolean equals(int[], int, int, int[], int, int);
  public static boolean equals(short[], short[]);
  public static boolean equals(short[], int, int, short[], int, int);
  public static boolean equals(char[], char[]);
  public static boolean equals(char[], int, int, char[], int, int);
  public static boolean equals(byte[], byte[]);
  public static boolean equals(byte[], int, int, byte[], int, int);
  public static boolean equals(boolean[], boolean[]);
  public static boolean equals(boolean[], int, int, boolean[], int, int);
  public static boolean equals(double[], double[]);
  public static boolean equals(double[], int, int, double[], int, int);
  public static boolean equals(float[], float[]);
  public static boolean equals(float[], int, int, float[], int, int);
  public static boolean equals(java.lang.Object[], java.lang.Object[]);
  public static boolean equals(java.lang.Object[], int, int, java.lang.Object[], int, int);
  
  public static <T> boolean equals(T[], T[], java.util.Comparator<? super T>);
  public static <T> boolean equals(T[], int, int, T[], int, int, java.util.Comparator<? super T>);
  
  // Fill
  public static void fill(long[], long);
  public static void fill(long[], int, int, long);
  public static void fill(int[], int);
  public static void fill(int[], int, int, int);
  public static void fill(short[], short);
  public static void fill(short[], int, int, short);
  public static void fill(char[], char);
  public static void fill(char[], int, int, char);
  public static void fill(byte[], byte);
  public static void fill(byte[], int, int, byte);
  public static void fill(boolean[], boolean);
  public static void fill(boolean[], int, int, boolean);
  public static void fill(double[], double);
  public static void fill(double[], int, int, double);
  public static void fill(float[], float);
  public static void fill(float[], int, int, float);
  public static void fill(java.lang.Object[], java.lang.Object);
  public static void fill(java.lang.Object[], int, int, java.lang.Object);
  
  //copyOf
  public static <T> T[] copyOf(T[], int);
  public static <T, U> T[] copyOf(U[], int, java.lang.Class<? extends T[]>);
  public static byte[] copyOf(byte[], int);
  public static short[] copyOf(short[], int);
  public static int[] copyOf(int[], int);
  public static long[] copyOf(long[], int);
  public static char[] copyOf(char[], int);
  public static float[] copyOf(float[], int);
  public static double[] copyOf(double[], int);
  public static boolean[] copyOf(boolean[], int);
  
  //CopyOfRange
  public static <T> T[] copyOfRange(T[], int, int);
  public static <T, U> T[] copyOfRange(U[], int, int, java.lang.Class<? extends T[]>);
  public static byte[] copyOfRange(byte[], int, int);
  public static short[] copyOfRange(short[], int, int);
  public static int[] copyOfRange(int[], int, int);
  public static long[] copyOfRange(long[], int, int);
  public static char[] copyOfRange(char[], int, int);
  public static float[] copyOfRange(float[], int, int);
  public static double[] copyOfRange(double[], int, int);
  public static boolean[] copyOfRange(boolean[], int, int);
  
  //asList
  public static <T> java.util.List<T> asList(T...);
  
  //hashCode
  public static int hashCode(long[]);
  public static int hashCode(int[]);
  public static int hashCode(short[]);
  public static int hashCode(char[]);
  public static int hashCode(byte[]);
  public static int hashCode(boolean[]);
  public static int hashCode(float[]);
  public static int hashCode(double[]);
  public static int hashCode(java.lang.Object[]);
  
  //deepHashBode ,deepEquals , deepEquals0
  public static int deepHashCode(java.lang.Object[]);
  public static boolean deepEquals(java.lang.Object[], java.lang.Object[]);
  
  static boolean deepEquals0(java.lang.Object, java.lang.Object);
  
  //toString
  public static java.lang.String toString(long[]);
  public static java.lang.String toString(int[]);
  public static java.lang.String toString(short[]);
  public static java.lang.String toString(char[]);
  public static java.lang.String toString(byte[]);
  public static java.lang.String toString(boolean[]);
  public static java.lang.String toString(float[]);
  public static java.lang.String toString(double[]);
  public static java.lang.String toString(java.lang.Object[]);
  
  //deepToString
  public static java.lang.String deepToString(java.lang.Object[]);
  
  //setall & parallelSetAll
  public static <T> void setAll(T[], java.util.function.IntFunction<? extends T>);
  public static <T> void parallelSetAll(T[], java.util.function.IntFunction<? extends T>);
  public static void setAll(int[], java.util.function.IntUnaryOperator);
  public static void parallelSetAll(int[], java.util.function.IntUnaryOperator);
  public static void setAll(long[], java.util.function.IntToLongFunction);
  public static void parallelSetAll(long[], java.util.function.IntToLongFunction);
  public static void setAll(double[], java.util.function.IntToDoubleFunction);
  public static void parallelSetAll(double[], java.util.function.IntToDoubleFunction);
  
  //Splititerator
  public static <T> java.util.Spliterator<T> spliterator(T[]);
  public static <T> java.util.Spliterator<T> spliterator(T[], int, int);
  public static java.util.Spliterator$OfInt spliterator(int[]);
  public static java.util.Spliterator$OfInt spliterator(int[], int, int);
  public static java.util.Spliterator$OfLong spliterator(long[]);
  public static java.util.Spliterator$OfLong spliterator(long[], int, int);
  public static java.util.Spliterator$OfDouble spliterator(double[]);
  public static java.util.Spliterator$OfDouble spliterator(double[], int, int);
  
  //Stream Conversion
  public static <T> java.util.stream.Stream<T> stream(T[]);
  public static <T> java.util.stream.Stream<T> stream(T[], int, int);
  public static java.util.stream.IntStream stream(int[]);
  public static java.util.stream.IntStream stream(int[], int, int);
  public static java.util.stream.LongStream stream(long[]);
  public static java.util.stream.LongStream stream(long[], int, int);
  public static java.util.stream.DoubleStream stream(double[]);
  public static java.util.stream.DoubleStream stream(double[], int, int);
  
  //Compare  & Compare Range
  public static int compare(boolean[], boolean[]);
  public static int compare(boolean[], int, int, boolean[], int, int);
  public static int compare(byte[], byte[]);
  public static int compare(byte[], int, int, byte[], int, int);
  public static int compare(short[], short[]);
  public static int compare(short[], int, int, short[], int, int);
	public static int compare(char[], char[]);
  public static int compare(char[], int, int, char[], int, int);
  public static int compare(int[], int[]);
  public static int compare(int[], int, int, int[], int, int);
  public static int compare(long[], long[]);
  public static int compare(long[], int, int, long[], int, int);
  public static int compare(float[], float[]);
  public static int compare(float[], int, int, float[], int, int);
  public static int compare(double[], double[]);
  public static int compare(double[], int, int, double[], int, int);
  

	//Compare Unsigned
	public static int compareUnsigned(byte[], byte[]);
  public static int compareUnsigned(byte[], int, int, byte[], int, int);
  public static int compareUnsigned(short[], short[]);
  public static int compareUnsigned(short[], int, int, short[], int, int);
  public static int compareUnsigned(int[], int[]);
  public static int compareUnsigned(int[], int, int, int[], int, int);
  public static int compareUnsigned(long[], long[]);
  public static int compareUnsigned(long[], int, int, long[], int, int);
  
  
  public static <T extends java.lang.Comparable<? super T>> int compare(T[], T[]);
  public static <T extends java.lang.Comparable<? super T>> int compare(T[], int, int, T[], int, int);
  public static <T> int compare(T[], T[], java.util.Comparator<? super T>);
  public static <T> int compare(T[], int, int, T[], int, int, java.util.Comparator<? super T>);
  
  //mismatched index in complete and in a specific range
  public static int mismatch(boolean[], boolean[]);
  public static int mismatch(boolean[], int, int, boolean[], int, int);
  public static int mismatch(byte[], byte[]);
  public static int mismatch(byte[], int, int, byte[], int, int);
  public static int mismatch(char[], char[]);
  public static int mismatch(char[], int, int, char[], int, int);
  public static int mismatch(short[], short[]);
  public static int mismatch(short[], int, int, short[], int, int);
  public static int mismatch(int[], int[]);
  public static int mismatch(int[], int, int, int[], int, int);
  public static int mismatch(long[], long[]);
  public static int mismatch(long[], int, int, long[], int, int);
  public static int mismatch(float[], float[]);
  public static int mismatch(float[], int, int, float[], int, int);
  public static int mismatch(double[], double[]);
  public static int mismatch(double[], int, int, double[], int, int);
  public static int mismatch(java.lang.Object[], java.lang.Object[]);
  public static int mismatch(java.lang.Object[], int, int, java.lang.Object[], int, int);
  
  
  public static <T> int mismatch(T[], T[], java.util.Comparator<? super T>);
  public static <T> int mismatch(T[], int, int, T[], int, int, java.util.Comparator<? super T>);
  
  static {};
}

```



## Collections Class

### Structure 
``` java


```