package lessons.lesson7.assignments.shapeSorting;

public class Triangle implements SortableShape {

    private double length;
    private double width;

    public Triangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (length * width)/2;
    }
}
