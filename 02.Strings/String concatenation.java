import java.io.*;

public class Main{
    public static void main(String[] args) {
    
        String s1 = "Hello ";
		String s2 = "World !";

		//using + operator
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);

		//or 
		s1 = s1.concat(s2);
		System.out.println(s1);
        
    }
}


// output
// Hello World !
// Hello World !
// Hello World !
