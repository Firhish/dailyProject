package lessons.lesson7.assignments.shapeHierarchy;

public class Square extends Shape {

    private double side;

    public Square(String color,boolean filled,double side){
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        String msg = String.format("area: %f perimeter: %f",getArea(),getPerimeter());
        return (super.toString() + msg);
    }
    
}
