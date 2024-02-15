package lessons.lesson7.assignments.messagingSystem;

public class SMS implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sent by SMS");
    }
    
}
