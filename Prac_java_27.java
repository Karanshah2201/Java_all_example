import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Prac_java_27 {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
             // The word to search for
        String word = "string";
        // The file to search in
        File file = new File("xanadu.txt");
        // A flag to indicate if the word is found or not
        boolean found = false;
        // A scanner to read the file
        Scanner scanner = null;
        try {
            // Initialize the scanner with the file
            scanner = new Scanner(file);
            // Loop through each line of the file
            while (scanner.hasNextLine()) {
                // Get the next line
                String line = scanner.nextLine();
                // Check if the line contains the word
                if (line.indexOf(word) != -1) {
                    // If yes, set the flag to true and break the loop
                    found = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            e.printStackTrace();
        } finally {
            // Close the scanner if it is not null
            if (scanner != null) {
                scanner.close();
            }
        }
        // Print the result
        if (found) {
            System.out.println("The word \"" + word + "\" was found in the file.");
        } else {
            System.out.println("The word \"" + word + "\" was not found in the file.");
        }
  }
    }
