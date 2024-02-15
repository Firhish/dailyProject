package lessons.lesson7.assignments.shapeHierarchy;

public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return String.format("color: %s filled: %b ",color,filled);   
    }

    
}
