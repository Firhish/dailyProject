package lessons.lesson7.abstractAndInterfaceDemo;

public class Circle extends Border implements Shape, Fill {

    private final double PI = 3.141;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
    
}
