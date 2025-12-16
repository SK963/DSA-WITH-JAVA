import java.io.*;


public class DirectoryAndFileCreationExample{
	
	public static void main(String[] args) throws IOException{

		//creating a pointer to a  file o1.txt
		File file1 = new File("01.txt");
		System.out.println(file1.exists());

		//creating a file
		file1.createNewFile();
		System.out.println(file1.exists());

		//creating a  pointer to dir1 directory
		File dir1 = new File("dir1");
		System.out.println(dir1.exists());
		//creating a directory
		dir1.mkdir();
		System.out.println(dir1.exists());
	}
}