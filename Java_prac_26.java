import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java_prac_26 {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java CharacterCounter <character> <filename>");
            System.exit(1);
        }

        char character = args[0].charAt(0);
        String filename = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int count = 0;
            while (reader.readLine() != null) {
                for (char c : reader.readLine().toCharArray()) {
                    if (c == character) {
                        count++;
                    }
                }
            }
            System.out.println("The character '" + character + "' appears " + count + " times in the file " + filename + ".");
        } catch (IOException e) {
            System.err.println("Error reading file " + filename + ": " + e.getMessage());
        }
    }
}