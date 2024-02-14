package lessons.lesson6.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "source.txt";
        Scanner sc = new Scanner(System.in);
        
        // Instantiate each classes
        // ReadFile readFile = new ReadFile(filePath);
        // CountWords countWords = new CountWords(filePath);
        // WriteToFile writeToFile = new WriteToFile(filePath);
        // AppendToFile appendToFile = new AppendToFile(filePath);
        // CopyFiles copyFiles = new CopyFiles(filePath, "destination.txt");
        // SearchWordInFile searchWordInFile = new SearchWordInFile(filePath);
        // DeleteFile deleteFile = new DeleteFile("deleted.txt");
        // FileSize fileSize = new FileSize(filePath);
        // FileEncryption fileEncryption = new FileEncryption(filePath, "destination.txt");
        // FileDecryption fileDecryption = new FileDecryption("destination.txt");

        // readFile.displayFileContent();                   // Display current file content
        // countWords.countWords();                         // Count words and display
        // writeToFile.writeToFile(sc);                     // Write the new content into the specified file path
        // appendToFile.appendToFile(sc);                   // Append the new content into the specified file path
        // copyFiles.copyFileContent();                     // Copy a content of a file to another file
        // searchWordInFile.searchWord(sc);                 // Search key word from a file
        // deleteFile.deleteFile();                         // Delete file in specified path
        // fileSize.getFileSize();                          // Get file size in byte
        // fileEncryption.encryptAndWriteToFile(3);         // Encrypt file
        // fileDecryption.decryptFileContent(3);            // Decrypt file


        sc.close();
    }

}
