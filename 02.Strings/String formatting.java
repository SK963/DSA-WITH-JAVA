import java.util.Date;

public class Main {
    public static void main(String[] args) {

		System.out.println("Basic format specifiers :");
		
		System.out.println(String.format("Name: %s, Age: %d", "John", 30));
		System.out.println(String.format("Price: %.2f", 19.99));
		System.out.println(String.format("%10s", "Hello"));
		System.out.println(String.format("First letter: %c", 'A'));
		System.out.println(String.format("Is it true? %b", true));
		System.out.println(String.format("Hexadecimal: %x", 255));
		System.out.println(String.format("Hexadecimal: %X", 255));
		System.out.println(String.format("Octal: %o", 255));
		System.out.println(String.format("Scientific: %e", 12345.67));
		System.out.println(String.format("Scientific: %E", 12345.67));
		System.out.println(String.format("General: %g", 12345.67));
		System.out.println(String.format("General: %G", 12345.67));
		System.out.println(String.format("Hex float: %a", 0.1));
		System.out.println(String.format("Hex float: %A", 0.1));
		System.out.println(String.format("First line%nSecond line"));
		System.out.println(String.format("Discount: 20%%"));

		

		//Date time formatting 
		System.out.println("Date time formatting: ");
		
		System.out.println(String.format("Today is %tF", new Date()));
		System.out.println(String.format("Time: %tT", new Date()));
		System.out.println(String.format("Time: %tR", new Date()));
		System.out.println(String.format("Time: %tr", new Date()));
		System.out.println(String.format("ISO Date: %tF", new Date()));
		System.out.println(String.format("US Date: %tD", new Date()));
		System.out.println(String.format("Locale Date: %tc", new Date()));
		
		
		
        //Decimal Formatting
		System.out.println("Number Formatting: ");


		// Flags and Width
		System.out.println(String.format("%10.2f", 123.4567));
		// Right-aligned, minimum width of 10 characters, 2 decimal places
		System.out.println(String.format("%-10s", "Hello"));
		// Left-aligned, minimum width of 10 characters
		
		// Precision
		System.out.println(String.format("%.3f", 123.4567));
		// 3 decimal places
		
		// Flags, Width, and Precision
		System.out.println(String.format("%+010.2f", 123.4567));
		// Prepend '+' sign, pad with leading zeros, 2 decimal places
		
		// Alignment
		System.out.println(String.format("%10d", 123));
		// Right-aligned within 10 characters
		System.out.println(String.format("%-10d", 123));
		// Left-aligned within 10 characters

    }
}


//output :
// Basic format specifiers :
// Name: John, Age: 30
// Price: 19.99
//      Hello
// First letter: A
// Is it true? true
// Hexadecimal: ff
// Hexadecimal: FF
// Octal: 377
// Scientific: 1.234567e+04
// Scientific: 1.234567E+04
// General: 12345.7
// General: 12345.7
// Hex float: 0x1.999999999999ap-4
// Hex float: 0X1.999999999999AP-4
// First line
// Second line
// Discount: 20%
// Date time formatting: 
// Today is 2024-05-03
// Time: 13:45:51
// Time: 13:45
// Time: 01:45:51 PM
// ISO Date: 2024-05-03
// US Date: 05/03/24
// Locale Date: Fri May 03 13:45:51 GMT 2024
// Number Formatting: 
//     123.46
// Hello     
// 123.457
// +000123.46
//        123
// 123       
