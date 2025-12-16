import java.util.Arrays;

public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'a';
        char chUpper = 'A';
        char digit = '5';
        int codePoint = 0x1F600; // Unicode code point for 😀
        
        // Checking character types
        System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch)); // true
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(chUpper)); // true
        System.out.println("isDigit('5'): " + Character.isDigit(digit)); // true
        System.out.println("isLetter('a'): " + Character.isLetter(ch)); // true
        System.out.println("isLetterOrDigit('5'): " + Character.isLetterOrDigit(digit)); // true
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(' ')); // true
        System.out.println("isAlphabetic('a'): " + Character.isAlphabetic(ch)); // true
        System.out.println("isISOControl('\\u001F'): " + Character.isISOControl('\u001F')); // true
        
        // Converting character cases
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(chUpper)); // 'a'
        System.out.println("toUpperCase('a'): " + Character.toUpperCase(ch)); // 'A'
        
        // Numeric value
        System.out.println("getNumericValue('5'): " + Character.getNumericValue(digit)); // 5
        
        // Checking Unicode properties
        System.out.println("isBmpCodePoint(0x1F600): " + Character.isBmpCodePoint(codePoint)); // false
        System.out.println("isSupplementaryCodePoint(0x1F600): " + Character.isSupplementaryCodePoint(codePoint)); // true
        System.out.println("isSurrogatePair('\\uD83D', '\\uDE00'): " + Character.isSurrogatePair('\uD83D', '\uDE00')); // true
        System.out.println("charCount(0x1F600): " + Character.charCount(codePoint)); // 2

        // Handling code points
        System.out.println("toChars(0x1F600): " + Arrays.toString(Character.toChars(codePoint))); // [55357, 56832]
        System.out.println("codePointAt(\"😀\", 0): " + Character.codePointAt("😀", 0)); // 128512
        
        // Directionality
        System.out.println("getDirectionality('a'): " + Character.getDirectionality(ch)); // 0 (DIRECTIONALITY_LEFT_TO_RIGHT)
        System.out.println("isMirrored('('): " + Character.isMirrored('(')); // false

        // Other methods
        System.out.println("compare('a', 'b'): " + Character.compare('a', 'b')); // -1
        System.out.println("reverseBytes('a'): " + Character.reverseBytes('a')); // '\u6100'
        System.out.println("forDigit(5, 10): " + Character.forDigit(5, 10)); // '5'
    }
}
/* Output
isLowerCase('a'): true
isUpperCase('A'): true
isDigit('5'): true
isLetter('a'): true
isLetterOrDigit('5'): true
isWhitespace(' '): true
isAlphabetic('a'): true
isISOControl('\u001F'): true
toLowerCase('A'): a
toUpperCase('a'): A
getNumericValue('5'): 5
isBmpCodePoint(0x1F600): false
isSupplementaryCodePoint(0x1F600): true
isSurrogatePair('\uD83D', '\uDE00'): true
charCount(0x1F600): 2
toChars(0x1F600): [?, ?]
codePointAt("😀", 0): 128512
getDirectionality('a'): 0
isMirrored('('): true
compare('a', 'b'): -1
reverseBytes('a'): 愀
forDigit(5, 10): 5
*/