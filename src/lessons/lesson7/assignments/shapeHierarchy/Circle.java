package lessons.lesson7.assignments.shapeHierarchy;

public class Circle extends Shape {

    private double radius;

    public Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String msg = String.format("area: %f perimeter: %f",getArea(),getPerimeter());
        return (super.toString() + msg);
    }
    
}
