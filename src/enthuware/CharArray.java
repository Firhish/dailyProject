package enthuware;

public class CharArray {
    public static void main(String[] args) {
        String myStr = "good";
        char[] charArr = {'g','o','o','d'};

        String newStr = null;        
        
        for(char ch : charArr){
            newStr += ch;
        }

        // newStr = new String(charArr);  // Assigned a char array into String obj

        System.out.println(newStr);

    }
    
}
