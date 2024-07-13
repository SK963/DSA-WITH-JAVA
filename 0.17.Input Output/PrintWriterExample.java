import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            // Create a PrintWriter object to write to a file named "example.txt"
            PrintWriter writer = new PrintWriter("file handling/input.txt");

            // Write various data types to the file
            writer.println("Hello, world!"); //string
            writer.println(42); //int
            writer.println(3.14); //double
            writer.println(true); //boolean
			writer.println('S'); //char

            // Format and write a string to the file
            writer.printf("The value of %s is %d%n", "x", 10);

            
            // Flush the writer to force any buffered output to be written to the file
            writer.flush();

            // Close the PrintWriter object
            writer.close();

            // Display a message indicating successful writing
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



//output
// Hello, world!
// 42
// 3.14
// true
// S
// The value of x is 10
