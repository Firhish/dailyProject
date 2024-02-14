package lessons.lesson6.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords extends ReadFileHandler {

    public CountWords(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    // Method to display word count
    public void countWords() {
        try (BufferedReader br = new BufferedReader(new FileReader(super.getFilePath()))) {
            String line;
            int wordCount = 0;

            while ((line = br.readLine()) != null) {
                // Split the line into words using space as the delimiter
                // ("\\s+"), which represents one or more whitespace characters
                // \\s: This is a regular expression pattern that matches any whitespace character
                // +: This is a quantifier in the regular expression, indicating that the preceding pattern (\\s) should match one or more times.
                String[] words = line.split("\\s+");

                // Increment the word count by the number of words in the current line
                wordCount += words.length;
            }
            System.out.println("Total word count: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}