package lessons.lesson6.Exercises;

import java.io.File;

public class DeleteFile extends ReadFileHandler {

    public DeleteFile(String filePath) {
        super(filePath);
        //TODO Auto-generated constructor stub
    }

    public void deleteFile(){
        File file = new File(super.getFilePath());
        if(file.delete())
            System.out.println("The file is successfully deleted");
        else
            System.out.println("File deletion failed");
        
    }
    
}
