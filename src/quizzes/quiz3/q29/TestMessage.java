package quizzes.quiz3.q29;

class Message{
    String msg = "LET IT GO!";
    public void print(){
        System.out.print(msg);
    }
}

public class TestMessage {

    public static void change(Message m){
        m.msg = "NEVER LOOK BACK!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();                  // LET IT GO!
        change(obj);                  // obj.msg = NEVER LOOK BACK!
        obj.print();                  // NEVER LOOK BACK!
        
    }
    
}
