package lessons.lesson7.assignments.vehicleInterface;

public class Car implements Vehicle {

    private double currSpeed;

    public Car(){
        this.currSpeed = 0;
    }

    @Override
    public void start() {
        System.out.println("Car starts...");
    }

    @Override
    public void stops() {
        System.out.println("Car stops...");
        this.currSpeed = 0;
    }

    @Override
    public void accelerate(double speed) {
        this.currSpeed += speed;
        System.out.println("Car speed increases to " + this.currSpeed);
    }

    @Override
    public void brake(double speed) {
        this.currSpeed -= speed;
        System.out.println("Car speed decreases to " + this.currSpeed);
    }
    
}
