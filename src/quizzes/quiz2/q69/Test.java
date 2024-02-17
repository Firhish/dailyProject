package quizzes.quiz2.q69;


class Message{
    // package private
    String msg = "Happy New Year!";

    public void print(){
        System.out.println(msg);
    }
}

public class Test {
    
    public static void change(Message m){
        // can access from here
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
    
}
