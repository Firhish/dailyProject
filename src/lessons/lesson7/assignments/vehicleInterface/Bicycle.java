package lessons.lesson7.assignments.vehicleInterface;

public class Bicycle implements Vehicle {

    private double currSpeed;

    public Bicycle(){
        this.currSpeed = 0;
    }

    @Override
    public void start() {
        System.out.println("Bicycle starts...");
    }

    @Override
    public void stops() {
        System.out.println("Bicycle stops...");
    }

    @Override
    public void accelerate(double speed) {
        this.currSpeed += speed;
        System.out.println("Bicycle speed increases to " + this.currSpeed);
    }

    @Override
    public void brake(double speed) {
        this.currSpeed -= speed;
        System.out.println("Bicycle speed decreases to " + this.currSpeed);
    }
    
}