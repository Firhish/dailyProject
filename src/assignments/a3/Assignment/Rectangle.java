package assignments.a3.Assignment;

public class Rectangle extends Shape {

    private double width;
    private double length;

    @Override
    double calculateArea() {
        return width * length;
    }
    
}
