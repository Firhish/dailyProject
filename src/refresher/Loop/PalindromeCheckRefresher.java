package refresher.Loop;

public class PalindromeCheckRefresher {

    public static void main(String[] args) {

        String str = "abbbba";
        new PalindromeCheckRefresher().method2(str);

        
        
    }

    void method1(String str){

        char[] splittedStr = str.toCharArray();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < splittedStr.length; i++) {

            sb.append(splittedStr[splittedStr.length - 1 - i]);
            
        }

        if (str.equals(sb.toString())) {

            System.out.println("Is a palindrome"); 

        } else{

            System.out.println("Is not a palindrome");

        }

    }

    void method2(String str){

        int left = 0;
        int right = str.length() - 1;
        boolean result = true;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                result = false;
                break;
            }
            left++;
            right--;
        }

        if (result) {

            System.out.println("Is a palindrome"); 

        } else{

            System.out.println("Is not a palindrome");

        }



    }


    
}
