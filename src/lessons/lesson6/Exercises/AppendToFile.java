package lessons.lesson6.Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile extends ReadFileHandler {
    public AppendToFile(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    public void appendToFile(Scanner sc) throws IOException {
                       
        System.out.print("Enter content to Append: ");            
        String content = sc.nextLine();

        // The 'true' parameter in the FileWriter constructor enables append mode
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(super.getFilePath(),true))) {
            writer.write(content);
            writer.newLine();
        }
        System.out.println("Content appended successfully!");
    }

}
