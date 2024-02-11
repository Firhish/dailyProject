package quizzes.quiz2.q27;

class Parent{
    public String toString(){
        return "Inner ";
    }
}

class Child extends Parent{
    public String toString(){
        return super.toString().concat("Peace!");
    }
}

public class Test {
    public static void main(String[] args) {
        // if an obj passed as an arguments to sout method, it will automatically return default toString() method returns value (string with @)
        System.out.println(new Child());
    }
    
}
