package lessons.lesson7.assignments.shapeSorting;

public class Main {
    public static void main(String[] args) {
        
        SortableShape circle = new Circle(2);
        SortableShape rectangle = new Rectangle(2, 3);
        SortableShape triangle = new Triangle(2, 3);

        SortableShape[] arrShapes = new SortableShape[]{circle,rectangle,triangle}; 
        
        ShapeSorter.sort(arrShapes);
    }
}
