import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Main 
{
    public static void main(String[] args) {
		
        // Creating a string
        String str = "Hello World";

		//Important methods 

        // charAt
        char c = str.charAt(1);
        System.out.println("charAt(1): " + c);

		// substring
        String substring = str.substring(3);
        System.out.println("substring(3): " + substring);

        // substring with endIndex
        String substringWithEndIndex = str.substring(3, 7);
        System.out.println("substring(3, 7): " + substringWithEndIndex);

        // toCharArray
        char[] charArray1 = str.toCharArray();
        System.out.println("toCharArray: " + Arrays.toString(charArray1));

        // toLowerCase
        String lowerCase = str.toLowerCase();
        System.out.println("toLowerCase: " + lowerCase);

        // toUpperCase
        String upperCase = str.toUpperCase();
        System.out.println("toUpperCase: " + upperCase);

        // trim
        String trimmed = "   Hello   ".trim();
        System.out.println("trim: " + trimmed);

		// length
        int length = str.length();
        System.out.println("length: " + length);


		// isEmpty
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

		// replace
        String replaced = str.replace('o', 'a');
        System.out.println("replace('o', 'a'): " + replaced);

        // replaceAll
        String replacedAll = str.replaceAll("World", "Universe");
        System.out.println("replaceAll(\"World\", \"Universe\"): " + replacedAll);

        // replaceFirst
        String replaceFirst = str.replaceFirst("o", "a");
        System.out.println("replaceFirst(\"o\", \"a\"): " + replaceFirst);

        // split
        String[] split = str.split(" ");
        System.out.println("split(\" \"): " + Arrays.toString(split));

        // startsWith
        boolean startsWith = str.startsWith("Hello");
        System.out.println("startsWith(\"Hello\"): " + startsWith);

        // startsWith with offset
        boolean startsWithOffset = str.startsWith("World", 6);
        System.out.println("startsWith(\"World\", 6): " + startsWithOffset);

        // subSequence
        CharSequence subSequence = str.subSequence(1, 5);
        System.out.println("subSequence(1, 5): " + subSequence);

		// compareTo
        String str2 = "Hello World";
        int result = str.compareTo(str2);
        System.out.println("compareTo: " + result);

        // compareToIgnoreCase
        int resultIgnoreCase = str.compareToIgnoreCase("HELLO WORLD");
        System.out.println("compareToIgnoreCase: " + resultIgnoreCase);

        // concat
        String concat = str.concat("!");
        System.out.println("concat: " + concat);

        // contains
        boolean contains = str.contains("World");
        System.out.println("contains(\"World\"): " + contains);

        // contentEquals
        boolean contentEquals = str.contentEquals(new StringBuffer("Hello World"));
        System.out.println("contentEquals(StringBuffer): " + contentEquals);

        // copyValueOf
        char[] charArray = {'H', 'i'};
        String copyValueOf = String.copyValueOf(charArray);
        System.out.println("copyValueOf: " + copyValueOf);

        // endsWith
        boolean endsWith = str.endsWith("World");
        System.out.println("endsWith(\"World\"): " + endsWith);

        // equals
        boolean equals = str.equals("Hello World");
        System.out.println("equals(\"Hello World\"): " + equals);

        // equalsIgnoreCase
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world");
        System.out.println("equalsIgnoreCase(\"hello world\"): " + equalsIgnoreCase);
  
        // format
        String formattedString = String.format(Locale.US, "%s, %d", "Hello", 2023);
        System.out.println("format(Locale.US, \"%s, %d\", \"Hello\", 2023): " + formattedString);

        // indexOf
        int indexOf = str.indexOf('o');
        System.out.println("indexOf('o'): " + indexOf);

        // indexOf with fromIndex
        int indexOfFromIndex = str.indexOf('o', 5);
        System.out.println("indexOf('o', 5): " + indexOfFromIndex);

        // indexOf with substring
        int indexOfSubstring = str.indexOf("World");
        System.out.println("indexOf(\"World\"): " + indexOfSubstring);

        // indexOf with substring and fromIndex
        int indexOfSubstringFromIndex = str.indexOf("World", 7);
        System.out.println("indexOf(\"World\", 7): " + indexOfSubstringFromIndex);


		// lastIndexOf
        int lastIndexOf = str.lastIndexOf('o');
        System.out.println("lastIndexOf('o'): " + lastIndexOf);

        // lastIndexOf with fromIndex
        int lastIndexOfFromIndex = str.lastIndexOf('o', 5);
        System.out.println("lastIndexOf('o', 5): " + lastIndexOfFromIndex);

        // lastIndexOf with substring
        int lastIndexOfSubstring = str.lastIndexOf("World");
        System.out.println("lastIndexOf(\"World\"): " + lastIndexOfSubstring);

        // lastIndexOf with substring and fromIndex
        int lastIndexOfSubstringFromIndex = str.lastIndexOf("World", 6);
        System.out.println("lastIndexOf(\"World\", 6): " + lastIndexOfSubstringFromIndex);

        

        // matches
        boolean matches = str.matches(".*");
        System.out.println("matches(\".*\"): " + matches);


		//Value of Mehtods 

        // valueOf
        String valueOfBoolean = String.valueOf(true);
        System.out.println("valueOf(true): " + valueOfBoolean);

        String valueOfChar = String.valueOf('H');
        System.out.println("valueOf('H'): " + valueOfChar);

        String valueOfCharArray = String.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}): " + valueOfCharArray);

        String valueOfCharArrayOffsetCount = String.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 2);
        System.out.println("valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 2): " + valueOfCharArrayOffsetCount);

        String valueOfDouble = String.valueOf(3.14);
        System.out.println("valueOf(3.14): " + valueOfDouble);

        String valueOfFloat = String.valueOf(3.14f);
        System.out.println("valueOf(3.14f): " + valueOfFloat);

        String valueOfInt = String.valueOf(42);
        System.out.println("valueOf(42): " + valueOfInt);

        String valueOfLong = String.valueOf(123456789);
        System.out.println("valueOf(123456789): " + valueOfLong);

        String valueOfObject = String.valueOf(new Object());
        System.out.println("valueOf(Object): " + valueOfObject);




		
		//other methods in String class



        // codePointAt
        int code = str.codePointAt(1);
        System.out.println("codePointAt(1): " + code);

        // codePointBefore
        int codeBefore = str.codePointBefore(2);
        System.out.println("codePointBefore(2): " + codeBefore);

        // codePointCount
        int count = str.codePointCount(0, 5);
        System.out.println("codePointCount(0, 5): " + count);

        
        // getBytes
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes: " + Arrays.toString(bytes));

        // getChars
        char[] destination = new char[5];
        str.getChars(0, 5, destination, 0);
        System.out.println("getChars(0, 5): " + Arrays.toString(destination));

        // hashCode
        int hashCode = str.hashCode();
        System.out.println("hashCode: " + hashCode);

        

        // intern
        String internedString = str.intern();
        System.out.println("intern: " + internedString);

        

        // String.join
        String joinedString = String.join("-", "Hello", "World");
        System.out.println("join(\"-\", \"Hello\", \"World\"): " + joinedString);

        
        // offsetByCodePoints
        int offsetByCodePoints = str.offsetByCodePoints(0, 2);
        System.out.println("offsetByCodePoints(0, 2): " + offsetByCodePoints);

        // regionMatches
        boolean regionMatches = str.regionMatches(true, 0, "HELLO", 0, 5);
        System.out.println("regionMatches(true, 0, \"HELLO\", 0, 5): " + regionMatches);

        
		
    }
}

// output

// charAt(1): e
// substring(3): lo World
// substring(3, 7): lo W
// toCharArray: [H, e, l, l, o,  , W, o, r, l, d]
// toLowerCase: hello world
// toUpperCase: HELLO WORLD
// trim: Hello
// length: 11
// isEmpty: false
// replace('o', 'a'): Hella Warld
// replaceAll("World", "Universe"): Hello Universe
// replaceFirst("o", "a"): Hella World
// split(" "): [Hello, World]
// startsWith("Hello"): true
// startsWith("World", 6): true
// subSequence(1, 5): ello
// compareTo: 0
// compareToIgnoreCase: 0
// concat: Hello World!
// contains("World"): true
// contentEquals(StringBuffer): true
// copyValueOf: Hi
// endsWith("World"): true
// equals("Hello World"): true
// equalsIgnoreCase("hello world"): true
// format(Locale.US, "%s, %d", "Hello", 2023): Hello, 2023
// indexOf('o'): 4
// indexOf('o', 5): 7
// indexOf("World"): 6
// indexOf("World", 7): -1
// lastIndexOf('o'): 7
// lastIndexOf('o', 5): 4
// lastIndexOf("World"): 6
// lastIndexOf("World", 6): 6
// matches(".*"): true
// valueOf(true): true
// valueOf('H'): H
// valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}): Hello
// valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 2): He
// valueOf(3.14): 3.14
// valueOf(3.14f): 3.14
// valueOf(42): 42
// valueOf(123456789): 123456789
// valueOf(Object): java.lang.Object@4617c264
// codePointAt(1): 101
// codePointBefore(2): 101
// codePointCount(0, 5): 5
// getBytes: [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100]
// getChars(0, 5): [H, e, l, l, o]
// hashCode: -862545276
// intern: Hello World
// join("-", "Hello", "World"): Hello-World
// offsetByCodePoints(0, 2): 2
// regionMatches(true, 0, "HELLO", 0, 5): true
