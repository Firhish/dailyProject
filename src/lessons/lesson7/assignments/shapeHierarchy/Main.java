package lessons.lesson7.assignments.shapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",true,2.0);
        Square square = new Square("blue",true,2.0);
        Rectangle rectangle = new Rectangle("blue",true,2.0,3.0);
        
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
    
}
