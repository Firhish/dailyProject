package lessons.lesson7.assignments.remoteControlSystem;

public class Main {
    public static void main(String[] args) {
        StereoRemote stereoRemote = new StereoRemote();
        TVRemote tvRemote = new TVRemote();

        stereoRemote.powerOn();
        tvRemote.powerOn();
    }
    
}
