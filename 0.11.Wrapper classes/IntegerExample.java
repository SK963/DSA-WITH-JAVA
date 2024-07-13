public class IntegerExample
{
    public static void main(String[] args) 
	{
        // Static Constants
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        // Parsing Strings
        int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed int: " + parsedInt);

        // ValueOf methods
        Integer intValue1 = Integer.valueOf(123);
        Integer intValue2 = Integer.valueOf("456");
        System.out.println("Integer valueOf(int): " + intValue1);
        System.out.println("Integer valueOf(String): " + intValue2);

        // toString methods
        String intToString = Integer.toString(789);
        String binaryString = Integer.toBinaryString(789);
        String hexString = Integer.toHexString(789);
        String octalString = Integer.toOctalString(789);
        System.out.println("Integer.toString(int): " + intToString);
        System.out.println("Integer.toBinaryString(int): " + binaryString);
        System.out.println("Integer.toHexString(int): " + hexString);
        System.out.println("Integer.toOctalString(int): " + octalString);

        // compare and compareUnsigned
        int compareResult = Integer.compare(100, 200);
        int compareUnsignedResult = Integer.compareUnsigned(-1, 1);
        System.out.println("Integer.compare(100, 200): " + compareResult);
        System.out.println("Integer.compareUnsigned(-1, 1): " + compareUnsignedResult);

        // Number of bits and bit manipulation
        int highestOneBit = Integer.highestOneBit(789);
        int lowestOneBit = Integer.lowestOneBit(789);
        int bitCount = Integer.bitCount(789);
        System.out.println("Integer.highestOneBit(789): " + highestOneBit);
        System.out.println("Integer.lowestOneBit(789): " + lowestOneBit);
        System.out.println("Integer.bitCount(789): " + bitCount);

        // Rotate bits
        int rotatedLeft = Integer.rotateLeft(789, 2);
        int rotatedRight = Integer.rotateRight(789, 2);
        System.out.println("Integer.rotateLeft(789, 2): " + rotatedLeft);
        System.out.println("Integer.rotateRight(789, 2): " + rotatedRight);

        // Reverse bits and bytes
        int reversedBits = Integer.reverse(789);
        int reversedBytes = Integer.reverseBytes(789);
        System.out.println("Integer.reverse(789): " + reversedBits);
        System.out.println("Integer.reverseBytes(789): " + reversedBytes);

        // Arithmetic operations
        int sum = Integer.sum(10, 20);
        int max = Integer.max(10, 20);
        int min = Integer.min(10, 20);
        System.out.println("Integer.sum(10, 20): " + sum);
        System.out.println("Integer.max(10, 20): " + max);
        System.out.println("Integer.min(10, 20): " + min);

        // Instance methods
        Integer intInstance = Integer.valueOf(123);
        int intValue = intInstance.intValue();
        byte byteValue = intInstance.byteValue();
        short shortValue = intInstance.shortValue();
        long longValue = intInstance.longValue();
        float floatValue = intInstance.floatValue();
        double doubleValue = intInstance.doubleValue();
        System.out.println("intValue: " + intValue);
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        // equals and hashCode methods
        Integer anotherIntInstance = Integer.valueOf(123);
        boolean isEqual = intInstance.equals(anotherIntInstance);
        int hashCode = intInstance.hashCode();
        System.out.println("equals: " + isEqual);
        System.out.println("hashCode: " + hashCode);

        // Decode string to Integer
        Integer decodedInt = Integer.decode("0x7B");
        System.out.println("Integer.decode(\"0x7B\"): " + decodedInt);

        // Get Integer instance from system properties
        System.setProperty("myIntProperty", "123");
        Integer systemInt = Integer.getInteger("myIntProperty");
        System.out.println("Integer.getInteger(\"myIntProperty\"): " + systemInt);

        // Number of leading and trailing zeros
        int leadingZeros = Integer.numberOfLeadingZeros(789);
        int trailingZeros = Integer.numberOfTrailingZeros(789);
        System.out.println("Integer.numberOfLeadingZeros(789): " + leadingZeros);
        System.out.println("Integer.numberOfTrailingZeros(789): " + trailingZeros);

        // Signum
        int signum = Integer.signum(-123);
        System.out.println("Integer.signum(-123): " + signum);
    }
}


/*
Integer.MIN_VALUE: -2147483648
Integer.MAX_VALUE: 2147483647
Parsed int: 123
Integer valueOf(int): 123
Integer valueOf(String): 456
Integer.toString(int): 789
Integer.toBinaryString(int): 1100010101
Integer.toHexString(int): 315
Integer.toOctalString(int): 1425
Integer.compare(100, 200): -1
Integer.compareUnsigned(-1, 1): 1
Integer.highestOneBit(789): 512
Integer.lowestOneBit(789): 1
Integer.bitCount(789): 5
Integer.rotateLeft(789, 2): 3156
Integer.rotateRight(789, 2): 1073742021
Integer.reverse(789): -1463812096
Integer.reverseBytes(789): 352518144
Integer.sum(10, 20): 30
Integer.max(10, 20): 20
Integer.min(10, 20): 10
intValue: 123
byteValue: 123
shortValue: 123
longValue: 123
floatValue: 123.0
doubleValue: 123.0
equals: true
hashCode: 123
Integer.decode("0x7B"): 123
Integer.getInteger("myIntProperty"): 123
Integer.numberOfLeadingZeros(789): 22
Integer.numberOfTrailingZeros(789): 0
Integer.signum(-123): -1
*/