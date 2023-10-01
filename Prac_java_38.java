import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Prac_java_38{
    public static void main(String[] args) {
        // Create a HashSet to store Java keywords
        HashSet<String> keywordSet = new HashSet<>();
        // Add Java keywords to the set (you can add more if needed)
        keywordSet.add("void");
        keywordSet.add("System");
        keywordSet.add("boolean");
        keywordSet.add("break");
        keywordSet.add("out");
        keywordSet.add("case");
        // ... Add all Java keywords

        // Initialize the keyword count
        int keywordCount = 0;

        // Provide the path to your Java source file
        String filePath = "Prac_java_37.java";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    if (keywordSet.contains(word)) {
                        keywordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of keywords in the file: " + keywordCount);
    }
}
