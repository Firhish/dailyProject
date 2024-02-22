package quizzes.quiz3.q35;

public class Test{
    public static void main(String[] args) {
        // java does some background task, if value of int literal can be easily fit to byte primitive type (-128 to 127), then int literal is implicitly casted to byte type.
        // But if you specify any out of range value then it would not be allowed
        // byte b1 = (byte)10;
        byte b1 = 10;

        // byte type (8 bits) can be easily assigned to int type (32 bits).
        int i1 = b1;

        // expression on right hand side (i1) is neither a withing range literal value nor constant expression
        // byte b2 = i1;

        // System.out.println(b1 + i1 + b2);
    }
}