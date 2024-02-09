package lessons.lesson5.abstractClass;

// An abstract class in Java cannot be instantiated. It's meant to be extended by subclasses,
// which provide implementations for the abstract methods defined in the abstract class.
// Abstract classes are appropriate when you have a class that serves as a template for other
// classes and provides common behavior or structure that subclasses can inherit and extend.
// Abstract class is used as a template for the class that extends it
// Abstract method means it need to be implement in the class that extends it
// Abstract class can have concrete method that will be inherited to all class that extends it

public abstract class Shape {

    // abstract method 
    public abstract double calculateArea();

    public void printText(){

        System.out.println("This is from abstract class!");

    }

}


