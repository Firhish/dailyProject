package assignments.a3.Polymorphism;

public class Circle extends Shape {

    private final double PI = 3.141;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return PI * Math.pow(radius, 2);
    } 
    
}
