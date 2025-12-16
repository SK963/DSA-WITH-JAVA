import java.io.*;

public class FileReaderExample {
	public static void main(String args[]) throws IOException{
		
		File file = new File("file handling/input.txt");
		FileReader fr = new FileReader(file);
		int i = fr.read();
		int fl = (int)file.length();
		
		//iterating
		while(i != -1){
			System.out.print((char)i);
			i = fr.read();
		}

		fr.close();
		
		FileReader fr2 = new FileReader("file handling/input.txt");
		char ch[] = new char[fl];
		fr2.read(ch);

		for(char data : ch){
			System.out.print(data);
		}
		
		fr2.close();
		
	}   
}


// OUTPUT
// Java
// A
// a
// javaJava
// A
// a
// java
