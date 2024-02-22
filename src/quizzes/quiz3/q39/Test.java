package quizzes.quiz3.q39;

public class Test {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; System.out.print(i)){
            i++;
            inner: for(int j = 0; j < 3; System.out.print(j)){
                if(i > ++j){
                    break outer;
                }
            }
        }
    }
    
}

// 1 2 3 1
// j j j i
