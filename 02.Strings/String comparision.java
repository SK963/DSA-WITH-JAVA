import java.io.*;

public class Main{
    public static void main(String[] args) {

		String s1 ="Hello world";
		String s3 = "Hello world";
		String s2 = new String("Hello world");

		// comparision using == operataor 
		if(s1 == s3){
			System.out.println("s1 and s3 have same reference");
		}

		if(s1.equals(s3)){
			System.out.println("s1 and s3 have same content");
		}


		if(s1 == s2)
		{
			System.out.println("s1 and s2 have same reference");
		}
		else{
			System.out.println("s1 and s2 have different reference");
		}

		if(s1.equals(s2)){
			System.out.println("s1 and s2 have same content");
		}
		else{
			System.out.println("s1 and s2 have different content");
		}
        
    }
}


// loutput
// s1 and s3 have same reference
// s1 and s3 have same content
// s1 and s2 have different reference
// s1 and s2 have same content 