package lessons.lesson6.Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile extends ReadFileHandler {

    public WriteToFile(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    public void writeToFile(Scanner sc) throws IOException{
                  
        System.out.print("Enter content to write: ");       
        String content = sc.nextLine();              

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(super.getFilePath()))){
            writer.write(content);
        }
        System.out.println("Content written successfully!");
    }
}
