package lessons.lesson2;

public class StringHandler {

    private String str;

    public StringHandler(String str){
        this.str = str;
    }

    public String getStr(){
        return this.str;
    }

    public void setStr(String str){
        this.str = str;
    }


    @Override
    public String toString() {
       return this.str;
    }
    
}
