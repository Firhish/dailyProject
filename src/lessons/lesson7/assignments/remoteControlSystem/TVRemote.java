package lessons.lesson7.assignments.remoteControlSystem;

public class TVRemote implements RemoteControl{

    @Override
    public void powerOn() {
        System.out.println("On TV...");
    }

    @Override
    public void powerOff() {
        System.out.println("Off TV...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume TV increases...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume TV decreases...");
    }
    
}
