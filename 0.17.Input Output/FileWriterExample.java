import java.io.*;

public class FileWriterExample {
	public static void main(String args[]) throws IOException{
		
		File file = new File("file handling" , "input.txt");

		file.createNewFile();
		FileWriter fw = new FileWriter(file);

		fw.write("Java\n");
		
		fw.write(65);
		fw.write("\n");
		fw.write(97);
		fw.write("\n");
		char ch[] = {'j' , 'a' , 'v' , 'a'  , '\n'};
		fw.write(ch);

		fw.close();
		System.out.println();

	
		FileWriter aw = new FileWriter("file handling/input.txt", true);

		// Write another string to the file
		aw.write("This line should append to the end of the file.\n");

		// Flush and close the FileWriter object
		aw.flush();
		aw.close();
		
	}   
}
