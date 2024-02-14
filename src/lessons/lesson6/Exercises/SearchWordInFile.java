package lessons.lesson6.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWordInFile extends ReadFileHandler {

    public SearchWordInFile(String filePath) {
        super(filePath);
        // TODO Auto-generated constructor stub
    }

    public void searchWord(Scanner sc) throws FileNotFoundException, IOException {

        System.out.print("Enter a keyword to search: ");
        String key = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilePath()))) {

            String line;
            boolean res = false;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                
                // Check if the search word exists in the current line
                for (String word : words) {
                    if (word.equals(key)) {
                        res = true; // Word found
                    }
                }
            }

            if (res) {
                System.out.println("Keyword Found!");
            } else {
                System.out.println("Keyword not found");
            }
        }
    }

}
