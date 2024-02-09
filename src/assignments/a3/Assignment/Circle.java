package assignments.a3.Assignment;

public class Circle extends Shape {

    private final double Pi  = 3.141;
    private double radius;

    @Override
    double calculateArea() {
        return Pi * Math.pow(radius, 2);
    }
    
}
