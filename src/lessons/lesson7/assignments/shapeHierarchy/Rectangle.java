package lessons.lesson7.assignments.shapeHierarchy;

public class Rectangle extends  Shape {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }

    @Override
    public String toString() {
        String msg = String.format("area: %f perimeter: %f",getArea(),getPerimeter());
        return (super.toString() + msg);
    }
    
}
