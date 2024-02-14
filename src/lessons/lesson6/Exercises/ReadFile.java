package lessons.lesson6.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends ReadFileHandler {

    public ReadFile(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    // Method to display the txt file content
    public void displayFileContent(){
        try (BufferedReader br = new BufferedReader(new FileReader(super.getFilePath()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Current content: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}