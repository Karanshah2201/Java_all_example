import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Prac_java_28 {

    public static void main(String[] args) throws IOException {
        // Get the source and destination file paths from the command line.
        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        // Create a FileInputStream object to read from the source file.
        FileInputStream inputStream = new FileInputStream(sourceFilePath);

        // Create a FileOutputStream object to write to the destination file.
        FileOutputStream outputStream = new FileOutputStream(destinationFilePath);

        // Create a buffer to store the data being copied.
        byte[] buffer = new byte[1024];

        // Read from the source file and write to the destination file until the end of the file is reached.
        while ((inputStream.read(buffer)) != -1) {
            outputStream.write(buffer);
        }

        // Close the input and output streams.
        inputStream.close();
        outputStream.close();

        // If the destination file did not exist, it will have been created automatically.
    }
}