import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) 
	{
        try {
            // Create a FileWriter object to write to a file named "example.txt"
            FileWriter fileWriter = new FileWriter("file handling/input.txt");

            // Create a BufferedWriter object to buffer the FileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Write a single character to the writer
            writer.write('A');

            // Write a string to the writer
            writer.write("ppend to the end of the file.");

            // Write an array of characters to the writer
            char[] buffer = {'H', 'e', 'l', 'l', 'o'};
            writer.write(buffer);

            // Write a portion of a string to the writer
            String str = "Hello, world!";
            writer.write(str, 0, 5); // Write "Hello"

            // Write a line separator to the writer
            writer.newLine();

            // Flush the writer to force any buffered output to be written to the file
            writer.flush();

            // Close the BufferedWriter object
            writer.close();

            // Display a message indicating successful writing
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


//output : 
// Append to the end of the file.HelloHello
