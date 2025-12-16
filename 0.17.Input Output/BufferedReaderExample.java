import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException
	{
		 	FileReader fr = new FileReader("file handling/input.txt");

            // Create a BufferedReader object to buffer the FileReader
            BufferedReader br = new BufferedReader(fr);

            // Read a single character from the reader
            int charCode = br.read();
            System.out.println("Read character: " + (char) charCode);

            // Read characters into an array
            char[] buffer = new char[9];
            int bytesRead = br.read(buffer);
            System.out.println("Read " + bytesRead + " characters into buffer: " + new String(buffer));

            // Read characters into a portion of an array
            char[] partialBuffer = new char[5];
            int partialBytesRead = br.read(partialBuffer, 0, 3);
            System.out.println("Read " + partialBytesRead + " characters into partial buffer: " + new String(partialBuffer, 0, partialBytesRead));

            // Read a line of text from the reader
            String line = br.readLine();
            
			while(line != null){
				System.out.println("Read line: " + line);
				line = br.readLine();
			}

            // Close the BufferedReader object
            br.close();

            // Display a message indicating successful reading
            System.out.println("Data has been read from the file.");
		

	}   
}


//input :
// Append to the end of the file.HelloHello
// this is second line
// this is third line 
// this is fourth line

//output : 

// Read character: A
// Read 9 characters into buffer: ppend to 
// Read 3 characters into partial buffer: the
// Read line:  end of the file.HelloHello
// Read line: this is second line
// Read line: this is third line 
// Read line: this is fourth line
// Data has been read from the file.


