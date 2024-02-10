package quizzes.quiz1.q16;
public class Test {
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        int k = 0;

        //A,B,C is label for each loops to ease in flow controlling

        A: while(true){
            
            i++;
            B: while(true){
                j--;
                C: while(true){
                    k += i + j;      // k = k + i + j
                    System.out.printf(" i: %d, j: %d, k: %d",i,j,k);
                    if(i==j)
                        break A;
                    else if(i > j)
                        continue A;
                    else
                        continue B;
                }
            }
        }
        System.out.println(k);
    }

}
