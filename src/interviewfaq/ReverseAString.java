package interviewfaq;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "hello";
        reverse(str);
        
    }

    static void reverse(String str){

        String temp = "";

        for (int i = 0; i < str.length(); i++) {temp += str.charAt(str.length() - 1 - i);} // start from index 0

        for (int i = str.length() - 1; i >= 0; i--) {temp += str.charAt(i);}               // start from index length - 1

        System.out.println(temp);

    }
    
}
