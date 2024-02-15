package lessons.lesson7.abstractAndInterfaceDemo;

public class Rectangle extends Border implements Shape {

    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return (width * 2) + (length * 2);
    }
    
}
