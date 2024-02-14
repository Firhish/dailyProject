package lessons.lesson6.Exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles extends ReadFileHandler {

    private String destinationFilePath;

    public CopyFiles(String filePath, String destinationFilePath) {
        super(filePath);
        this.destinationFilePath = destinationFilePath;
    }

    public void copyFileContent() throws FileNotFoundException, IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilePath()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(this.destinationFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
        System.out.println("Content copied successfully!");

    }
    
}
