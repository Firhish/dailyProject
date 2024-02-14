package lessons.lesson6.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryption extends ReadFileHandler {


    public FileDecryption(String filePath) {
        super(filePath);
    }

    public void decryptFileContent(int key) throws FileNotFoundException, IOException{
        StringBuilder decryptedContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilePath()))) {
            int c;
            while ((c = reader.read()) != -1) {
                // Shift characters back by the decryption key
                char decryptedChar = (char) (c - key);

                // Append the decrypted character to the StringBuilder
                decryptedContent.append(decryptedChar);
            }
        }

        System.out.println(decryptedContent.toString());
    }
    
}
