package interviewfaq;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        String str = "aba";

        if(palindromeChecker(str)){
            System.out.println("Its a palindrome");
        } else{
            System.out.println("Its not a palindrome");
        }

    }

    static boolean palindromeChecker(String str) {

        boolean isPalindrome = true;

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
    
}
