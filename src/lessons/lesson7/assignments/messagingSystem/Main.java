package lessons.lesson7.assignments.messagingSystem;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        String msg = "hello world";

        email.sendMessage(msg);
        sms.sendMessage(msg);
    }
    
}
