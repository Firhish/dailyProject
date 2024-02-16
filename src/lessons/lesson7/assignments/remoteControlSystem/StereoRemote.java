package lessons.lesson7.assignments.remoteControlSystem;

public class StereoRemote implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("On stereo...");
    }

    @Override
    public void powerOff() {
        System.out.println("Off stereo...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume stereo increases...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume stereo decreases...");
    }
    
}
