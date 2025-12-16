import java.io.*;


public class Main{
	
	public static void main(String[] args) throws IOException{
		//creating a  pointer to dir1 directory
		File dir1 = new File("Date and Time");
		System.out.println(dir1.exists());

		// getting the information of files in dir1
	
		String files[] = dir1.list();
		for(String name : files)
			System.out.println(name);

		
		System.out.println(files.length);
	}
}