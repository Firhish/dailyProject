package quizzes.quiz1.q2;

public class Test {
    static int i1 = 10;
    int i2 = 20;

    int add(){
        return this.i1 + this.i2; //line n1 (no error but preferable to declare it statically)
    }

    public static void main(String[] args) {
        System.out.println(new Test().add()); //line n2
    }
}
