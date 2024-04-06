package enthuware;

public class NullPointerInArr {

    public static void main(String[] args) {
        
        String strArr[] = new String[2];
        strArr[0] = "ayam";

        for (String string : strArr) {
            // System.out.println(string);
            
            string = string.concat(" goreng");
            System.out.println(string);
        }
    }
    
}
