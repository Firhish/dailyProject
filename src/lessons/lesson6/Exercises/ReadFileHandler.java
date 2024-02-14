package lessons.lesson6.Exercises;

public abstract class ReadFileHandler {

    private String filePath;

    public ReadFileHandler(String filePath){
        this.filePath = filePath;
    }
    
    public String getFilePath() {
        return filePath;
    }
}
