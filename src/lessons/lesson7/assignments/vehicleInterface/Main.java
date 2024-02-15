package lessons.lesson7.assignments.vehicleInterface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.accelerate(300);
        car.brake(50);
        car.stops();

        bicycle.start();
        bicycle.accelerate(20);
        bicycle.brake(10);
        bicycle.stops();
    }
    
}
