package quizzes.quiz1.q4;

public class Test {
    private static void div(){
        System.out.println(1/0);  //This error cause error in the runtime
    }

    public static void main(String[] args) {
        try{
            div();
        } 
        finally{
            System.out.println("FINALLY");   //Still will print this out but the programs end promptly
        }
    }
}
