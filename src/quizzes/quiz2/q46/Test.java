package quizzes.quiz2.q46;

class Parent{
    int i = 10;
    Parent(int i){
        super();
        this.i = i;
    }
}

class Child extends Parent{
    int j = 20;

    Child(int j){
        super(0);
        this.j = j;
    }

    Child(int i,int j){
        // A constructor should have super(...) or this(...) but not both.
        // super(i);
        this(j);
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child(1000,2000);
        System.out.println(child.i + ":" + child.j);
    }
    
}
