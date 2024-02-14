package lessons.lesson6.Exercises;

import java.io.File;

public class FileSize extends ReadFileHandler {

    public FileSize(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    public void getFileSize(){
        File file = new File(super.getFilePath());

        if(file.exists()){
            System.out.println("File length: " + file.length());
        } else{
            System.out.println("File not exist!");
        }
    }
    
}
