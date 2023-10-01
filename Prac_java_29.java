import java.io.*;
public class Prac_java_29 {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read console input.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Create a BufferedWriter to write to a file.
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        // Write a prompt to the console.
        System.out.println("Enter some text: ");

        // Read a line of text from the console.
        String line = reader.readLine();

        // Write the line of text to the file.
        writer.write(line);

        // Close the reader and writer.
        reader.close();
        writer.close();

        // Create a FileInputStream to read the file.
        FileInputStream inputStream = new FileInputStream("OUTPUT.txt");

        // Create a FileOutputStream to write the contents of the file to the console.
        FileOutputStream outputStream = new FileOutputStream(FileDescriptor.out);

        // Create a buffer to store the data being read from the file.
        byte[] buffer = new byte[1024];

        // Read from the file and write to the console until the end of the file is reached.
        while ((inputStream.read(buffer)) != -1) {
            outputStream.write(buffer);
        }

        // Close the input and output streams.
        inputStream.close();
        outputStream.close();
    }
}
