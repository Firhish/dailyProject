package quizzes.quiz1.q17;

public class Test {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"%","$$"},{"***","@@@@","####"}};
        for(String[] innerArr : arr){
            for(String s : innerArr){
                System.out.println(s);
                if(s.length() == 4){
                    break; // this break is a catch for this q, since based on the array value, it will never be accessed
                }
            }
            break; // this break will make sure the second array in arr will never be read since it breaks the outer loop
        }
    }
    
}
