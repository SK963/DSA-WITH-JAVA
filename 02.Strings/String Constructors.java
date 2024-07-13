import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws Exception {

		//direct way 
		String str = "Hello World";
		System.out.println("direct way : " + str);
		
        // String()
        String str1 = new String();
        System.out.println("String(): " + str1); 
		// Output: ""

		// String(String original)
        String original = "Hello";
        String str10 = new String(original);
        System.out.println("String(String original): " + str10); 
		// Output: "Hello"

        // String(StringBuffer buffer)
        StringBuffer buffer = new StringBuffer("Hello");
        String str11 = new String(buffer);
        System.out.println("String(StringBuffer buffer): " + str11); 
		// Output: "Hello"

        // String(StringBuilder builder)
        StringBuilder builder = new StringBuilder("Hello");
        String str12 = new String(builder);
        System.out.println("String(StringBuilder builder): " + str12); 
		// Output: "Hello"
		

        

        // String(char[] value)
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str7 = new String(charArray);
        System.out.println("String(char[] value): " + str7); 
		// Output: "Hello"

        // String(char[] value, int offset, int count)
        char[] charArray2 = {'H', 'e', 'l', 'l', 'o'};
        String str8 = new String(charArray2, 1, 3);
        System.out.println("String(char[] value, int offset, int count): " + str8); 
		// Output: "ell"


		// String(byte[] bytes)
        byte[] byteArray = {65, 66, 67};
        String str2 = new String(byteArray);
        System.out.println("String(byte[] bytes): " + str2); 
		// Output: "ABC"

        // String(byte[] bytes, Charset charset)
        byte[] byteArrayUTF8 = {97, 98, 99};
        Charset charset = StandardCharsets.UTF_8;
        String str3 = new String(byteArrayUTF8, charset);
        System.out.println("String(byte[] bytes, Charset charset): " + str3); 
		// Output: "abc"

        // String(byte[] bytes, int offset, int length)
        byte[] byteArray2 = {65, 66, 67, 68, 69};
        String str4 = new String(byteArray2, 1, 3);
        System.out.println("String(byte[] bytes, int offset, int length): " + str4); // Output: "BCD"

        // String(byte[] bytes, int offset, int length, Charset charset)
        byte[] byteArrayUTF8_2 = {97, 98, 99, 100, 101};
        Charset charsetUTF8 = StandardCharsets.UTF_8;
        String str5 = new String(byteArrayUTF8_2, 1, 3, charsetUTF8);
        System.out.println("String(byte[] bytes, int offset, int length, Charset charset): " + str5); 
		// Output: "bcd"

        // String(byte[] bytes, int offset, int length, String charsetName)
        byte[] byteArrayUTF8_3 = {97, 98, 99, 100, 101};
        String charsetName = "UTF-8";
        String str6 = new String(byteArrayUTF8_3, 1, 3, charsetName);
        System.out.println("String(byte[] bytes, int offset, int length, String charsetName): " + str6); 
		// Output: "bcd"

        // String(int[] codePoints, int offset, int count)
        int[] codePoints = {65, 66, 67, 68, 69};
        String str9 = new String(codePoints, 1, 3);
        System.out.println("String(int[] codePoints, int offset, int count): " + str9); 
		// Output: "BCD"

        
    }
}
